package com.nt.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource(value="classpath:com/nt/commons/jdbc.properties")
public class PersistenceConfig {
	@Resource
  private  Environment env;	

	/*@Bean(name="bds")
	public static  DataSource createDataSource(){
		BasicDataSource ds=null;
		InputStream is=null;
		Properties props=null;
		try{
		//locate properties file and get properites
		is=new FileInputStream("D:\\ntsp57-MVC\\MVC100LoginApp-SFC31\\src\\main\\java\\com\\nt\\commons\\jdbc.properties");
		props=new Properties();
		props.load(is);
		}//try
		catch(Exception e){
			e.printStackTrace();
		}
		
		ds=new BasicDataSource();
		ds.setDriverClassName(props.getProperty("jdbc.driver"));
		ds.setUrl(props.getProperty("jdbc.url"));
		ds.setUsername(props.getProperty("db.user"));
		ds.setPassword(props.getProperty("db.pwd"));
		ds.setInitialSize(10);
		ds.setMaxTotal(30);
		return ds;
	}*/
	
	@Bean(name="bds")
	public   DataSource createDataSource(){
		BasicDataSource ds=null;
				
		ds=new BasicDataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		ds.setUrl(env.getRequiredProperty("jdbc.url"));
		ds.setUsername(env.getRequiredProperty("db.user"));
		ds.setPassword(env.getRequiredProperty("db.pwd"));
		ds.setInitialSize(10);
		ds.setMaxTotal(30);
		return ds;
	}
	
	
	/*@Bean
	public static DataSource createJndiDataSource(){
		JndiDataSourceLookup dsLookup=null;
		DataSource ds=null;
		dsLookup=new JndiDataSourceLookup();
		ds=dsLookup.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}*/
	
	
	@Bean
	public JdbcTemplate createJdbcTemplate(){
		JdbcTemplate template=null;
		template=new JdbcTemplate();
		template.setDataSource(createDataSource());
		return template;
	}
	


}
