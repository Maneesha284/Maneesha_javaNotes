package customer.product;

import org.springframework.context.annotation.Bean;

public class ConfigurationFile {
	@Bean
	public Customer create() {
		return new Customer(101,"abcd");
	}
	
	@Bean
	public Product create1() {
		return new Product(222,"mobile");
	}
	
}
