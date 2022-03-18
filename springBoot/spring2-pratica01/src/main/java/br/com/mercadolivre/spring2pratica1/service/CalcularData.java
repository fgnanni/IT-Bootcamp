package br.com.mercadolivre.spring2pratica1.service;


import java.time.LocalDate;
import java.time.Period;


public class CalcularData {

        static LocalDate dataDeHoje = LocalDate.now();

    public static String calcularIdade(String dia, String mes, String ano)  {


        String dataCompleta = ano + "-" + mes + "-" + dia;

        LocalDate dataFormatada = LocalDate.parse(dataCompleta);

        int idade = Period.between(dataFormatada,dataDeHoje).getYears();

        return "Voce tem " + idade + " anos.";
    }

}
