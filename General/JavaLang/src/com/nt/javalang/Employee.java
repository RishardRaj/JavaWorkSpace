package com.nt.javalang;

public class Employee {
private EmployeePk employeePk;
public EmployeePk getEmployeePk() {
	return employeePk;
}
public void setEmployeePk(EmployeePk employeePk) {
	this.employeePk = employeePk;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public String getEphNo() {
	return ephNo;
}
public void setEphNo(String ephNo) {
	this.ephNo = ephNo;
}
private String empAddress;
private String ephNo;
}
