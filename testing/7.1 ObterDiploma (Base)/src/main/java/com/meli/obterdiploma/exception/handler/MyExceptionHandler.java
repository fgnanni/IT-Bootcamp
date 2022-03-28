package com.meli.obterdiploma.exception.handler;

import com.meli.obterdiploma.exception.ObterDiplomaException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = ObterDiplomaException.class)
    public ResponseEntity<Object> handleObterDiplomaException(ObterDiplomaException error){
        String resposta = error.getMessage();
        return ResponseEntity.badRequest().body(resposta);
    }

}
