package com.nt.files;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		test1 t1=new test1();
		Object o=t1;
		if(o==t1)
			result =1;
		if(o!=t1){
			result =result+10;
		}
		if(o.equals(t1)){
			result =result+100;
		}
		if(t1.equals(0)){
			result =result+1000;
		}
		System.out.println(result);
	}

}
