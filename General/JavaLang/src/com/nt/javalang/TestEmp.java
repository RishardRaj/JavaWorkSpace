package com.nt.javalang;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		EmployeePk employeePk = new EmployeePk();
		employeePk.setEid(2242);
		employeePk.setEname("gsgassga");
		employee.setEmployeePk(employeePk);
	}

}
