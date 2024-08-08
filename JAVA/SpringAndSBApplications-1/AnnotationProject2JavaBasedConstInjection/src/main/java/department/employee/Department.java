package department.employee;
import org.springframework.beans.factory.annotation.Autowired;

//import department.employee.Employee;
public class Department implements DepartmentInterface{
	private int dno;
	private String dname;
	private String dloc;
	@Autowired
	Employee e;
	public Department() {
		
	}
	public Department(int dno, String dname, String dloc) {
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	
	public String displayDetails() {
		return "Employee details: [eid=" + e.getEid() + ", ename=" + e.getEname() + ", basicSal=" + e.getBasicSal() + ", pf=" + e.getPf() + "]"+"\nDepartment details: [dno=" + dno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	public double calSalary() {
		double tsal=e.getBasicSal()-e.getPf();
		return tsal;
		
	}
	
}
