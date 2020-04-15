package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String  msg=null;
		Calendar calendar=null;
		int hour=0;
		ModelAndView mav=null;
		//get System Date
		calendar=Calendar.getInstance();
		//get current hour of day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate Wish Msg
		if(hour<=12)
			msg="Good morning";
		else if(hour<=16)
			msg="Good After noon";
		else if(hour<=20)
			msg="Good Evening";
		else
			msg="Good Night";
		//create and return ModelAndView class object
		mav=new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wMsg",msg);
		return mav;
	}//handleRequest(-,-)
}//class
