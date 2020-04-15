package com.nt.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	private static final String WITHDRAW_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?"; 
	@Resource(name="oraJT")
	private JdbcTemplate oraJt;

	@Override
	public int withdraw(int srcAcno, int amount) {
	     int count=0;
	     count=oraJt.update(WITHDRAW_QUERY,amount,srcAcno);
		return count;
	}

}
