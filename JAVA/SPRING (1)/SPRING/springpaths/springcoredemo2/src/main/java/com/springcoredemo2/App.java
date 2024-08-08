package com.springcoredemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Employee employee = (Employee)context.getBean("employee");
    	System.out.println(employee);
    	
    	Department department = (Department)context.getBean("dept");
    	System.out.println(department);
    	System.out.println(department.getDeptId());
    	
    	Department department1 = employee.getDepartment();
    	System.out.println(department1);
    	
    	
    	
    }
}
