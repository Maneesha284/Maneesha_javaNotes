package com.spring.core.CoreModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] {"ConfigurationFile.xml"});
        Person p=(Person) ctx.getBean("beanid1");
    }
}
