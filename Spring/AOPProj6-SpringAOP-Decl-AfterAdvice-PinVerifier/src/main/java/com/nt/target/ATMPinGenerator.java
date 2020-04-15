package com.nt.target;

import java.util.Random;

public class ATMPinGenerator {
	
	public int generatePin(){
		Random rad=null;
		int pin=0;
		//generate random number as the pin number
		rad=new Random();
		pin=rad.nextInt(999);
		
		return pin;
	}//method
}//class

