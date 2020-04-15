package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("dbo")
public class DBOperations {
	@Value("${jdbc.driver}")
	private String driverClass;
	@Value("${jdbc.url}")
	private String url;
	@Value("${db.user}")
	private String dbuser;
	@Value("${db.pwd}")
	private String dbpwd;
	@Value("${java.vm.specification.vendor}")
	private String  vendor;
	
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDbuser() {
		return dbuser;
	}
	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}
	public String getDbpwd() {
		return dbpwd;
	}
	public void setDbpwd(String dbpwd) {
		this.dbpwd = dbpwd;
	}
	@Override
	public String toString() {
		return "DBOperations [driverClass=" + driverClass + ", url=" + url + ", dbuser=" + dbuser + ", dbpwd=" + dbpwd+" vendor="+vendor	+ "]";
	}
}
