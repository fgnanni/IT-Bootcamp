package br.com.mercadolivre.model;

import br.com.mercadolivre.interfaces.ImprimirDocumentos;

import java.util.ArrayList;
import java.util.List;

public class Curriculos implements ImprimirDocumentos<Curriculos> {

    private String nome;
    private int idade;
    private List<String> habilidade = new ArrayList();

    public Curriculos(String nome, int idade, List<String> habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public String printDoc(Curriculos doc) {
        return doc.toString();
    }

    @Override
    public String toString() {
        return "br.com.mercadolivre.model.Curriculos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", habilidade=" + habilidade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<String> getHabilidade() {
        return habilidade;
    }
}
