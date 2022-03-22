package br.com.mercadolivre.spring3pratica1.dto;

import br.com.mercadolivre.spring3pratica1.model.Personagem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonagemDTO {

    private String name;
    private int height;
    private int mass;
    private String gender;
    private String homeworld;
    private String species;

    public PersonagemDTO converter(Personagem personagem){

        this.name = personagem.getName();
        this.height = personagem.getHeight();
        this.mass = personagem.getMass();
        this.gender = personagem.getGender();
        this.homeworld = personagem.getHomeworld();
        this.species = personagem.getSpecies();

        return this;
    }

    public static List<PersonagemDTO> converter(List<Personagem> personagens){
        //return anuncios.stream().map(a -> new AnuncioDTO(a.getTitulo(), a.getValor(), a.getCategoria())).collect(Collectors.toList());
        return personagens.stream().map(a -> new PersonagemDTO(a.getName(), a.getHeight(), a.getMass(), a.getGender(), a.getHomeworld(), a.getSpecies())).collect(Collectors.toList());
    }



}
