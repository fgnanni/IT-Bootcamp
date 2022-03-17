package br.com.mercadolivre.springpratica01.controller;


import br.com.mercadolivre.springpratica01.NumeroRomano;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumeroRomanoController {


    @RequestMapping("/")
    @ResponseBody
    public String mostrarConversao(int decimal){

        String numeroRomano = NumeroRomano.converterDecimalParaRomano(decimal);

        String mensagemUsuario = "Decimal: " + decimal + "  -> Romano: " + numeroRomano;

        return mensagemUsuario;
    }

}
