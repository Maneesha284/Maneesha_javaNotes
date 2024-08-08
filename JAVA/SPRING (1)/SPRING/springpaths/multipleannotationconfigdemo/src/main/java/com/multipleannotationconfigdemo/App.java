package com.multipleannotationconfigdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	/*ApplicationContext context = new 
    			AnnotationConfigApplicationContext(DataConfig.class, ServiceConfig.class);*/
    	
    	ApplicationContext context = new 
    			AnnotationConfigApplicationContext(AppConfig.class);
    }
}
