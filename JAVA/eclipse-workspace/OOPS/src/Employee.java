import java.util.Scanner;

public class Employee {
	int empNo;
	String ename;
	double salary;
	Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.accept(emp1.empNo, emp1.ename, emp1.salary);
		System.out.println("Employee one details");
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.accept(emp2.empNo, emp2.ename, emp2.salary);
		System.out.println("Employee two details");
		emp2.display();

	}

	public void accept(int sno, String name, double salary) {
		System.out.println("Enter sno, and name");

		this.empNo = sr.nextInt();
		this.ename = sr.next();
		this.salary = sr.nextDouble();

	}

	public void display() {
		System.out.println("Employee no: " + empNo + "  Employee name: " + ename + "  Employee salary: " + salary);
	}

}
