package com.ojas.client;

import com.ojas.calculate.Calculator;

public class Client {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.sum(10, 20);
		obj.sub(20, 10);
	}

}
