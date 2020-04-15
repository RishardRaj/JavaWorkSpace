package com.nt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Resource
	private WithdrawDAO  wDAO;
	@Resource
	private DepositeDAO  dDAO;

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public boolean transferMoney(int srcAcno, int destAcno, int amount) {
		int result1=0;
		int result2=0;
	   //peform withdraw
		result1=wDAO.withdraw(srcAcno, amount);
		result2=dDAO.depoiste(destAcno, amount);
		if(result1==0 || result2==0)
			throw new RuntimeException();
		return true;
	}//method
}//class
