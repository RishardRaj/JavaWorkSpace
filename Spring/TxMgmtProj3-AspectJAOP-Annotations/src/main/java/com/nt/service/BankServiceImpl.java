package com.nt.service;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;
@Service("bankService")
public class BankServiceImpl implements BankService {
	@Resource
   private BankDAO  dao;
   

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,
			                          timeout=40,rollbackFor=SQLException.class)
	public boolean transferMoney(int srcAcno, int destAcno, float amt)throws SQLException {
	    int result1=0,result2=0; 
	
		//perform withdrawm operation
	    result1=dao.withdraw(srcAcno, amt);
		//perform deposite operation
	    result2=dao.deposite(destAcno, amt);
	    
	    if(result1==0 || result2==0)
	    	throw new SQLException();
	    else
	    	return true;
	}//method
}//class
