package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Comments;

public class CommentsDAO {

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

	// comment受け取り
	public ArrayList<Comments> getComment() {

		ArrayList<Comments> commentList = new ArrayList<Comments>();

		try {
			//
			connection();

			// SQL
			String sql = "SELECT commentid,postid,comments FROM comments";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("commentid");
				int pid = rs.getInt("postid");
				String text = rs.getString("comments");
				Comments comments = new Comments(id, pid, text);
				commentList.add(comments);
			}
		} catch (Exception e) {
			// コメントがない場合の処理
			e.printStackTrace();
			return null;
		} finally {
			try {
				close();
			} catch (Exception e) {

			}
		}
		return commentList;
	}

	// insert
	public void insertComment(int postid, String comment) {

		try {
			//
			connection();

			// SQL
			String sql = "INSERT INTO comments(postid,comments) VALUES(?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, postid);
			stmt.setString(2, comment);
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
