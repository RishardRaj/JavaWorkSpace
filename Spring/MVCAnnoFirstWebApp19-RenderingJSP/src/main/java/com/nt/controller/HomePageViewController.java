package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageViewController {
	
	@RequestMapping("/welcome.htm")
	public ModelAndView renderHomePage(){
		return new ModelAndView("home","wishMsg","Happy Diwali");
	}//renderHomePage()
}//class
