package com.springcoredemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Applicationcotenxt is spring container
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("BusinessApplicationContext.xml");
    	
    	ApplicationContext context1 = 
    			new ClassPathXmlApplicationContext("BusinessApplicationContext.xml");
    	
    	Employee employee = (Employee)context.getBean("employee");
    	Employee employee1 = (Employee)context.getBean("employee");
    	Department department = (Department)context.getBean("department");
    	
    	System.out.println(employee);
    	System.out.println(department);
    	System.out.println(employee.getDepartment());
    	System.out.println(employee1.getDepartment());
    	
    	/*System.out.println(employee.getDepartment());
    	
    	Department dept = (Department)context.getBean("department");
    	
    	System.out.println(dept);
    	
    	System.out.println(employee.getOrganization());
    	
    	Organization org = (Organization)context.getBean("org");
    	
    	System.out.println(org);*/
    	
    }
}
