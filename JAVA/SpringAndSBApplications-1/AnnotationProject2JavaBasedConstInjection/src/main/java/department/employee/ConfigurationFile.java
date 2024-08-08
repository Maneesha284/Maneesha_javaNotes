package department.employee;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigurationFile {
	@Bean
	public Department createDepartment() {
		return new Department(111, "IT", "bangalore");
	}
	
	@Bean
	public Employee createEmployee() {
		return new Employee(2121,"janu",20000, 500);
	}
	
}
