package br.com.mercadolivre.spring2pratica1.controller;


import br.com.mercadolivre.spring2pratica1.service.CalcularData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class DataController {

    @GetMapping("{dia}/{mes}/{ano}")
    public String mostrarIdade(@PathVariable(required = true, name = "dia") String dia,
                               @PathVariable(required = true, name = "mes") String mes,
                               @PathVariable(required = true, name = "ano") String ano) {

            return CalcularData.calcularIdade(dia,mes,ano);

    }

}
