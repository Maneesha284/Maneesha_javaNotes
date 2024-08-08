package com.example.demo.response;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.customException.StduentNotFoundException;


@ControllerAdvice //Exception handler handles all excpetions
//@RestController
public class CoustomizedResponseEntityException extends ResponseEntityExceptionHandler {
	@ExceptionHandler(StduentNotFoundException.class)
	public final ResponseEntity<Object> handleAllExcepions(StduentNotFoundException e, WebRequest req,Date date) {
		ExceptionResponse exceptionResponse=new ExceptionResponse(e.getMessage(),req.getDescription(false),new Date());
		return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
		
	}

}
