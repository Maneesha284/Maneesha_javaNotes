package com.exception.nullpointer;

public class Product {
	int pno;
	String pname;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Product(int pno, String pname) {
		super();
		this.pno = pno;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + "]";
	}
	
}
