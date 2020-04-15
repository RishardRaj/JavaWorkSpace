package com.nt.target;

public interface IntrAmtCalculatorInterface {
	public float calcSimpleIntrAmt(float pAmt,float rate,float time);
	public float calcCompoundIntrAmt(float pAmt,float rate,float time);
}
