/*
 * name:Admin
 * data:2017/07/11
 * author:hiroyuki matsuda
 */

package model;

import java.io.Serializable;

public class Admin implements Serializable {
	
	//デフォルトコンストラクタ
	private String adminid = "";
	private String passwd = "";
	
	//アクセッサ
	public String getAdminid() {
		return adminid;
	}
	
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	

}
