package department.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepartmentEmployeeApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationFile.class);
		Department d1=ctx.getBean(Department.class);
		System.out.println(d1.displayDetails());
		System.out.println("Total salary: "+d1.calSalary());
	}

}
