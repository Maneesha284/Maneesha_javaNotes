package com.circulardependencydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
    			AnnotationConfigApplicationContext(AppConfig.class);
    	
    	BeanA beanA= (BeanA)context.getBean("beanA");
    	
    	BeanB beanB= (BeanB)context.getBean("beanB");
    	
    	System.out.println(beanA);
    	System.out.println(beanB);
    	System.out.println(beanA.getBeanB());
    	System.out.println(beanB.getBeanA());
    	
    }
}
