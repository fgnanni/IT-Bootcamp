package br.com.mercadolivre.model;

import br.com.mercadolivre.interfaces.ImprimirDocumentos;

public class PDF implements ImprimirDocumentos<PDF> {

    private int numeroPag;
    private String nomeAutor;
    private String titulo;
    private String genero;


    public PDF(int numeroPag, String nomeAutor, String titulo, String genero) {
        this.numeroPag = numeroPag;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String printDoc(PDF doc) {
        return doc.toString();
    }

    @Override
    public String toString() {
        return "br.com.mercadolivre.model.PDF{" +
                "numeroPag=" + numeroPag +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }
}
