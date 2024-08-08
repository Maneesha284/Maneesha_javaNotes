package student.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StdAppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationFile.class);
//		Course c=ctx.getBean(Course.class);
//		System.out.println(c);
		Student s=ctx.getBean(Student.class);
		System.out.println(s);
	}
}
