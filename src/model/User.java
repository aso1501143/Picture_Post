/*
 * name:User
 * data:2017/07/11
 * author:hiroyuki matsuda
 */

package model;

import java.io.Serializable;

public class User implements Serializable {
	
	private int userid;
	private int password;
	private int t_flg;
	
	//アクセッサ
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public int getT_flg() {
		return t_flg;
	}
	
	public void setT_flg(int t_flg) {
		this.t_flg = t_flg;
	}
	
	

}
