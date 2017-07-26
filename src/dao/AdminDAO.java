package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Admin;


public class AdminDAO {

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

	public Admin getAdmin(String adminid, String passwd) {
		// ▼▼List (大きさが決まっていない配列のようなもの) 、メッセージ格納用変数 準備
		Admin am = new Admin();
		try {

			// DB接続
			connection();

			// SQL文設定の準備・SQL文の実行
			String sql = "SELECT * FROM admin WHERE adminid=? AND passwd=?;";
			stmt = con.prepareStatement(sql); // sql文をプリコンパイルした状態で保持
			stmt.setString(1, adminid);
			stmt.setString(2, passwd);
			rs = stmt.executeQuery();// sql文を実行

			rs.next();

			am.setAdminid(rs.getString("adminid"));


		} catch (Exception e) {
			// 認証失敗
			am = null;
		} finally {
			try {
				close();
			} catch (Exception e) {

			}
		}
		return am;
	}



}
