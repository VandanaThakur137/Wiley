package com.wiley.springcore.autowire.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/annotationconfig.xml");
		Employee emp1=context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		

	}

}
