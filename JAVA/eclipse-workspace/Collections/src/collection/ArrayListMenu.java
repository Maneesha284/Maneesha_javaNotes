package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int eno;
	private String ename;
	private double salary;

	public Employee(int eno, String ename, double salary) {

		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

class ListOperaions {
	List<Employee> empList;

	ListOperaions() {
		empList = new ArrayList<Employee>();
	}

	void menu() {
		String m = "MENU APPLICATION \n";
		m += "1.Add Employee \n";
		m += "2.Delete Employee \n";
		m += "3.Update Employee \n";
		m += "4.DisplAY Employee \n";
		m += "5.Exit \n";
		System.out.println(m);

	}

	void addEmployee(Employee emp) {
		empList.add(emp);
		System.out.println("Your information is added successfully");
	}

	void deleteEmployee(int ind) {
		empList.remove(--ind);
		System.out.println("Deleted successfully");
	}

	void updateEmployee(int ind, Employee emp) {
		empList.set(--ind, emp);
		System.out.println("Updated successfully");
	}

	void listEmployee() {

		System.out.println("Employee information ");
		for (Employee e : empList) {
			System.out.println(e);
		}
	}

	void accept() {
		System.out.println("Enter eno, ename, salary?");
	}
}

public class ArrayListMenu {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListOperaions obj = new ListOperaions();
		for(;;) {
			obj.menu();
			System.out.println("Enter your choice");
			int ch = sr.nextInt();
			switch (ch) {
			case 1:
				obj.accept();
				obj.addEmployee(new Employee(sr.nextInt(), sr.next(), sr.nextDouble()));
				break;
			case 2:
				System.out.println("Enter eno?");
				obj.deleteEmployee(sr.nextInt());
				break;
			case 3:
				obj.accept();
				int empno = sr.nextInt();
				obj.updateEmployee(empno, new Employee(sr.nextInt(), sr.next(), sr.nextDouble()));
				break;
			case 4:
				obj.listEmployee();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}

	}

}
