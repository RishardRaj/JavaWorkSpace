package com.nt.aspect;

import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCuponGeneratorAdvice implements AfterReturningAdvice {

	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		String cuponMsg = null;
		Writer writer = null;
		System.out.println("Target class name" + target.getClass());
		System.out.println("Target method name" + method.getName());
		System.out.println("Target method args" + Arrays.toString(args));
		System.out.println("Taget method return value" + (Float) retVal);

		// generate discount cupon based bill Amount
		if (((Float) retVal) >= 50000)
			cuponMsg = "Avail 25% discount on next purchase";
		else if (((Float) retVal) >= 30000)
			cuponMsg = "Avail 20% discount on next purchase";
		else if (((Float) retVal) >= 15000)
			cuponMsg = "Avail 10% discount on next purchase";

		// write cupon Msg to file
		writer = new FileWriter("e:\\spring\\cupon.txt");
		writer.write(cuponMsg);
		writer.flush();
		writer.close();
	}// method
}// class
