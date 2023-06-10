package com.wiley.springcore.misc;

import javax.annotation.Resource;

public class Employees {
	private String name;
	@Resource
	private Address address;
	public Employees(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Employees(String name) {
		super();
		this.name = name;
	}
	public void displayEmp() {
		System.out.println("Employee details: Name: "+name+" Address: "+address);
	}
	

}
