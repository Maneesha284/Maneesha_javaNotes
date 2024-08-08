package com.springcoredemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Employee emp = (Employee)context.getBean("employee");
    	
    	Department dept = (Department)context.getBean("dept");
    	
    	System.out.println(emp);
    	System.out.println(dept);
    	System.out.println(emp.getDepartment());
    	
    }
}
