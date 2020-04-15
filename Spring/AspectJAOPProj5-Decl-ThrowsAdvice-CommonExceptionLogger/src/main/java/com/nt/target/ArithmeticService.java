package com.nt.target;

public class ArithmeticService {
	
	public float div(int a,int b){
		if(b==0)
			throw new ArithmeticException("Illegal inputs");
		return (float)a/b;
	}//method
}//class
