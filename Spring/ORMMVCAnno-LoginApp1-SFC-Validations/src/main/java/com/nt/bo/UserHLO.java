package com.nt.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="userList")
@Entity

@NamedQuery(name="AUTH_QUERY",
 query="SELECT COUNT(*) FROM UserHLO WHERE UNAME=:un AND PWD=:pass")

public class UserHLO {
	@Id
	@Column(name="uname")
	private String uname;
	@Column(name="pwd")
	private String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
