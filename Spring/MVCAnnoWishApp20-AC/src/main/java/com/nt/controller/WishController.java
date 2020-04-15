package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Resource
	private WishService service;
	
/*	@RequestMapping("/wish.htm")
	public ModelAndView process(){
		String result=null;
		//use service
		result=service.generateWishMsg();
		return new ModelAndView("result","wMsg",result);
	}*/
	
	/*@RequestMapping("/wish.htm")
	public String process(ModelMap map){
		String result=null;
		//use service
		result=service.generateWishMsg();
		map.addAttribute("wMsg", result);
		return "result";
		
	}*/
	
	/*@RequestMapping("/wish.htm")
	public String process(Model map){
		String result=null;
		//use service
		result=service.generateWishMsg();
		map.addAttribute("wMsg", result);
		return "result";
		
	}*/
	
	/*@RequestMapping("/wish.htm")
	public String process(Map<String,String> map){
		String result=null;
		//use service
		result=service.generateWishMsg();
		map.put("wMsg",result);
		return "result";
		
	}
	*/
	
	/*@RequestMapping("/wish.htm")
	public void process(Map<String,String> map){
		String result=null;
		//use service
		result=service.generateWishMsg();
		map.put("wMsg",result);
		
		
	}*/
	
	/*@RequestMapping("/wish.htm")
	public ModelMap process(){
		String result=null;
		ModelMap model=null;
		//use service
		result=service.generateWishMsg();
		model=new ModelMap();
		model.addAttribute("wMsg",result);
		
		return model;
	}*/
	
	@RequestMapping("/wish.htm")
	public Map<String,String> process(){
		String result=null;
		Map<String,String> map=null;
		//use service
		result=service.generateWishMsg();
		map=new HashMap<String,String>();
		map.put("wMsg",result);
		return map;
	}
	
	
	
	
	
}
