package com.nt.aspect;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditingAspect {
	
	public  void  audit(JoinPoint jp)throws Throwable{
		Object args[]=null;
		Writer writer=null;
		System.out.println("taget class name"+jp.getTarget().getClass());
		System.out.println("taget method name"+jp.getSignature());
		System.out.println("taget method args"+Arrays.toString(jp.getArgs()));
		//get Load id
		args=jp.getArgs();
		//trying modify target method args
		args[1]=(String)args[1]+"hello";
		//throw exception to stop the control going to target method
		if((Integer)args[0]<=0)
			  throw new IllegalArgumentException();
		
		//perfomr auditing
		writer =new FileWriter("E:\\spring\\auditLog.txt");
		writer.write(args[0]+" Loan id   has come for approval at "+new Date());
		writer.flush();
		writer.close();
	}//method

	
	/*public  void  audit(JoinPoint jp,int lid,String purpose)throws Throwable{
		Writer writer=null;
		
		System.out.println("taget class name"+jp.getTarget().getClass());
		System.out.println("taget method name"+jp.getSignature());
		System.out.println("taget method args"+Arrays.toString(jp.getArgs()));
		
		//perfomr auditing
		writer =new FileWriter("E:\\spring\\auditLog.txt");
		writer.write(lid+" Loan id   has come for approval at "+new Date());
		writer.flush();
		writer.close();
	}//method
*/	
	}//class

