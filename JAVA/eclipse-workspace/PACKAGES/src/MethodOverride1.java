import java.util.Scanner;

class Student {
	int sno;
	String sname;

	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
		System.out.println("parameterized constructor");
	}

	protected void displayStudentDetails() {
		System.out.println("No: " + sno);
		System.out.println("Name: " + sname);
	}

}

class Employee extends Student {
	double salary;
	double bouns;

	public Employee(int sno, String sname, double salary, double bouns) {
		super(sno, sname);
		this.salary = salary;
		this.bouns = bouns;
	}

	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Total salary: " + (salary + bouns));

	}

}

public class MethodOverride1 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter sno, sname, salary and bouns");
		Student obj = new Employee(sr.nextInt(), sr.next(), sr.nextDouble(), sr.nextDouble());
		obj.displayStudentDetails();

	}

}
