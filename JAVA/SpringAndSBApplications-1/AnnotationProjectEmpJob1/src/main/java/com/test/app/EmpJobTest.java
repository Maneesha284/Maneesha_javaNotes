package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.job.JobTitle;


public class EmpJobTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"app.xml"});
		JobTitle empjt=(JobTitle) context.getBean("jobbeanid");
		System.out.println(empjt);

	}

}
