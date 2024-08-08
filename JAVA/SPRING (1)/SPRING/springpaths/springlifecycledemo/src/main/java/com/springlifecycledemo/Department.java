package com.springlifecycledemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class Department implements InitializingBean,BeanNameAware {
	
	public Department() {
		System.out.println("In department constructor");
	}
	
	@PostConstruct
	public void afterConstruct() {
		System.out.println("in after construct department");
	}
	
	private String deptId;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("in afterPropertiesSet method department");
		
	}
	
	public void init() {
		System.out.println("in init method in department");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("the name of the bean is "+name);
		
	}

}
