package com.model.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.model.emp.Employee;

@Scope(value="singleton")
public class JobTitle {
	@Autowired
	private Employee person;
	
	private int type;
	private String action;
	public Employee getPerson() {
		return person;
	}
	public void setPerson(Employee person) {
		this.person = person;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "JobTitle [person=" + person + ", type=" + type + ", action=" + action + "]";
	}
	
	
}
