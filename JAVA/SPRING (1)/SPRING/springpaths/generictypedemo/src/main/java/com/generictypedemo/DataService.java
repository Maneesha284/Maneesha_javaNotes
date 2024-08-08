package com.generictypedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataService {
	
	@Autowired
	DataProcessor<Integer> dataProcessor;
	
	public void processData() {
		dataProcessor.execute(67);
	}

}
