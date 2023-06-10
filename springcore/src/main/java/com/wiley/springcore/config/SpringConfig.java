package com.wiley.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Component
public class SpringConfig {
	@Bean
	public Student getStudent() {
	 Student student =new Student();
	 return student;
 }
}
