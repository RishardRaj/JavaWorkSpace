package com.nt.aspect;

import com.nt.dao.AuthenticationDAO;

public class AuthenticationManager {
	private ThreadLocal<UserDetails> threadLocal=new ThreadLocal<UserDetails>();
	private AuthenticationDAO   dao;

	public void setDao(AuthenticationDAO dao) {
		this.dao = dao;
	}
	
	public void signIn(String user,String pwd){
		UserDetails details=null;
		//keep  in ThreadLocal
		details=new UserDetails();
		details.setUsername(user);
		details.setPassword(pwd);
		threadLocal.set(details);
	}
	
	public void signOut(){
		threadLocal.remove();
	}
	
	public boolean authenticate(){
		int count=0;
		UserDetails details=null;
		//get UserDetails obj (logged username,password)
		 details=threadLocal.get();
		//use DAO
		 count=dao.validate(details);
		 if(count==0)
			 return false;
		 else
			 return true;
	}//method
}//class
