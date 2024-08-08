import java.util.Scanner;

public class Employee2 {
	private int empNo;
	private String ename;
	private double salary;
	Scanner sr = new Scanner(System.in);

	public Employee2(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public String toString() {
		return "empNo =" + empNo + "  ename = " + ename + "  salary =" + salary;
	}

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.println("Ente empNo ,ename  and salary ");
		Employee2 emp = new Employee2(sr.nextInt(), sr.next(), sr.nextDouble());
		System.out.println(emp);
	}

}
