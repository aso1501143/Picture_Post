/*
 * name:Comments
 * data:2017/07/11
 * author:hiroyuki matsuda
 */

package model;

import java.io.Serializable;

public class Comments implements Serializable {

	private int commentid;
	private int postid;
	private String comment = "";

	//アクセッサ
	public Comments(){}
	public Comments(int commentid,int postid, String comment){
		this.commentid = commentid;
		this.postid = postid;
		this.comment = comment;
	}

	public int getCommentid() {
		return commentid;
	}

	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getCommnet() {
		return comment;
	}

	public void setCommnet(String comment) {
		this.comment = comment;
	}




}
