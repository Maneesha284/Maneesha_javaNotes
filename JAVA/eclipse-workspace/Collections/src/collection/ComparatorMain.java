package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp1 {
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
	
	public Emp1(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
			
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Emp1 e1=(Emp1) arg0;
		Emp1 e2=(Emp1) arg1;
		return e1.getEid() - e2.getEid();
	}
	
	
}

public class ComparatorMain {

	public static void main(String[] args) {
		List<Emp1> list=new ArrayList<Emp1>();
		Emp1 e1=new Emp1(4,"Janu",45000);
		Emp1 e2=new Emp1(5,"Manu",45000);
		Emp1 e3=new Emp1(3,"Renu",46000);
		Emp1 e4=new Emp1(1,"Tanu",43000);
		Emp1 e5=new Emp1(2,"Mani",42000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("Before Sorting.......");
		list.forEach(e->System.out.println(e));
		Collections.sort(list, new MyComparator());
		
		System.out.println("After Sorting.......");
		list.forEach(e->System.out.println(e));
		
		

	}

}
