package com.nt.beans;

public class IntrAmountCalculator {
	private  static final float RATE=2.0f;
	public static float calcIntrAmt(float pAmt,float time){
		return pAmt*time*RATE/100.0f;
	}
	/*public float  calcIntrAmt(){
		return 3456.3f;
	}
*/
}
