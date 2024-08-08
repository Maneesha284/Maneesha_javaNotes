package com.springcoredemo3;

public class Student {
	
	public Student() {
		System.out.println("in student constructor");
	}
	
	private String studentId;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	private String studentName;

}
