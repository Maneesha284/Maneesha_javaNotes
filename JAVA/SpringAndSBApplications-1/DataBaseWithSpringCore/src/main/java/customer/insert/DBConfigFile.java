package customer.insert;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@Component(value="customer.insert")
@PropertySource(value= {"classpath:application.properties"})

public class DBConfigFile {
	@Autowired
	private Environment env;
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dbsrc=new DriverManagerDataSource();
		dbsrc.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		dbsrc.setUrl(env.getRequiredProperty("jdbc.url"));
		dbsrc.setUsername(env.getRequiredProperty("jdbc.username"));
		dbsrc.setPassword(env.getRequiredProperty("jdbc.password"));
		return dbsrc;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		return jdbcTemplate;
		
	}

}
