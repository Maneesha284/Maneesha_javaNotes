package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Student{
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
	public Student(int sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	public String toString() {
		return "sno=" + sno + " sname=" + sname + " course=" + course;
	}
	
}
public class Predicate5 {

	public static void main(String[] args) {
		ArrayList<Student> list =new ArrayList<Student>();
		Student s1=new Student(101,"anu","java");
		Student s2=new Student(102,"kiran","python");
		Student s3=new Student(103,"sandhya","java");
		Student s4=new Student(104,"mani","dotnet");
		Student s5=new Student(105,"nithya","python");
		Student s6=new Student(106,"laxmi","java");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		Predicate<Student> javaStudent = x->x.getCourse().equals("java") ;
		
		ArrayList<Student> java =new ArrayList<Student>();
		for(Student s:list) {
			if(javaStudent.test(s)) {
				java.add(s);
			}
		}
		//System.out.println(java);
		java.forEach(x->System.out.println(x));
		

	}

}
