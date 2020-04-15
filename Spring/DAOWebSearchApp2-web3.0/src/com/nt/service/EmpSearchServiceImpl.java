package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmpSearchDAO;

public class EmpSearchServiceImpl implements EmpSearchService {
	private EmpSearchDAO dao;

	public void setDao(EmpSearchDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Map<String, Object>> findEmpDetailsByDesgs(String[] desgs) {
		
		String cond="(";
		List<Map<String,Object>> list=null;
		//prepare condition
		for(int i=0;i<desgs.length;++i){
			if(i==desgs.length-1)  //for last element
				  cond=cond+"'"+desgs[i]+"')";
			else  //for other than last element
				  cond=cond+"'"+desgs[i]+"',";
		}//for
		//use DAO
		list=dao.getEmpDetailsByDesg(cond);
		return list;
	}//findEmpDetailsByDesg(-)
}//class
