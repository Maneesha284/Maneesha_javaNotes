package FI.Collection;

import java.util.*;

//With lambda expression 
class Product{
	int no;
	String name;
	int age;
	public Product(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class ProductArrayList {

	public static void main(String[] args) {
		List<Product> l=new ArrayList<Product>();
		l.add(new Product(104,"mani",23));
		l.add(new Product(101,"anu",47));
		l.add(new Product(103,"kavya",13));
		l.add(new Product(102,"nani",33));
		l.forEach(p->System.out.println(p));
		
		System.out.println("==================");
		Collections.sort(l,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		
		//l.forEach(l1->System.out.println(l1));
		
		l.forEach(System.out::println);
	}

}

//Without lambda expression

//class Product{
//	int no;
//	String name;
//	int age;
//	public Product(int no, String name, int age) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Product [no=" + no + ", name=" + name + ", age=" + age + "]";
//	}
//	
//}
//class MyComp implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		Product p1=(Product) o1;
//		Product p2=(Product) o2;
//		//return p1.name.compareTo(p2.name);
//		return p1.no-p2.no;
//	}
//	
//}
//public class ProductArrayList {
//
//	public static void main(String[] args) {
//		List<Product> l=new ArrayList<Product>();
//		l.add(new Product(104,"mani",23));
//		l.add(new Product(101,"anu",47));
//		l.add(new Product(103,"kavya",13));
//		l.add(new Product(102,"nani",33));
//		l.forEach(p->System.out.println(p));
//		
//		System.out.println("==================");
//		Collections.sort(l,new MyComp());
//		
//		l.forEach(l1->System.out.println(l1));
//	}
//
//}
