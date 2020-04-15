package com.nt.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootConfig;
import com.nt.config.WebMvcConfig;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[]{WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"*.htm"};
	}

}
