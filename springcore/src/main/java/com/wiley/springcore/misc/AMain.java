package com.wiley.springcore.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.autowire.annotation.Employee;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/wiley/springcore/misc/config.xml");
		Employees emp1=context.getBean("employee",Employees.class);
		emp1.displayEmp();
		System.out.println("******************");
		SingleTonA st= context.getBean("vandana",SingleTonA.class);
		st.sayHello();
	}

}
