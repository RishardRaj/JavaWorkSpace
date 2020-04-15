package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.EmpSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

public class EmpSearchServiceImpl implements EmpSearchService {
	private EmpSearchDAO dao;

	public void setDao(EmpSearchDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<SearchResultDTO> process(SearchDTO dto) {
		List<SearchResultBO> listRBO=null;
		SearchBO bo=null;
		List<SearchResultDTO> listRDTO=null;
		SearchResultDTO rdto=null;
		//convert DTO to BO
		bo=new SearchBO();
		bo.setNo(dto.getNo());
		bo.setName(dto.getName());
		bo.setJob(dto.getJob());
		bo.setSalary(dto.getSalary());
		
		//use DAO
		listRBO=dao.search(bo);
		//convert listRBO to ListRDTO
		listRDTO=new ArrayList<SearchResultDTO>();
		for(SearchResultBO rbo:listRBO){
		  rdto=new SearchResultDTO();
		  rdto.setNo(rbo.getNo());
		  rdto.setName(rbo.getName());
		  rdto.setJob(rbo.getJob());
		  rdto.setSalary(rbo.getSalary());
		  rdto.setMgmrno(rbo.getMgmrno());
		  rdto.setDeptno(rbo.getDeptno());
		  listRDTO.add(rdto);
		}
		return listRDTO;
	}//method

}//class
