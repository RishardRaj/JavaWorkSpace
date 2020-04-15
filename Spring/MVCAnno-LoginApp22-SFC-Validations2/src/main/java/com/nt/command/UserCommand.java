package com.nt.command;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserCommand {
	@NotEmpty(message="username can not be empty")
	@Size(min=4,max=6)
	private String uname;
	@NotEmpty
	@Size(min=4,max=6)
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
