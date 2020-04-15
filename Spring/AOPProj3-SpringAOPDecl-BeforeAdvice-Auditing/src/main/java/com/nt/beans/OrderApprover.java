package com.nt.beans;

import java.util.Calendar;

public class OrderApprover {
	
	public  String approveOrder(int orderId){
		Calendar calendar=null;
		int month=0;
		//get Sys Date
		calendar=Calendar.getInstance();
		//get month
		month=calendar.get(Calendar.MONTH);
		if(month>=6 && month<=9)
			return orderId+" order  is rejected becoz of rainy season";
		else
			return orderId+" order is approved .Work will be started very soon ";
	}//method
}//class
