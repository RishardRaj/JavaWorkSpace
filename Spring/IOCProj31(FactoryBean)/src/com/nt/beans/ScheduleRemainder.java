package com.nt.beans;

import java.util.Date;

public class  ScheduleRemainder{
	private Date dob;
	 //setter method
	  public void setDob(Date dob) {
			this.dob = dob;
		}

	  
	  public void remainder(){
	       if(dob.compareTo(new Date())==0)
	              System.out.println("Remainder for BirthDay Wishses");
	       else if(dob.compareTo(new Date())<0)
	             System.out.println("Remainder for BirthDay Ahead");
	        else
	           System.out.println("Remainder for BirthDay completion");
	      }
	}