package com.lcwd.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
		String msg = ex.getMessage();
		ApiResponse build = new ApiResponse();
		build.setMessage(msg);
		build.setSuccess(true);
		build.setStatus(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<ApiResponse>(build,HttpStatus.NOT_FOUND);
	}
}
