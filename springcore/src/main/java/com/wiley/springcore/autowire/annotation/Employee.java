package com.wiley.springcore.autowire.annotation;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
 private List<String> phones;
 private Set<String> addresses;
 private Map<String,Integer> courses;
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}
public Map<String, Integer> getCourses() {
	return courses;
}
public void setCourses(Map<String, Integer> courses) {
	this.courses = courses;
}
public Employee(List<String> phones, Set<String> addresses, Map<String, Integer> courses) {
	super();
	this.phones = phones;
	this.addresses = addresses;
	this.courses = courses;
}
public Employee() {
	super();
}

 
}
