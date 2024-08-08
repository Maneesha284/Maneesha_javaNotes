package filter;

import java.util.*;

class Student {
	int sno;
	String name;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
}
public class FilterStudent {

	public static void main(String[] args) {
		Set<Student> s=new HashSet<Student>();
		s.add(new Student(15,"mani"));
		s.add(new Student(10,"nani"));
		s.add(new Student(25,"anu"));
		s.add(new Student(20,"balu"));
		//s.forEach(System.out::println);
		s.stream().forEach(System.out::println);
		System.out.println("===============================");
		List<Student> l=s.stream().sorted(Comparator.comparing(Student::getSno)).toList();
		l.forEach(System.out::println);
		
		

	}

}
