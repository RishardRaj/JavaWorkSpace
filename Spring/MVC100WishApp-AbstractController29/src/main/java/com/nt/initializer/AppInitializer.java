package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootConfig;
import com.nt.config.WebMvcAppConfig;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext=null,webContext=null;
		ContextLoaderListener listener=null;
		DispatcherServlet servlet=null;
		ServletRegistration.Dynamic registration=null;
		//Create Rootcontianer
		rootContext=new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		//crete ContextLoaderListener
		listener=new ContextLoaderListener(rootContext);
		//addListener to Container
		context.addListener(listener);
		
		//Create WEbApplicationContext Context
		webContext=new AnnotationConfigWebApplicationContext();
		webContext.register(WebMvcAppConfig.class);
		//create DispatcherServlet
		servlet=new DispatcherServlet(webContext);
		//add Servlet to Container
		registration=context.addServlet("dispatcher",servlet);
		//enable LoadOnStartup
		registration.setLoadOnStartup(2);
		registration.addMapping("*.htm");
	}

}
