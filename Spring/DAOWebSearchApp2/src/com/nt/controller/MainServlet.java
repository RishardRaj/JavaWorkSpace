package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmpSearchService;

public class MainServlet extends HttpServlet {
	ApplicationContext ctx=null;
	public void init(){
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String desgs[]=null;
		EmpSearchService service=null;
		List<Map<String,Object>> list=null;
		RequestDispatcher rd=null;
		//read form data
		desgs=req.getParameterValues("jobs");
		//use Service class
		service=ctx.getBean("empService",EmpSearchService.class);
		list=service.findEmpDetailsByDesgs(desgs);
		//forward request to result.jsp
		 req.setAttribute("empList",list);
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req,res);
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  doGet(req,res);
	}

}//class
