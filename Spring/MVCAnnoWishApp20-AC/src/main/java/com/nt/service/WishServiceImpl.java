package com.nt.service;

import java.util.Calendar;

import javax.inject.Named;

@Named("wishService")
public class WishServiceImpl implements WishService {
	
	public String generateWishMsg(){
		Calendar calendar=null;
		int hour=0;
		//get system date
		calendar=Calendar.getInstance();
		//get cuurent hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate Wish Msg
		if(hour<=12)
			return "Good Morning";
		else if(hour<=16)
			return "Good AfterNoon";
		else if(hour<=20)
			return "Good Evening";
		else
			return "Good Night";
	}//generateWish()
}//class
