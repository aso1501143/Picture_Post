/*
 * name:Vote
 * data:2017/07/11
 * author:hiroyuki matsuda
 */

package model;

import java.io.Serializable;

public class Vote implements Serializable {
	
	private int postid;
	private int voteid;
	private int userid;
	
	//アクセッサ
	public int getPostid() {
		return postid;
	}
	
	public void setPostid(int postid) {
		this.postid = postid;
	}
	
	public int getVoteid() {
		return voteid;
	}
	
	public void setVoteid(int voteid) {
		this.voteid = voteid;
	}
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
		

}
