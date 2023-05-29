package com.wiley.springcore.lifecycle;

public class Pizza {
	private int price;

	public Pizza(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public Pizza() {
		super();
	}
	
	public void start() {
		System.out.println("Inside the init method");
	}
	public void end() {
		System.out.println("Inside the end method");
	}
	
	
}
