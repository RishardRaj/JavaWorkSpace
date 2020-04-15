package com.nt.aspect;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponGeneratorAspect {
	
	public void  generateCupon(JoinPoint jp,float billAmt)throws Throwable{
		Writer writer=null;
		String cuponMsg=null;
		System.out.println("Target class name::"+jp.getTarget().getClass());
		System.out.println("Target method name::"+jp.getSignature());
		System.out.println("Target method args"+Arrays.toString(jp.getArgs()));
		//generate cupon msg
		if(billAmt>=40000)
			cuponMsg="Avail 40% discount on next purchase";
		else if(billAmt>=30000)
			cuponMsg="Avail 30% discount on next purchase";
		else if(billAmt>=20000)
			cuponMsg="Avail 20% discount on next purchase";
		else 
			cuponMsg="Avail 10% discount on next purchase";
			
		//generate
		writer=new FileWriter("e:/spring/cupon.txt");
		writer.write(cuponMsg);
		writer.flush();
		writer.close();
	}//method
}//class
