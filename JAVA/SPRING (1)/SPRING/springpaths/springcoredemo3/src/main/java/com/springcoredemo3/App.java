package com.springcoredemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student = (Student)context.getBean("student");
		
		Student student1 = (Student)context.getBean("student");
		
		System.out.println(student);
		
		System.out.println(student1);
		
	}
}
