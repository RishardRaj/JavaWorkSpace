//AutomaticPromotionTest.java
package com.nt.basic;

public class AutomaticPromotionTest
{
public void methodOne(int i)
{
System.out.println("int-arg method");
}
public void methodOne(float f)//overloaded methodss
{
System.out.println("float-arg method");
}
public static void main(String[] args)
{
AutomaticPromotionTest automaticPromotionTest=null;
automaticPromotionTest=new AutomaticPromotionTest();
automaticPromotionTest.methodOne('a');//int-arg method
automaticPromotionTest.methodOne(10l);//float-arg method
//automaticPromotionTest.methodOne(10.5);//C.E:cannot find symbol
}//main
}//class