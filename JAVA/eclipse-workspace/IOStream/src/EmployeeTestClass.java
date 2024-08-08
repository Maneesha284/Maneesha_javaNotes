import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
	private int eno;
	private String ename;
	private double salary;
	public Employee(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEno() {
		return eno;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
}
public class EmployeeTestClass {

	public static void main(String[] args) {
		
		Path path=Paths.get("EmpDetails.txt");
		List<Employee> list=new ArrayList<Employee>();
		try {
			List<String> lines=Files.readAllLines(path);
			for(String line:lines) {
				String str[]=line.split(",");
				Employee e=new Employee(Integer.parseInt(str[0]),str[1],Double.parseDouble(str[2]));
				list.add(e);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter employee no ?");
		int empNo=sr.nextInt();
		for(Employee e:list) {
			if(e.getEno() == empNo) {
				System.out.println(e);
			}
		}

	}

}
