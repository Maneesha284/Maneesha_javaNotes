package com.dependsonannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
	
	@Bean
	@DependsOn("dataconsume")
	public DataPublisher dataPublisher() {
		return new DataPublisher();
	}
	
	/*@Bean(name="dataconsume")
	public DataConsumer dataConsumer() {
		return new DataConsumer();
	}*/

}
