package com.nt.initializer;

import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMVCAppConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	  return new Class[]{RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[]{WebMVCAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	    
		return new String[]{"*.htm"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setLoadOnStartup(2);

	}

}
