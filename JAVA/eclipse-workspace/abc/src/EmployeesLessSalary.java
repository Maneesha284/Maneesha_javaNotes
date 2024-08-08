import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Employee{
	int eid;
	String ename;
	BigDecimal salary;
	
	
	public Employee(int eid, String ename, BigDecimal salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
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
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
public class EmployeesLessSalary{

	

	public static void main(String[] args) {
		BigDecimal a =BigDecimal.valueOf(35000);
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(101,"Anu",BigDecimal.valueOf(40000)));
		employee.add(new Employee(102,"Manu",BigDecimal.valueOf(32000)));
		employee.add(new Employee(105,"Shanu",BigDecimal.valueOf(11000)));
		employee.add(new Employee(103,"Renu",BigDecimal.valueOf(49000)));
		employee.add(new Employee(104,"Srinu",BigDecimal.valueOf(39000)));
		employee.add(new Employee(104,"Karan",BigDecimal.valueOf(8000)));
		for(Employee e:employee) {
			if(e.getSalary().compareTo(a)<0) {
				System.out.println(e);
			}
			
		}

	}

}
