package com.meli.obterdiploma.controller;

import com.meli.obterdiploma.exception.ObterDiplomaException;
import com.meli.obterdiploma.model.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ObterDiplomaExceptionController {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ExceptionDTO> handleValidationExceptions(MethodArgumentNotValidException e) {
        ExceptionDTO error = new ExceptionDTO("MethodArgumentNotValidException", e.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    protected ResponseEntity<ExceptionDTO> handleValidationExceptions(HttpMessageNotReadableException e) {
        ExceptionDTO error = new ExceptionDTO("HttpMessageNotReadableException", e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
