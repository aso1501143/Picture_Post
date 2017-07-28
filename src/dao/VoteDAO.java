package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class VoteDAO {

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

	// insert
	public void insertVote(int voteid,int userid) {

		try {
			//
			connection();

			// SQL
			String sql = "INSERT INTO vote(voteid,userid) VALUES(?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, voteid);
			stmt.setInt(2, userid);
			stmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			try {
				close();
			} catch (Exception e) {

			}
		}
	}

}
