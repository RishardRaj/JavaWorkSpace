package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class WishController extends AbstractController {
	private WishService service;

	public void setService(WishService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String msg=null;
		ModelAndView mav=null;
		//use Service
		msg=service.generateWishMsg();
		//create and return ModelAndView class object
		mav=new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wMsg",msg);
		return mav;
	}//handleRequest(-,-)
}//class
