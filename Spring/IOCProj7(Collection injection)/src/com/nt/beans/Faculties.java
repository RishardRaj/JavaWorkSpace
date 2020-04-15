package com.nt.beans;

import java.util.Map;

public class Faculties {
	private Map<String,String>facultySubjects;

	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	@Override
	public String toString() {
		return "Faculties [facultySubjects=" + facultySubjects + "]";
	}
	
	

}
