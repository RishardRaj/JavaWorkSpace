package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
   private BankDAO  dao;
   
	public void setDao(BankDAO dao) {
	this.dao = dao;
}
	public boolean transferMoney(int srcAcno, int destAcno, float amt)throws RuntimeException {
	    int result1=0,result2=0; 
		//perform withdrawm operation
	    result1=dao.withdraw(srcAcno, amt);
		//perform deposite operation
	    result2=dao.deposite(destAcno, amt);
	    
	    if(result1==0 || result2==0)
	    	throw new RuntimeException();
	    else
	    	return true;
	}//method
}//class
