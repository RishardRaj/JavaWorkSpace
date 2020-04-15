package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private  StudentDAO  dao;

	 //setter method for setter injection
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto)throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int count=0;
	  //writer b.logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(avg<35)
			result="fail";
		else
			result="pass";
		//prepare BO 
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		// use dAO
		count=dao.insert(bo);
		if(count==0)
			return dto.getSno()+"  student result:::"+result+" but registration failed";
		else
			return dto.getSno()+"  student result:::"+result+" and registration succedded";
	}//method

}//class
