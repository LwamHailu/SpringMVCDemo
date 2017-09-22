package edu.pring.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//configure  it in the xml
@ControllerAdvice

public class GeneralExceptionhandlerController {
	

	@ExceptionHandler(value = ArithmeticException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handle(ArithmeticException e) {
		return "exceptionPage";
	}
	@ExceptionHandler(value = NullPointerException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handle(NullPointerException e) {
		return "exceptionPage";
	}
	@ExceptionHandler(value = IOException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handle(IOException e) {
		return "exceptionPage";
	}
	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleException(Exception e) {
		return "exceptionPage";
	}
}
