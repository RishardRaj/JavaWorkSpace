package com.nt.cfgs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.service,com.nt.dao,com.nt.controller")
public class BeanConfigurator {
	
	

	@Bean(name="drds")
	public DataSource createDataSource(){
		DriverManagerDataSource ds=null;
		InputStream is=null;
		Properties props=null;
		try{
		//get jdbc properies from DBDetails.properties file
		is=new FileInputStream("src/com/nt/commons/DBDetails.properties");
		props=new Properties();
		props.load(is);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		//create DataSoruce obj
		ds=new DriverManagerDataSource();
		ds.setDriverClassName(props.getProperty("jdbc.driver"));
		ds.setUrl(props.getProperty("jdbc.url"));
		ds.setPassword(props.getProperty("jdbc.pwd"));
		ds.setUsername(props.getProperty("jdbc.user"));
		return ds;
	}
	

}
