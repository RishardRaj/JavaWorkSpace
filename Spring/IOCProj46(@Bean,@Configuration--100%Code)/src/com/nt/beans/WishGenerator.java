package com.nt.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.context.annotation.DependsOn;

@Named("wish")
@DependsOn("dt")
public class WishGenerator {
	@Resource(name="dt")
	private  Calendar sysDate;

	public WishGenerator() {
		System.out.println("WishGenerator:0-param constructor");
	}
	
	public void setSysDate(Calendar sysDate) {
		this.sysDate = sysDate;
	}
	
	public String generateWishMsg(String user){
		int  hour=0;
		//get current hour of the day
		hour=sysDate.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return "Good morning::"+ user;
		else if(hour<=16)
			return "Good morning::"+ user;
		else if(hour<=20)
			return "Good evening::"+ user;
		else
			return "Good night::"+ user;
	}//method
}//class
