//NestedInnerClasses.java
package com.nt.regularinnerclass;

public class NestedInnerClass1 {
	public class NestedInnerClass2 {
		public class NestedInnerClass3 {
			public void m1() {
				System.out.println("Nested InnerClasse Method");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInnerClass1 nestedInnerClass1 = new NestedInnerClass1();
		NestedInnerClass1.NestedInnerClass2 nestedInnerClass2 = nestedInnerClass1.new NestedInnerClass2();
		NestedInnerClass1.NestedInnerClass2.NestedInnerClass3 nestedInnerClass3 = nestedInnerClass2.new NestedInnerClass3();
		nestedInnerClass3.m1();
	}

}
