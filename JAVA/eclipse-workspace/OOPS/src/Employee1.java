import java.util.Scanner;

public class Employee1 {
	private int empNo;
	private String ename;
	private double salary;
	Scanner sr = new Scanner(System.in);

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	/*public String toString() {
		return "empNo ="+ empNo +"ename = "+ename+"salary ="+ salary;
	}*/

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		Scanner sr=new Scanner(System.in);
		System.out.println("Ente empNo ,ename  and salary ");
		emp.setEmpNo(sr.nextInt());
		emp.setEname(sr.next());
		emp.setSalary(sr.nextDouble());
		
		System.out.println("eno:  "+emp.getEmpNo());
		System.out.println("ename: "+emp.getEname());
		System.out.println("salary: "+emp.getSalary());
		
	}
	
}
