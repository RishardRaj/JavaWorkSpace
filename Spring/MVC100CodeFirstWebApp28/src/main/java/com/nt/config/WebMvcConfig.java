package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nt.controller")
public class WebMvcConfig {
	
	@Bean
   	public HandlerMapping  createHandlerMapping(){
		return new DefaultAnnotationHandlerMapping();
   	}
	
	@Bean
	public ViewResolver createViewResolver(){	
		InternalResourceViewResolver ivr=null;
		//create and ViewResolver
		ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/pages/");
		ivr.setSuffix(".jsp");
		return ivr;
	}

}
