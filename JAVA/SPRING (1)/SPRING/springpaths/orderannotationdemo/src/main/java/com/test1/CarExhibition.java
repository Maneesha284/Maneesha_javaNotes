package com.test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.Car;

@Component
public class CarExhibition {
     
	@Autowired
	//spring will see for the Car type and will inject
	//the @Components based on car type.
	//spring does not follow any order to inject
	//the beans into this arraylist
	private List<Car> cars;
	
	public void getCars() {
		for(Car car : cars) {
			System.out.println("car name is "+car.getCarName());
		}
	}
	
	 
}
