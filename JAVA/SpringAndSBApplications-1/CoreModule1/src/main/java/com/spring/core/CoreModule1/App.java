package com.spring.core.CoreModule1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] {"ConfigurationFile.xml"});
       Profile p=(Profile) ctx.getBean("beanid1");
       p.details();
    }
}
