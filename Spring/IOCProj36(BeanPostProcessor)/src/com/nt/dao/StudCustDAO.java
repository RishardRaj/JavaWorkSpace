package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public interface StudCustDAO {
	
	public  int  insertStudent(StudentBO bo);
	public  int  insertCustomer(CustomerBO bo);
	

}
