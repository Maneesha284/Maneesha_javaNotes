package com.online.model;

public class Student {
	private int sid;
	private String sname;
	private String email;
	private String contactno;
	private String suname;
	private String spswd;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String email, String contactno, String suname, String spswd) {
		super();
		this.sname = sname;
		this.email = email;
		this.contactno = contactno;
		this.suname = suname;
		this.spswd = spswd;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public String getSpswd() {
		return spswd;
	}

	public void setSpswd(String spswd) {
		this.spswd = spswd;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", contactno=" + contactno
				+ ", suname=" + suname + ", spswd=" + spswd + "]";
	}
	
	
	
}
