package com.nt.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Resource
	private DataSource ds;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		
	  auth.jdbcAuthentication().dataSource(ds)
		.usersByUsernameQuery(
			"select uname,pwd,status from users where uname=?")
		.authoritiesByUsernameQuery(
			"select uname, role from users_roles where uname=?");
	}	
	
	//@Override
	protected void configure(HttpSecurity http) throws Exception {

	  http.authorizeRequests()
		.antMatchers("/profile.htm").access("hasRole('ROLE_USER')")
		.antMatchers("/phones.htm").access("hasRole('ROLE_ADMIN')")
		.and()
		  .formLogin()
		.and()
		  .logout().logoutSuccessUrl("/home.htm");
	}
	

}
