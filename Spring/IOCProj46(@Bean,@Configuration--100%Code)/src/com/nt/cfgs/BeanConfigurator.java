package com.nt.cfgs;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.nt.beans.Student;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class BeanConfigurator {
	
	public BeanConfigurator() {
		System.out.println("BeanConfigurator:constructor");
	}
	
	@Bean(name="dt")
	public Calendar CreateDateBean(){
		System.out.println("createDateBean");
		return Calendar.getInstance();
	}//method
	
	@Bean(name="st")
	@Lazy
	public Student  createStudent(){
		System.out.println("createStudent()");
		return new Student();
	}//method

}//class
