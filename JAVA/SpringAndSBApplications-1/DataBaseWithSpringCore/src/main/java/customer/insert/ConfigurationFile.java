package customer.insert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@Import(DBConfigFile.class)
public class ConfigurationFile {
	@Bean
	public Customer createCustomer() {
		return new Customer();
	}
	@Bean
	public CustomerDaoImpl createCustomerDaoImpl() {
		return new CustomerDaoImpl();
	}
}
