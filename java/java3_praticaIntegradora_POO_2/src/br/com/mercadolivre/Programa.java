package br.com.mercadolivre;

import br.com.mercadolivre.model.Curriculos;
import br.com.mercadolivre.model.PDF;
import br.com.mercadolivre.model.Relatorios;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        ArrayList<String> habilidades = new ArrayList<>();
        habilidades.add("Correr");
        habilidades.add("Escrever");
        habilidades.add("Programar");

        Curriculos curriculo = new Curriculos("Flavio",21,habilidades);
        System.out.println(curriculo.printDoc(curriculo));

        Relatorios relatorio = new Relatorios("Thais", 234,"Livro muito bom, recomendo.!","Thalita da Silva");
        System.out.println(relatorio.printDoc(relatorio));

        PDF pdf = new PDF(21, "Roberto", "Um dia teste", "Romance");
        System.out.println(pdf.printDoc(pdf));


    }

}
