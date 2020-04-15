package com.nt.beans;

public class StudentDetails {
	private int sno;
	private String sname;
	private float avg;
	public StudentDetails(int sno, String sname, float avg) {
	   System.out.println("StudentDetials:3-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "StudentDetails [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}

	
}
