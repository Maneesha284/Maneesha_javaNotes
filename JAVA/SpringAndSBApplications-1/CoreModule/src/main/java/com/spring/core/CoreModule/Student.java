package com.spring.core.CoreModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("std")
public class Student   {
	@Autowired
	private Person p;

	public void details() {
		System.out.println(p.getNo()+" "+p.getName());
		
	}
	

	
}
