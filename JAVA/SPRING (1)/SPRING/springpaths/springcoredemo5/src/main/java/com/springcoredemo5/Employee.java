package com.springcoredemo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Autowired
	@Qualifier("dept")
	private Department mydepartment;
	
	public Department getDepartment() {
		return mydepartment;
	}
	
	
}
	
