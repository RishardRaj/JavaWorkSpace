package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dao.ListEmpsDAO;
import com.nt.dto.EmployeeDTO;

public class ListEmpsServiceImpl implements ListEmpsService {
	private ListEmpsDAO dao=null;

	public void setDao(ListEmpsDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> getAllEmps() {
		 List<EmployeeDTO> listDTO=null;
		 List<EmployeeBO> listBO=null;
		 EmployeeDTO dto=null;
 		//use DAO
		 listBO=dao.retriveEmps();
		 //convert ListBO to listDTO
		 listDTO=new ArrayList<EmployeeDTO>();
		 for(EmployeeBO bo:listBO){
			 dto=new EmployeeDTO();
			 dto.setNo(bo.getNo());
			 dto.setName(bo.getName());
			 dto.setJob(bo.getJob());
			 dto.setSalary(bo.getSalary());
			 listDTO.add(dto);
		 }//for
		return listDTO;
	}//method

}//class
