package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.DBOperationsDAO;

public class DBOperationsServiceImpl implements DBOperationsService {
   private DBOperationsDAO dao;
   
	public void setDao(DBOperationsDAO dao) {
	this.dao = dao;
}

	@Override
	public String registerEmp(int no, String name, String desg, int salary) {
		int cnt=0;
		//use DAO
	    cnt=dao.insertEmp(no, name, desg,salary);
		if(cnt==0)
			return "registration failed";
		else
			return "registration succeded with number"+no;
	}

	@Override
	public int getSalary(int no) {
		int salary=0;
		//use dao
		salary=dao.fetchEmpSalary(no);
		return salary;
	}

	@Override
	public String hikeEmpSalary(int no, float percentage) {
		int salary=0;
		float newSalary=0.0f;
		int cnt=0;
		//get Emp salary
		salary=getSalary(no);
		//hike salary
		newSalary=salary+(salary*(percentage/100.0f));
		//use DAO
		cnt=dao.updateEmpSalary(no,Math.round(newSalary));
		if(cnt==0)
			return "Emp Salary is not hiked";
		else
			return "Emp Salary is  hiked-->New Salary is::"+newSalary;
	}

	@Override
	public Map<String, Object> getEmpDetails(int no) {
		Map<String,Object> map=null;
		//use DAO
		map=dao.fetchEmpDetails(no);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmpDetailsByDesg(String desg) {
		List<Map<String,Object>> list=null;
		//use DAO
		list=dao.fetchEmpDetailsbyDesg(desg);
		return list;
	}

	@Override
	public String fireEmp(int no) {
		int cnt=0;
	   //use DAO
		cnt=dao.deletEmp(no);
		if(cnt==0)
		   return "Emp not found to fire";
		else
			return "Emp found to fire";
	}//method

}//class
