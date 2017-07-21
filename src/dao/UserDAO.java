package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.User;

public class UserDAO {

	// データソース
	DataSource ds = null;
	// データベース情報
	Connection con = null;
	// プリコンパイル用のステートメント
	PreparedStatement stmt = null;
	// SELECTの結果を格納するResultSet
	ResultSet rs = null;

	/**
	 * データベースへの接続処理を行うメソッド
	 *
	 * @return コネクション情報
	 */
	public Connection connection() throws Exception {

		// データソースがなければ、context.xmlから読み込んで設定する
		if (ds == null) {
			ds = (DataSource) (new InitialContext()).lookup("java:comp/env/jdbc/MySQL");
		}
		con = ds.getConnection();

		return con;
	}

	/*
	 * データベースからの切断処理を行うメソッド
	 */
	public void close() throws Exception {
		// データベースに接続されていれば、切断する
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}

	// ログインユーザーの確認
	public User getUser(int userid, int password) {
		// ▼▼List (大きさが決まっていない配列のようなもの) 、メッセージ格納用変数 準備
		User ur = new User();
		try {

			// DB接続
			connection();

			// SQL文設定の準備・SQL文の実行
			String sql = "SELECT * FROM user WHERE userid=? AND password=?;";
			stmt = con.prepareStatement(sql); // sql文をプリコンパイルした状態で保持
			stmt.setInt(1, userid);
			stmt.setInt(2, password);
			rs = stmt.executeQuery();// sql文を実行

			rs.next();

			ur.setUserid(rs.getInt("userid"));
			ur.setT_flg(rs.getInt("t_flg"));

		} catch (Exception e) {
			// 認証失敗
			ur = null;
		} finally {
			try {
				close();
			} catch (Exception e) {

			}
		}
		return ur;
	}


}
