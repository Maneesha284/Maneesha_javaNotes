package com.user.model;

public class User {
	private int uid;
	private String uname;
	private String pswd;
	private String email;
	private String contact;
	private String gender;
	private String address;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String uname, String pswd, String email, String contact, String gender, String address) {
		super();
		this.uname = uname;
		this.pswd = pswd;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", pswd=" + pswd + ", email=" + email + ", contact=" + contact
				+ ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}
