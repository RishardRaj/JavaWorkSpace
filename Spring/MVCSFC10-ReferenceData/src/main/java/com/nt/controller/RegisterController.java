package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegisterCmd;

public class RegisterController extends SimpleFormController {
	

	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		 RegisterCmd cmd=null;
		//create and Command class obj
		 cmd=new RegisterCmd();
		 cmd.setName("Raja");
		 return cmd;
	}
	
	@Override
	public Map referenceData(HttpServletRequest request) throws Exception {
		 Map<String,List<String>> map=null;
		 List<String> courses=null;
		//prepare additional data for courses
		 map=new HashMap<String,List<String>>();
		 courses=new ArrayList<String>();
		 courses.add("java"); courses.add(".net");
		 courses.add("andriod"); courses.add("hadoop");
		 map.put("crsList",courses);
		  return map;
	 }
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		return new ModelAndView("result");
	}

}
