package com.nt.handler;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CheckTimeInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar calendar=null;
		int hour=0;
		//get System Data
		calendar=Calendar.getInstance();
		//get current hour of the day
		 hour=calendar.get(Calendar.HOUR_OF_DAY);
		//check the timings of the request
		 if(hour<9 || hour>17){
			 response.sendRedirect("timeout.jsp");
			 return false;
		 }
		 else
		  return true;
	}//method
}//class
