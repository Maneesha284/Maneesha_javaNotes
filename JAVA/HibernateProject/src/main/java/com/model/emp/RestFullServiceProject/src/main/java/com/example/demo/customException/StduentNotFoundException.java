package com.example.demo.customException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StduentNotFoundException extends RuntimeException {
	public StduentNotFoundException(String msg) {
		super(msg);
		
	}
}
