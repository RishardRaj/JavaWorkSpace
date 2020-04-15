package com.nt.target;

import org.springframework.stereotype.Component;

@Component("iac")
public class IntrAmtCalculator {
	
	public float calcSimpleIntrAmt(float pAmt,float rate,float time){
		return pAmt*rate*time/100.0f;
	}//method
	
	public float calcCompoundIntrAmt(float pAmt,float rate,float time){
		 return  (float) ((pAmt*Math.pow(1+rate/100,time))-pAmt);
	}//method
	
	
	
}//class
