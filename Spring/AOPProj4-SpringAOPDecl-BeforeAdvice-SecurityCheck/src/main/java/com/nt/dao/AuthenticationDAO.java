package com.nt.dao;

import com.nt.aspect.UserDetails;

public interface AuthenticationDAO {
	
	public int validate(UserDetails  details);

}
