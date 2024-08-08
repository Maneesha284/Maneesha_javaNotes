package autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTestApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ConfixFileAutowire.xml");
	 	College obj = (College) ctx.getBean("clg");
		System.out.println(obj);
	}
}
