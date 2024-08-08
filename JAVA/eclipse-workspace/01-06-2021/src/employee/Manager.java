package employee;

public class Manager extends Employee {
	ManagerType type;
	
	public Manager(String ename, int empid, double salary,ManagerType type ) {
		super(ename, empid, salary);
		this.type=type;
	}
	public ManagerType getType() {
		return type;
	}
	public void setType(ManagerType type) {
		this.type = type;
	}

	String setSalary() {
		String sal = "";
		switch(type){
		case HR:
			sal="Total salary: "+(salary+1000);
			break;
		case SALES:
			sal="Total salary: "+(salary+2000);
			break;
		}
		return sal;
		
	}
	@Override
	public String toString() {
		return "Manager [type=" + type + ", ename=" + ename + ", empid=" + empid + ", salary=" + salary + "]";
	}
}
