package com.nt.beans;

public class StudentInfo {
	private int sno;
	private String sname;
	private AddressInfo  addrsInfo;
	
	public StudentInfo() {
		System.out.println("StudentInfo::0-param constructor");
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddrsInfo(AddressInfo addrsInfo) {
		this.addrsInfo = addrsInfo;
	}
	@Override
	public String toString() {
		return "SudentInfo [sno=" + sno + ", sname=" + sname +",addrsInfo="+addrsInfo+"]";
	}
    
}
