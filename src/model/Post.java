/*
 * name:Post
 * data:2017/07/11
 * author:hiroyuki matsuda
 */

package model;

import java.io.Serializable;

public class Post implements Serializable {
	
	private int postid;
	private String postname = "";
	private String postauthor = "";
	private String pass = "";
	
	//アクセッサ
	public int getPostid() {
		return postid;
	}
	
	public void setPostid(int postid) {
		this.postid = postid;
	}
	
	public String getPostname() {
		return postname;
	}
	
	public void setPostname(String postname) {
		this.postname = postname;
	}
	
	public String getPostauthor() {
		return postauthor;
	}
	
	public void setPostauthor(String postauthor) {
		this.postauthor = postauthor;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	

	
}
