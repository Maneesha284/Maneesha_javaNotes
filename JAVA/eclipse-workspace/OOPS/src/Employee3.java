import java.util.Scanner;

public class Employee3 {
	private int empNo;
	private String ename;
	private double salary;

	public Employee3(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public int hashCode() {
		return empNo;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		return this.empNo == e.empNo && this.ename.equals(e.ename) && this.salary == e.salary;
	}

	public String toString() {
		return empNo + " " + ename + " " + salary;
	}

	public static void main(String[] args) {

		Employee3 obj = new Employee3(101, "anu", 78000);
		Employee3 obj1 = new Employee3(121, "renu", 6700);
		Employee3 obj2 = new Employee3(121, "renu", 67000);

		System.out.println(obj1 == obj2);

		System.out.println(obj1.equals(obj2));

	}

}