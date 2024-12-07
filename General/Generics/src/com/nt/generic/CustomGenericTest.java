//CustomGenericTest.java
package com.nt.generic;

public class CustomGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomGenericApp<Integer> customGenericApp=new CustomGenericApp<Integer>(46468);
		customGenericApp.show();
		System.out.println(customGenericApp.getObject());
		CustomGenericApp<String> customGenericApp2=new CustomGenericApp<String>("Hai");
		customGenericApp2.show();
		System.out.println(customGenericApp2.getObject());
		CustomGenericApp<Double> customGenericApp3=new CustomGenericApp<Double>(2052.55);
		customGenericApp3.show();
		System.out.println(customGenericApp3.getObject());
	}

}
