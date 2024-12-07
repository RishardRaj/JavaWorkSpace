package com.nt.general;

public class ContentTest 
{
	public char c;
	public ContentTest(char c){
		this.c=c;
	}
	public static void main(String[] args) 
	{
		ContentTest c=null;
         if(c.equals(null))
		System.out.println("Equal");
		 else
			 System.out.println("Not Equal");
	}//main
}//class
