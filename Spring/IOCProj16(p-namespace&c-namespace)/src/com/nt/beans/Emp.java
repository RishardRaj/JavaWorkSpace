package com.nt.beans;

import java.util.Date;

public class Emp {
	private int eid;
	private String ename;
	private Date  dob;
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dob=" + dob + "]";
	}
 
}
