package com.nt.target;

import java.util.Calendar;

public class LoanApprover {
	public String  approveLoan(int loanId,String purpose){
		Calendar calendar=null;
		int month=0;
		//get Sys Date
		calendar=Calendar.getInstance();
		System.out.println(loanId+"  for "+purpose);
		//get current month
		month=calendar.get(Calendar.MONTH);
		if(month>=6 && month<=10 && purpose.equalsIgnoreCase("agriculture")){
			return  "Loan Approved for Loanid"+loanId;
		}
		else{
			return "Loan Rejected for loanId"+loanId;
		}
	}//method
  }//class
