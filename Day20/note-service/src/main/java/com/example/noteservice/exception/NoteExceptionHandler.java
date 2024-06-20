
package com.example.noteservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NoteExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(NoteNotFoundException.class)
	public ResponseEntity<String> handleNotNotFoundException(NoteNotFoundException ex){
		 String errorMessage = ex.getMessage();
	        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	}

}
 
