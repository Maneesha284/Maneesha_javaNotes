package predicate;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Student1{
	private int sno;
	private String sname;
	private String course;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student1(int sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	public String toString() {
		return "sno=" + sno + " sname=" + sname + " course=" + course;
	}
	
}
public class Predicate6 {

	public static void main(String[] args) {
		ArrayList<Student1> list =new ArrayList<Student1>();
		Student1 s1=new Student1(101,"anu","java");
		Student1 s2=new Student1(102,"kiran","python");
		Student1 s3=new Student1(103,"sandhya","java");
		Student1 s4=new Student1(104,"mani","dotnet");
		Student1 s5=new Student1(105,"nithya","python");
		Student1 s6=new Student1(106,"laxmi","java");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		Consumer<Student1> std=s-> System.out.println(s.getSno()+" "+s.getSname());
				for(Student1 s:list) {
					std.accept(s);
				}

	}

}
