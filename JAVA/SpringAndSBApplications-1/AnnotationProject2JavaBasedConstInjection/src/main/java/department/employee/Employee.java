package department.employee;

public class Employee {
	private int eid;
	private String ename;
	private double basicSal;
	private double pf;
	//private double salary;
	public Employee() {
		
	}
	public Employee(int eid, String ename, double basicSal, double pf) {
		this.eid = eid;
		this.ename = ename;
		this.basicSal = basicSal;
		this.pf = pf;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	
}
