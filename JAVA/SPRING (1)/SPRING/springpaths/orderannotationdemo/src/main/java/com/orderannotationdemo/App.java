package com.orderannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test1.CarExhibition;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
    			AnnotationConfigApplicationContext(AppConfig.class);
    	CarExhibition carExhibition = 
    			context.getBean("carExhibition",CarExhibition.class);
    	carExhibition.getCars();
    }
}
