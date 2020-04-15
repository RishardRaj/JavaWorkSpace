package com.nt.beans;

public class IntrAmtCalculator {
	
	public float calcIntrAmt(float pAmt,float rate,float time){
		//primary logic
		return  (pAmt*rate*time)/100.0f;
	}//method
}//class
