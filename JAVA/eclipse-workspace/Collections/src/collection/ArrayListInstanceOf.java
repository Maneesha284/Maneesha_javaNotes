package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee1{
	private int eno;
	private String ename;
	public Employee1(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}	
}
class Student{
	int sno;
	String sname;
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	
}
public class ArrayListInstanceOf {

	public static void main(String[] args) {
		List list =new ArrayList();
		System.out.println("size= " + list.size());
		list.add(22);
		list.add(45.6f);
		list.add("maneesha");
		list.add('f');
		list.add(false);
		list.add(345);
		list.add(null);
		list.add(0,"anu");
		list.add(67);
		Employee1 emp=new Employee1(10,"anu");
		list.add(emp);
		
		
		Student std=new Student(23,"anusha");
		list.add(std);
		
		//System.out.println("After adding values the size= " + list.size());
		
		for(Object o:list) {
			if(o instanceof Integer) {
				System.out.println(o.toString());
			}
			if(o instanceof Employee1) {
				Employee1 e=(Employee1)o;
				System.out.println(e.toString());
			}
			if(o instanceof Student) {
				Student s =(Student)o;
				System.out.println(s.toString());
			}
		}
		/*Iterator i=list.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}*/
	}

}
