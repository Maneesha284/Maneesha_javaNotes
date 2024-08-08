package serialize;

import java.io.Serializable;

public class Student implements Serializable{
	private int sno;
	private String sname;
	private transient int age;
	
	public Student(int sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", age=" + age + "]";
	}
	
}
