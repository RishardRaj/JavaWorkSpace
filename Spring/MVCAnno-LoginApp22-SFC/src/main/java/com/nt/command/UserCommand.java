package com.nt.command;

import java.util.Date;

public class UserCommand {
	private String uname;
	private String pwd;
	private String domain;
	private Date dor;
	public Date getDor() {
		return dor;
	}
	public void setDor(Date dor) {
		this.dor = dor;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
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
	@Override
	public String toString() {
		return "UserCommand [uname=" + uname + ", pwd=" + pwd + ", domain=" + domain + ", dor=" + dor + "]";
	}
	
	

}
