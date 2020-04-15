package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;
import com.nt.dao.StudCustDAO;

public abstract class StudCustServiceImpl implements StudCustService {
	private StudCustDAO dao;
	
	public void setDao(StudCustDAO dao) {
		this.dao = dao;
	}

	 public abstract StudentBO createStudentBO();
	 public abstract CustomerBO createCustomerBO();
	
	@Override
	public String processStudent(int id, String name, String course) {
		StudentBO bo=null;
		int result=0;
		//get BO
		bo=createStudentBO();
		bo.setId(id); bo.setCourse(course); bo.setName(name);
		//use dao
		result=dao.insertStudent(bo);
	   if(result==0)
		   return "Registration failed";
	   else
		   return "Registration succededd";
	}

	@Override
	public String processCustomer(int id, String name, float billAmt) {
		CustomerBO bo=null;
		int result=0;
		//get BO
		bo=createCustomerBO();
		bo.setId(id); bo.setBillAmt(billAmt); bo.setName(name);
		//use dao
		result=dao.insertCustomer(bo);
	   if(result==0)
		   return "Registration failed";
	   else
		   return "Registration succededd";
	}

}
