package annotationdemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		Department dept = new Department();
		dept.setDeptId("d1");
		dept.setDeptName("engineering");
		
		System.out.println(dept.getDeptId()
				+" "+dept.getDeptName());
		
		//using reflections
		//any framework who needs to process
		//the annotations will write thios kind
		//of code
		Class department = Department.class;
		Method[] methods = department.getMethods();
		for(Method method: methods) {
			if(method.getName().equals("processEmployeeSalaries")) {
				Annotation[] annotations = 
						method.getDeclaredAnnotations();
				
				for(Annotation annotation : annotations){
					if(annotation instanceof MyAnnotation){
						MyAnnotation myannotation
						=(MyAnnotation)annotation;
						System.out.println(myannotation.name1());
						System.out.println(myannotation.value());
					}
					
				}
			}
		}
	}
}
