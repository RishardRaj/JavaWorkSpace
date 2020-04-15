package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCmd;

public class RegistrationController extends AbstractWizardFormController {

	
	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
     return  new ModelAndView("welcome");		
	}
	@Override
	public ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException errors) throws Exception {
		RegisterCmd command=null;
           //typecasting
		command=(RegisterCmd)cmd;
	     //create and return MAV obj
		return new ModelAndView("result","cmdData",command);
	}//processFinish(-,-,-)
	

}
