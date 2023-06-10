package com.wiley.springcore.config;

public class Student {
	//private Beer beer;
	private Student study;

	public Student getStudy() {
		return study;
	}

	public void setStudy(Student study) {
		this.study = study;
	}

	public Student(Student study) {
		super();
		this.study = study;
	}

	public Student() {
		super();
	}
 public void study() {
	 System.out.println("Student is studing");
 }
}
