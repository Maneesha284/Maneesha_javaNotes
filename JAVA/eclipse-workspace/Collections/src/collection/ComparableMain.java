package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp implements Comparable {
	private int eid;
	private String ename;
	private double salary;
	
	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Emp(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public int compareTo(Object arg0) {
		Emp e=(Emp)arg0;
		//return this.eid - e.eid;
		return this.ename.compareTo(e.ename);
	}
	
		
}

public class ComparableMain {

	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		Emp e1=new Emp(4,"Janu",45000);
		Emp e2=new Emp(5,"Manu",45000);
		Emp e3=new Emp(3,"Renu",46000);
		Emp e4=new Emp(1,"Tanu",43000);
		Emp e5=new Emp(2,"Mani",42000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("Before Sorting.......");
		list.forEach(e->System.out.println(e));
		Collections.sort(list);
		
		System.out.println("After Sorting.......");
		list.forEach(e->System.out.println(e));
		
		

	}

}
