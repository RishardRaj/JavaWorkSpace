package com.nt.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootConfig;
import com.nt.config.WebMvcAppConfig;

public class AppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebMvcAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"*.htm"};
	}

}
