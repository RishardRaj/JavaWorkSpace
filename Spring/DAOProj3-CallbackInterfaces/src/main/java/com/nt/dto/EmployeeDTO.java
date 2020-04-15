package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int no;
	private String name;
	private String job;
	private float salary;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [no=" + no + ", name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}
	
}
