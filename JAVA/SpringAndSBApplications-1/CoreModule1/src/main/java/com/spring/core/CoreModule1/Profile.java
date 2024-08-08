package com.spring.core.CoreModule1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("std1")
	private Student std;
	
	public void details() {
		System.out.println(std.getSno());//+" "+std.getName());
	}
}
