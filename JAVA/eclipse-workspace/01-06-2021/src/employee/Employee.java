package employee;
enum ManagerType{
    HR, SALES
}
public class Employee {
	String ename;
	int empid;
	double salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String ename, int empid, double salary) {
		super();
		this.ename = ename;
		this.empid = empid;
		this.salary = salary;
	}
	
	
}
