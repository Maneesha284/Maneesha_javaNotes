package com.contextconfigdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanX {
	
	public BeanX() {
		System.out.println("beax created");
	}
	
	@Autowired
	private BeanY beanY;

	public BeanY getBeanY() {
		return beanY;
	}

}
