package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class CommonExceptionLogger implements ThrowsAdvice {
	
	public void afterThrowing(Method method,Object args[],Object target,
			                                            IllegalArgumentException iae){
		System.out.println("1");
		System.out.println("Exception is in"+method.getName()+" with args"+Arrays.toString(args)+" in"+target.getClass());
		//throw new  InValidInputsException("Wrong inputs");
	}//method
	
	public void afterThrowing(Method method,Object args[],Object target,
            Exception iae){
System.out.println("4");
System.out.println("Exception is in"+method.getName()+" with args"+Arrays.toString(args)+" in"+target.getClass());
//throw new  InValidInputsException("Wrong inputs");
}//method

	public void afterThrowing(Method method,Object args[],Object target,
            Throwable iae){
System.out.println("6");
System.out.println("Exception is in"+method.getName()+" with args"+Arrays.toString(args)+" in"+target.getClass());
//throw new  InValidInputsException("Wrong inputs");
}//method

	
public void afterThrowing(IllegalArgumentException iae){
	System.out.println("2");
System.out.println("Exception is raised that is "+iae);
//throw new  InValidInputsException("Wrong inputs");
}//method

/*public void afterThrowing(Exception iae){
	System.out.println("3");
System.out.println("Exception is raised that is "+iae);
//throw new  InValidInputsException("Wrong inputs");
}//method

public void afterThrowing(Throwable th){
	System.out.println("5");
System.out.println("Exception is raised that is "+th);
//throw new  InValidInputsException("Wrong inputs");
}//method
*/
}//class
