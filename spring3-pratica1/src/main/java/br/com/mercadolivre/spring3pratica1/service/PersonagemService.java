package br.com.mercadolivre.spring3pratica1.service;

import br.com.mercadolivre.spring3pratica1.model.Personagem;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PersonagemService {

    private static List<Personagem> personagens = new ArrayList<Personagem>();


//    static {
//
//        personagens.addAll(Arrays.asList(
//                new Personagem("flavio", 1,75, "castanho", "branco", "vermelho","21/07/2000", "Masculino", "Terra", "Humano")));
//    }

    public List<Personagem> filtrarPorNome(String nomePersonagem){

        return personagens.stream().filter(nome -> nome.getName().startsWith(nomePersonagem)).collect(Collectors.toList());
    }

    public List<Personagem> salvar(List<Personagem> listaPersonagens) {

            listaPersonagens.forEach(personagem -> personagens.add(personagem));

         return personagens;
    }

}
