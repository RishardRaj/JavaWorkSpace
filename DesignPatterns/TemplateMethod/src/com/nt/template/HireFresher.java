//HireFresher.java
package com.nt.template;

public abstract class HireFresher {
	public boolean aptitudeTest() {
		System.out.println("Common Aptitude Test");
		return true;
	}

	public boolean groupDiscussion() {
		System.out.println("Common GroupDiscussion");
		return true;
	}

	public abstract boolean technicalRound();

	public abstract boolean systemTest();

	public boolean hrDiscussion() {
		System.out.println("Common HR Discussion");
		return true;
	}

	public final boolean recruitmentProcess() {
		boolean result = true;
		result = aptitudeTest();
		if (result)
			result = groupDiscussion();
		if (result)
			technicalRound();
		if (result)
			systemTest();
		if (result)
			hrDiscussion();
		return result;
	}
}
