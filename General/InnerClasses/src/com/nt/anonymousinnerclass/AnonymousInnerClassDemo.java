//AnonymousInnerClassDemo.java
package com.nt.anonymousinnerclass;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopCorn popCorn = new PopCorn() {
			public void taste() {
				System.out.println("Spicy");
			}// taste()

		};
		popCorn.taste();
		PopCorn popCorn1 = new PopCorn();
		popCorn1.taste();
		PopCorn popCorn2 = new PopCorn() {
			public void taste() {
				System.out.println("Sweety");
			}
		};
		popCorn2.taste();
		System.out.println(popCorn.getClass().getName());
		System.out.println(popCorn1.getClass().getName());
		System.out.println(popCorn2.getClass().getName());
	}
}
