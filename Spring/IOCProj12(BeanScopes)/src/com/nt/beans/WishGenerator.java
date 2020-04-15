package com.nt.beans;

import java.util.Date;

//spring Bean (POJO)
public class WishGenerator {
	//bean properties/attributes
	private Date  sysDate;
	
	public WishGenerator(Date sysDate) {
		System.out.println("WishGenerator:1-param cosntrcutor");
		this.sysDate = sysDate;
	}
    private WishGenerator() {
		System.out.println("WishGenerator::: 0-paaram constructor");
	}
  // setter method for setter injection
	public void setSysDate(Date sysDate) {
		System.out.println("WishGenerator:::setSysDate(-)");
		this.sysDate = sysDate;
	}
	
	
	public String  generateWishMsg(String user){
		int hour=0;
		//get current hour of the day
		hour=sysDate.getHours();
		System.out.println(sysDate);
		//generate wish message
		if(hour<=12)
			return "Good morning::"+user;
		else if(hour<=16)
			return "Good Afternoon::"+user;
		else if(hour<=20)
			return "Good Evening::"+user;
		else
			return "Good night::"+user;
	}//generateWishMsg(-)
}//class
