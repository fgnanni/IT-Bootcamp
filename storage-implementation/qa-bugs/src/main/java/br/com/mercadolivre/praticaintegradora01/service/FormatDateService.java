package br.com.mercadolivre.praticaintegradora01.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDateService {

    public static String DateToString(Date date) {

        SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = maskDate.format(date);

        return formatedDate;
    }

    public static LocalDate DateToMySQL(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(date, formatter);

        return data;

    }

    public static Date DateToMySQL(Date date) {

        SimpleDateFormat maskDate = new SimpleDateFormat("yyyy/MM/dd");
        Date formatedDate = null;
        try {
            formatedDate = maskDate.parse(String.valueOf(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatedDate;

    }

}
