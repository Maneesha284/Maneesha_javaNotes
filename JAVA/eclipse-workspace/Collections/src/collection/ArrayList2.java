package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee2{
	private int eno;
	private String ename;
	public Employee2(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
	
}
public class ArrayList2 {

	public static void main(String[] args) {
		List list =new ArrayList();
		System.out.println("size= " + list.size());
		list.add(22);
		list.add(45.6f);
		list.add("maneesha");
		list.add('f');
		list.add(false);
		list.add(null);
		list.add(0,"anu");
		Employee2 emp=new Employee2(10,"anu");
		list.add(emp);
		list.remove(5);
		System.out.println("After adding values the size= " + list.size());
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object x:list) {
			System.out.println(x);
		}*/
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
	}

}
