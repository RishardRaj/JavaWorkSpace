//TemplateClient.java	
package com.nt.template;

public class TemplateClient {
	public static void main(String[] args) {
		HireFresher hireFresher = null;
		boolean finalResult, finalResult1 = false;
		hireFresher = new HireJavaFresher();
		finalResult = hireFresher.recruitmentProcess();
		if (finalResult) {
			System.out.println("Java Fresher Hired Successfully");
		}
		hireFresher = new DotNetFresher();
		finalResult1 = hireFresher.recruitmentProcess();
		if (finalResult1)
			System.out.println("DotNet Fresher Hired Successfully");
	}
}