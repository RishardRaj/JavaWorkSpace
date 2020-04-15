package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
@Repository("bankDAO")
public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
	private static final String DEPOSITE_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";
	
	@Resource
	private JdbcTemplate jt;

	
	public int withdraw(int srcAcno, float amt) {
        int cnt=0; 
		//excute the query
		  cnt=jt.update(WITHDRAW_QUERY,amt,srcAcno);
		return cnt;
	}

	public int deposite(int destAcno, float amt) {
		int cnt=0;
		 //execute the Query
		  cnt=jt.update(DEPOSITE_QUERY,amt,destAcno);
			return cnt;
	}

}
