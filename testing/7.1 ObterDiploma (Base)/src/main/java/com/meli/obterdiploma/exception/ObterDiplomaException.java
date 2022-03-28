package com.meli.obterdiploma.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ObterDiplomaException extends RuntimeException{

    public ObterDiplomaException(String mensagem) {
        super(mensagem);
    }

}
