package com.generictypedemo;

//generic class that take type parameter "T"
//a type parameter T can take any data type
//String, Integer, Float, any collection data type, custom data type
public class DataProcessor<T> {
	
	public void execute(T data) {
		if(data instanceof String) {
			System.out.println(data +" is string");
		}
		if(data instanceof Integer) {
			System.out.println(data +" is integer");
		}
	}
	
	

}
