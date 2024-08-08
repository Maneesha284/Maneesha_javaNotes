package searchingRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int eid;
	private String ename;
	private double salary;
	private String designation;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int eid, String ename,String designation, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}
		
}

public class EmployeeData {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Employee> list=new ArrayList<Employee>();
		FileReader fr=new FileReader("EmpDetails.txt");
		BufferedReader br = new BufferedReader(fr);
		String line="";
		while((line =br.readLine())!=null) {
			String str[]=line.split(",");
			Employee e=new Employee(Integer.parseInt(str[0]),str[1],str[2],Double.parseDouble(str[3]));
			list.add(e);
		}
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter eno");
		int eno=sr.nextInt();
		boolean b=false;
		for(Employee e:list){
			if(e.getEid()==eno) {
				System.out.println(e.getEname()+"  "+e.getDesignation()+"   "+e.getSalary());
				b=true;
			}
		}
		if(!b) {
			System.out.println("Not available");
		}
		
		

	}

}
