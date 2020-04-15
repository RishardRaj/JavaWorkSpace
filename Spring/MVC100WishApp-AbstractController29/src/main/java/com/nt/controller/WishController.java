package com.nt.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Resource
	private WishService service;
	
	@RequestMapping("/wish.htm")
	public String process(Map<String,String> map){
		String wishMsg=null;
		//use service 
		wishMsg=service.generateWishMessage();
		//keep in Model Attribute
		map.put("msg",wishMsg);
		return "result";
		
	}

}
