package student.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigurationFile {
	
		@Bean
		public Student createStudent() {
			return new Student(101,"abcd");
		}
		
		@Bean
		public Course createProduct() {
			return new Course(111,"mobile");
		}

}
