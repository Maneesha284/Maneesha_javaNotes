package com.sortingdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	SortingImpl sortingImpl = 
    			(SortingImpl)context.getBean("sortingImpl");
    	int[] data = {3,13,19,1,5,7};
    	sortingImpl.sort(data);
    }
}
