package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegisterCmd;

public class RegisterController extends SimpleFormController {
	
	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
	  SimpleDateFormat sdf=null;	
	  sdf=new SimpleDateFormat("dd-MM-yyyy");
	  binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		RegisterCmd cmd=null;
		ModelAndView mav=null;
		System.out.println("onSubmit(-,-,-,-");
		cmd=(RegisterCmd)command;
		mav=new ModelAndView();
		mav.addObject("regCmd",cmd);
		mav.addObject("cmdData",cmd);
		mav.setViewName("register");
		return mav;
        
	}

}
