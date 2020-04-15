package com.nt.service;

import java.util.Calendar;

import org.springframework.web.servlet.ModelAndView;

public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMsg(){
		String  msg=null;
		Calendar calendar=null;
		int hour=0;
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
		return msg;
	}//method
}//class
