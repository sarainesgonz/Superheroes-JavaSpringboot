package com.sarigonz.springboot.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sarigonz.springboot.exceptions.SuperheroNotFoundException;
import com.sarigonz.springboot.model.CustomExceptionResponse;

@ControllerAdvice
@Controller
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(Exception.class) 
    public ResponseEntity<Object> handleCustomExceptions(Exception ex, WebRequest request) {
        
        CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));

        
        return new ResponseEntity<>(customExceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(SuperheroNotFoundException.class)
    public ResponseEntity<Object> handleSuperheroNotFoundException(Exception ex, WebRequest request) {

        CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));

        
        return new ResponseEntity<>(customExceptionResponse, HttpStatus.NOT_FOUND);
    }

}
