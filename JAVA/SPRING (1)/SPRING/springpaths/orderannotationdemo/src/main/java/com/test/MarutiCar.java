package com.test;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MarutiCar extends Car {

	@Override
	public String getCarName() {
		return "Maruti car";
	}

}
