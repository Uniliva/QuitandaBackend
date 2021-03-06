package br.com.yaman.quitanda.resource.handlers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.yaman.quitanda.exceptions.BusinessException;
import br.com.yaman.quitanda.exceptions.NotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceExceptionHandler.class);
	
	@ExceptionHandler(NotFoundException.class)
	ResponseEntity<StandardError> notFound(NotFoundException nf, HttpServletRequest request){
		StandardError error = new StandardError(nf.getMessage(), HttpStatus.NOT_FOUND.value());
		LOGGER.error("Error: "+nf.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
	
	@ExceptionHandler(BusinessException.class)
	ResponseEntity<StandardError> businessError(BusinessException nf, HttpServletRequest request){
		StandardError error = new StandardError(nf.getMessage(), HttpStatus.BAD_REQUEST.value());
		LOGGER.error("Error: "+nf.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
		
	}

}
