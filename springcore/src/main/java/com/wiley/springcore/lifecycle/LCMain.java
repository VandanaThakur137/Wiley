package com.wiley.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.wiley.springcore.ci.Person;

public class LCMain {
	public static void main(String[] args) {
	 ApplicationContext context= new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/lcconfig.xml");
	 Pizza pz1=(Pizza) context.getBean("pizza1");
	 System.out.println(pz1);
	 ((AbstractApplicationContext) context).registerShutdownHook();
}
}