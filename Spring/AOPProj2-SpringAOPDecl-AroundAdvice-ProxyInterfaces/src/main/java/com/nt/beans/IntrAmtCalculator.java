package com.nt.beans;

public final class IntrAmtCalculator implements  IntrAmtCalculatorInterface {
	
	public final float calcIntrAmt(float pAmt,float rate,float time){
		//primary logic
		return  (pAmt*rate*time)/100.0f;
	}//method
	
}//class
