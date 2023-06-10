package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.autowire.annotation.Employee;

public class CompMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/config.xml");
		Student st1=context.getBean("sob",Student.class);
		System.out.println(st1);
	}

}
