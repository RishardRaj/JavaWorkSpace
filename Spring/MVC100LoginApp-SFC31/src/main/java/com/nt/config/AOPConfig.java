package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class AOPConfig {
	

	/*@Bean
	public DataSourceTransactionManager createTxManager(){
		DataSourceTransactionManager dsTxMgmr=null;
		dsTxMgmr=new DataSourceTransactionManager();
		dsTxMgmr.setDataSource(PersistenceConfig.createDataSource());
		return dsTxMgmr;
	}
*/
	

}
