/**
 * 
 */
package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sir2
 *
 */
public class CiMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/wiley/springcore/ci/ciconfig.xml");
		 Person p=(Person) context.getBean("p1");
		 System.out.println(p);
	}

}
