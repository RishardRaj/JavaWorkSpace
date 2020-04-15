package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date>{
	 private int year;
	 private int month;
	 private int date;
	 //setters 
	 public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Date getObject(){
		System.out.println("getObject()");
	   return new Date(year-1900,month,date);
	  }
	  public Class getObjectType(){
		  System.out.println("getObjectType()");
	    return Date.class;
	   }
	  public  boolean isSingleton(){
		  System.out.println("isSingleTon()");
	   return true;
	   }
	}