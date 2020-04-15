package com.nt.dao;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.UserBO;

@Named
public class LoginDAOImpl implements LoginDAO{
	private static final String AUTHENTICATION_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	@Resource
	private JdbcTemplate jt;

	@Override
	public int validate(UserBO bo) {
	     int count=0;
	    count=jt.queryForObject(AUTHENTICATION_QUERY,Integer.class,bo.getUname(),bo.getPwd());
		return count;
	}//validate(-)
}//class
