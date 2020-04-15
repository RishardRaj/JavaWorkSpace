package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.FindScoreService;

public class FindScoreControllerServlet extends HttpServlet {
	ApplicationContext ctx=null;
	
	public void init(){
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid;
		FindScoreService service=null;
		String scoreCard=null;
		RequestDispatcher rd=null;
		//read matchId
		mid=Integer.parseInt(req.getParameter("matchId"));
		//get Local Service class obj ref
		service=ctx.getBean("scoreService",FindScoreService.class);
		//use Service class
		scoreCard=service.getScore(mid);
		//keep the results  in requestScope
		req.setAttribute("scoreCard",scoreCard);
		//forward request to result.jsp
		rd=req.getRequestDispatcher("/view_score.jsp");
		rd.forward(req,res);
	
	}//doGet(-,-)

}
