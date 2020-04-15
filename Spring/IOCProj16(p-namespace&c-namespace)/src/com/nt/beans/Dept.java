package com.nt.beans;

public class Dept {
	private int deptno;
	private String deptName;
	private Emp  emp;

	public Dept(int deptno, String deptName, Emp emp) {
		this.deptno = deptno;
		this.deptName = deptName;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptName=" + deptName + ", emp=" + emp + "]";
	}
	
	
	
}
