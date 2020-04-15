package com.nt.cfgs;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.nt.dao","com.nt.service"})
@EnableTransactionManagement
public class AppConfig {
	
	@Bean(name="dbcpDs")
	public DataSource createDataSource(){
		 BasicDataSource ds=null;
		 //create and return Apache DBCP DataSource obj
		 ds=new BasicDataSource();
		 ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		 ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		 ds.setUsername("system");
		 ds.setPassword("manager");
		 return ds;
	}
	
	@Bean(name="jt")
	public JdbcTemplate  createJdbcTemplate(){
		JdbcTemplate jt=null;
		//create and return JdbcTemplate class obj
		jt=new JdbcTemplate();
		jt.setDataSource(createDataSource());
		return jt;
	}

	@Bean(name="dsTxMgmr")
	public PlatformTransactionManager createTxManager(){
		DataSourceTransactionManager txMgmr=null; 
		txMgmr=new DataSourceTransactionManager();
		txMgmr.setDataSource(createDataSource());
		return txMgmr;
	}
}//class


