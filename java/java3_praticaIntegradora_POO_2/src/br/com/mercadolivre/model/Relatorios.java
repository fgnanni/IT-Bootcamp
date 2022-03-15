package br.com.mercadolivre.model;

import br.com.mercadolivre.interfaces.ImprimirDocumentos;

public class Relatorios implements ImprimirDocumentos<Relatorios> {

    private String autor;
    private int numeroDePaginas;
    private String comentario;
    private String revisor;

    public Relatorios(String autor, int numeroDePaginas, String comentario, String revisor) {
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.comentario = comentario;
        this.revisor = revisor;
    }

    @Override
    public String printDoc(Relatorios doc) {
        return doc.toString();
    }

    @Override
    public String toString() {
        return "br.com.mercadolivre.model.Relatorios{" +
                "autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", comentario='" + comentario + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public String getComentario() {
        return comentario;
    }

    public String getRevisor() {
        return revisor;
    }
}
