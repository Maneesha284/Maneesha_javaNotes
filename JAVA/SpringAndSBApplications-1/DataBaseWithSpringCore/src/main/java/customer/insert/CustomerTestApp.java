package customer.insert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CustomerTestApp {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationFile.class);
		CustomerDaoImpl dao=(CustomerDaoImpl)ctx.getBean(CustomerDaoImpl.class);
		Customer c1=new Customer(13,"kavya","hyd",36);
		//dao.addCustomer(c1);
		//dao.deleteCustomer(12);
		//dao.updateCustomer(c2);
		
		ctx.close();

	}

}
