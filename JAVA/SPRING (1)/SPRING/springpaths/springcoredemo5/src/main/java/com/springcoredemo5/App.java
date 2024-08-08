package com.springcoredemo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Department dept = (Department)context.getBean("dept1");
    	
    	Employee emp = (Employee)context.getBean("employee");
    	
    	System.out.println(emp);
    	System.out.println(dept);
    	System.out.println(emp.getDepartment());
    	System.out.println(emp.getDepartment().getDeptId());
    }
}
