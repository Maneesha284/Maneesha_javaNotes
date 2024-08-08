package collection;

import java.util.HashSet;
import java.util.Iterator;
class Employee4{
	private int eno;
	private String ename;
	
	
	public Employee4(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
		
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee4 [eno=" + eno + ", ename=" + ename + "]";
	}
	@Override
	public int hashCode() {
		return eno;
	}
	@Override
	public boolean equals(Object obj) {
		Employee4 e=(Employee4)obj;
		return this.eno==eno && this.ename.equals(e.ename);
	}
	
	
	
	
}
public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Employee4> hs =new HashSet<Employee4>();
		Employee4 e1=new Employee4(10,"anu");
		Employee4 e2=new Employee4(20,"manu");
		Employee4 e3=new Employee4(30,"kiran");
		Employee4 e4=new Employee4(40,"anu");
		Employee4 e5=new Employee4(20,"manu");
		Employee4 e6=new Employee4(10,"anu");
		
		System.out.println(e1.hashCode());
		System.out.println(e6.hashCode());
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		//System.out.println(hs);
		
		Iterator<Employee4> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
