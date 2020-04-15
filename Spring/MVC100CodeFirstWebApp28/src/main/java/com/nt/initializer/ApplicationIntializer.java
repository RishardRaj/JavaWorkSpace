package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootConfig;
import com.nt.config.WebMvcConfig;
public class ApplicationIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		System.out.println("onStartup(-) method");
		AnnotationConfigWebApplicationContext rootContext=null,webContext=null;
		ContextLoaderListener listener=null;
		DispatcherServlet servlet=null;
		//create RootContext container
		rootContext=new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		//create ContextLoaderListener
		listener=new ContextLoaderListener(rootContext);
		//register Lister with container
		context.addListener(listener);
		
		//create WebApplcationContext container
		webContext=new AnnotationConfigWebApplicationContext();
		webContext.register(WebMvcConfig.class);
		//create DispatcherServlet adding WebAppContext container
		servlet=new DispatcherServlet(webContext);
		//register DispatcherServlet with Container
		ServletRegistration.Dynamic registration=context.addServlet("dispatcher",servlet);
		registration.setLoadOnStartup(2);
		registration.addMapping("*.htm");
	}
}
