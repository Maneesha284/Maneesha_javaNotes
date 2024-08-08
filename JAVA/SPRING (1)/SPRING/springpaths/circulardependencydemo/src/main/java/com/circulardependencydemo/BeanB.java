package com.circulardependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	
	private BeanA beanA;
	
	@Autowired
	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

	public BeanA getBeanA() {
		return beanA;
	}

}
