package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private SimpleJdbcCall  sjc;

	public void setSjc(SimpleJdbcCall sjc) {
		this.sjc = sjc;
	}

	public StudentBO getStudentDetailsByNo(int no) {
		Map<String,Object> inParams=null;
		Map<String,Object> outParams=null;
		StudentBO bo=null;
	   //prepare InParams
		inParams=new HashMap<String,Object>();
		inParams.put("no", no);
		//set procedure name
		sjc.setProcedureName("P_GET_STUDENTS_BY_NO");
		//execute pl/sql procedure
		outParams=sjc.execute(inParams);
		System.out.println(outParams);
		//copy data into BO class object
		bo=new StudentBO();
		bo.setSno(no);
		bo.setSname((String)outParams.get("NAME"));
		bo.setSadd((String)outParams.get("ADDRS"));
		return bo;
	}

}
