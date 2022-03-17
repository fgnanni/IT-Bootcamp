package br.com.mercadolivre.springpratica02.controller;

import br.com.mercadolivre.springpratica02.model.Morse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MorseController {


    @RequestMapping("/")
    @ResponseBody
    public String mostrarEscrita(@RequestParam String codigoMorse){
        

        return Morse.converterMorseParaAlfabetico(codigoMorse);
    }

}
