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
	private String commnet = "";
	
	//アクセッサ
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
		return commnet;
	}
	
	public void setCommnet(String commnet) {
		this.commnet = commnet;
	}
	
	
	

}
