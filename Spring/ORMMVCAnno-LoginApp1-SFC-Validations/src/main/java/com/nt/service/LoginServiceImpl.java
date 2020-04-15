package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserHLO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Named
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDAO dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true,transactionManager="hbTxMgmr")
	public String authenticate(UserDTO dto) {
		UserHLO bo=null;
		long count=0;
		//convert DTO to BO
		bo=new UserHLO();
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
