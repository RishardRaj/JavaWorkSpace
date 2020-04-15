package com.nt.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("depositeDAO")
public class DepositeDAOImpl implements DepositeDAO {
	private static final String DEPOSITE_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?"; 
	
	@Resource(name="mysqlJT")
	private JdbcTemplate mysqlJt;
	
	
	@Override
	public int depoiste(int destAcno, int amount) {
		  int count=0;
		     count=mysqlJt.update(DEPOSITE_QUERY,amount,destAcno);
			return count;
	}//method
}//class
