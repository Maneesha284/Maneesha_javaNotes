package com.springlifecycledemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	/*System.out.println("context object is created");
    	Employee emp = (Employee)context.getBean("employee");
    	System.out.println(emp.getDepartment());
    	Employee emp1 = (Employee)context.getBean("employee");
    	System.out.println(emp1.getDepartment());
    	
    	Department dept1 = (Department)context.getBean("department");
    	System.out.println(dept1);*/
    }
}
