package student.course;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int sid;
	private String sname;
	@Autowired
	private Course c1;
	
	public Student(int sid, String sname) {
		c1=new Course();
		this.sid = sid;
		this.sname = sname;
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
	public Course getC1() {
		return c1;
	}
	public void setC1(Course c1) {
		this.c1 = c1;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", c1=" + c1 + "]";
	}
	
	
}
