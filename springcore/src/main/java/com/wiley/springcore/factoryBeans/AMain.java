package com.wiley.springcore.factoryBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.autowire.annotation.Employee;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/wiley/springcore/misc/config.xml");
		Bar emp1=context.getBean("bar",Bar.class);
	
		//InstanceBarFactory emp1= context.getBean("bar",Bar.class);
		System.out.println(emp1);
	}

}
