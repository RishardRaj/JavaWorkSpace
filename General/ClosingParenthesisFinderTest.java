//ClosingParenthesisFinderApp.java
package com.nt.basic;

class ClosingParenthesisFinderApp {
	public void closingParenthesis(String word) {
		int count = 0;
		boolean flag=true;
		char[] chars = word.toCharArray();
		for (Character ch : chars) {
			System.out.println(ch);
			if (ch.equals('(')) {
				count++;
			} // if
			else if(ch.equals(')')){
				count--;
			}
			/*else{
				flag=false;
			}*/
			System.out.println(count);
		} // for-each
		if(count%2==0){
			System.out.println("No Parenthesis is required");
		}
		else{
			System.out.println(count%2+"Closing Parenthesis is required");
		}
	}
}//class

public class ClosingParenthesisFinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosingParenthesisFinderApp closingParenthesisFinderApp=null;
		closingParenthesisFinderApp=new ClosingParenthesisFinderApp();
		closingParenthesisFinderApp.closingParenthesis("((((245+3433)))");
	}

}

