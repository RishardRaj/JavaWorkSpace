package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.command.UserCmd;

@Controller
public class PerformOperationsController {

	@RequestMapping(value="/operations.htm",params="s1")
   	public String insert(Map<String,String> map, UserCmd cmd){
   		map.put("operation","insert operation");
   		return "user";
   	}

	@RequestMapping(value="/operations.htm",params="s2")
	public String update(Map<String,String> map, UserCmd cmd){
		map.put("operation","update operation");
		return "user";
	}
	
	@RequestMapping(value="/operations.htm",params="s3")
  public String delete(Map<String,String> map, UserCmd cmd){
     map.put("operation","delete operation");
      return "user";
  }

 }
