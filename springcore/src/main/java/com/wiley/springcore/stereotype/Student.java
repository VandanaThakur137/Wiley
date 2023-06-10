package com.wiley.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sob")
public class Student {
	@Value("Vandana")
	
	private String studentName;
	@Value("Sanchi")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	

}
