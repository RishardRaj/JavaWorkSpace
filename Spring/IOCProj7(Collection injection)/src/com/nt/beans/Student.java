package com.nt.beans;

import java.util.Date;
import java.util.List;

public class Student {
	private List<String> names;
	private List<Date> dates;
	
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		System.out.println(names.getClass());
		return "Student [names=" + names + ", dates=" + dates + "]";
	}


	

}
