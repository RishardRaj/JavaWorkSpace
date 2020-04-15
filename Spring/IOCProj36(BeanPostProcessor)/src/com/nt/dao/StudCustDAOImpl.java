package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public class StudCustDAOImpl implements StudCustDAO {

	@Override
	public int insertCustomer(CustomerBO bo) {
	    System.out.println("inserting Customer with "+bo.getId()+" having doj="+bo.getDoj());
		return 1;
	}
	
	@Override
	public int insertStudent(StudentBO bo) {
	    System.out.println("inserting Student "+bo.getId()+" having doj="+bo.getDoj());
		return 1;
	}

}
