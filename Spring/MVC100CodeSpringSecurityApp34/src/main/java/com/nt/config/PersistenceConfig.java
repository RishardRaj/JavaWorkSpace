package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class PersistenceConfig {
	
	@Bean(name="ds")
	public DataSource getDataSource(){
		DataSource ds=null;
		JndiDataSourceLookup lookup=null; 
		lookup=new JndiDataSourceLookup();
		ds=lookup.getDataSource("java:/comp/env/DsJndi");
		return ds;
		
	}

}
