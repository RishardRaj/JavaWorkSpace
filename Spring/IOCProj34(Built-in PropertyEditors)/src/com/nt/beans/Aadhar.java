package com.nt.beans;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Aadhar {
	private int id;
	private String name;
	private float age;
	private char gender;
	private Date dob;
	private File photoPath;
	private String[] idMarks;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public void setIdMarks(String[] idMarks) {
		this.idMarks = idMarks;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dob=" + dob
				+ ", photoPath=" + photoPath + ", idMarks=" + Arrays.toString(idMarks) + "]";
	}
    
}
