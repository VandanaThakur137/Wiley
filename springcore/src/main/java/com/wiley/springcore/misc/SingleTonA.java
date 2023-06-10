package com.wiley.springcore.misc;

public class SingleTonA {
	private static final SingleTonA obj= new SingleTonA();
	
	public SingleTonA() {
		System.out.println("SingleTonA object is created");
		
	}
	public static SingleTonA getSingleTonA() {
		return obj;
	}
	public void sayHello() {
		System.out.println("Say hello to emploee");
	}

}
