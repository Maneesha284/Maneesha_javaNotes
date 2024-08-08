package customer.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerProdcutApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext obj=new AnnotationConfigApplicationContext(ConfigurationFile.class);
		Customer c1=obj.getBean(Customer.class);
		System.out.println(c1);
		Product p1=obj.getBean(Product.class);
		System.out.println(p1);
	}

}
