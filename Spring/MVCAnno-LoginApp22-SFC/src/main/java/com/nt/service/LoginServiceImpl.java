package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Named
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDAO dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true,transactionManager="dsTxMgmr")
	public String authenticate(UserDTO dto) {
		UserBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new UserBO();
		bo.setUname(dto.getUname());
		bo.setPwd(dto.getPwd());
		//use DAO
		count=dao.validate(bo);
		if(count==0)
			return "InValid Credentials";
		else
			return "Valid Credentials";
	}//authenticate(-)

}//class
