package com.nt.beans;

import java.util.Date;

public class PersonProfile {
	private int pid;
	private String pname;
	private String addrs;
	private Date dob;
	public PersonProfile(int pid, String pname, String addrs, Date dob) {
		this.pid = pid;
		this.pname = pname;
		this.addrs = addrs;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "PersonProfile [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", dob=" + dob + "]";
	}
	
	

}
