package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.aspect.UserDetails;

public class AuthenticationDAOImpl implements AuthenticationDAO {
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int validate(UserDetails details) {
		int count=0;
		//perform authtication
		count=jt.queryForObject(AUTH_QUERY , Integer.class,details.getUsername(),details.getPassword());
		return count;
	}

}
