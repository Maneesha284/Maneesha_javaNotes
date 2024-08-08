package com.test;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BMWCar extends Car{

	@Override
	public String getCarName() {
		return "bmw car";
	}

}
