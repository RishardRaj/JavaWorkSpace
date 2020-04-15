package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.nt.controller")
public class WebMvcAppConfig {

	@Bean
	public HandlerMapping createHandlerMapping(){
		SimpleUrlHandlerMapping mapping=null;
		Properties props=null;
		mapping=new SimpleUrlHandlerMapping();
		props=new Properties();
		props.put("/home.htm","pvc1");
		mapping.setMappings(props);
		return mapping;
	}
	
	@Bean(name="pvc1")
	public Controller createParameterizableViewController(){
		ParameterizableViewController pvc=null;
		pvc=new ParameterizableViewController();
		pvc.setViewName("home");
		return pvc;
	}
	
	@Bean
	public ViewResolver createIRVResolver(){
		InternalResourceViewResolver ivr=null;
		ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/pages/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
	
	
}
