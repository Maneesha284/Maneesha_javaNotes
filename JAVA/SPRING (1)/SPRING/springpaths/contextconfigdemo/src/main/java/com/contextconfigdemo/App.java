package com.contextconfigdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("applicationcontext.xml");
    	
    	BeanX beanX = context.getBean("beanX",BeanX.class);
    	System.out.println(beanX.getBeanY());
    	BeanY beanY = context.getBean("beanY",BeanY.class);
    	System.out.println(beanY);
    }
}
