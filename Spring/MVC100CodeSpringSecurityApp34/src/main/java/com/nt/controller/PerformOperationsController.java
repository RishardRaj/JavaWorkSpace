package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerformOperationsController {
	
	@RequestMapping("/home.htm")
	public String showHomePage(){
		return "home";
	}
	
	@RequestMapping("/profile.htm")
	public String showProfilePage(Map<String,String> map){
		map.put("name", "raja");
		map.put("age", "48");
		map.put("addrs", "hyd");
		return "view_profile";
	}
	
	@RequestMapping("/phone.htm")
	public String showPhoneNumbersPage(Map<String,String> map){
		map.put("phone", "432423432");
		return "phone_numbers";
	}


}//class
