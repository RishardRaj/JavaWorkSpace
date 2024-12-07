//IlandOfIsolation.java
package com.nt.basic;

public class IlandOfIsolation 
{
	public IlandOfIsolation ilandOfIsolation;
	public static void main(String[] args) 
	{
		Runtime runtime=null;
		runtime=Runtime.getRuntime();
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
		IlandOfIsolation ilandOfIsolation1=new IlandOfIsolation();
		IlandOfIsolation ilandOfIsolation2=new IlandOfIsolation();
		IlandOfIsolation ilandOfIsolation3=new IlandOfIsolation();
		System.out.println("-------------------------------------After all Objects Creation----------------------------------------");
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
		ilandOfIsolation1.ilandOfIsolation=ilandOfIsolation2;
		ilandOfIsolation2.ilandOfIsolation=ilandOfIsolation3;
		ilandOfIsolation3.ilandOfIsolation=ilandOfIsolation1;
		//Nullify reference variables
		ilandOfIsolation1=null;   //Here no object is eligible for garbage collection
		runtime.gc();
		System.out.println("===========================================");
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
		ilandOfIsolation2=null;   //Here also no object is eligible for garbage collection
        runtime.gc();
		System.out.println("********************************************");
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
		ilandOfIsolation3=null;  //Here,At a time total all three objects eligible for GC
		//call GarbageCollector
		runtime.gc();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
	}//main
}//class
