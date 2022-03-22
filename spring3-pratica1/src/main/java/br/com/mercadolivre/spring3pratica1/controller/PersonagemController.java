package br.com.mercadolivre.spring3pratica1.controller;

import br.com.mercadolivre.spring3pratica1.dto.PersonagemDTO;
import br.com.mercadolivre.spring3pratica1.model.Personagem;
import br.com.mercadolivre.spring3pratica1.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class PersonagemController {

    private final PersonagemService personagemService;

    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping("/personagem/{nomePersonagem}")
    public ResponseEntity<List<PersonagemDTO>> buscarPersonagem(@PathVariable String nomePersonagem){

        List<PersonagemDTO> personagensFiltrados = PersonagemDTO.converter(personagemService.filtrarPorNome(nomePersonagem.toUpperCase()));

        return ResponseEntity.ok(personagensFiltrados);

    }

    @PostMapping("personagem/adicionarPersonagem")
    public ResponseEntity<List<PersonagemDTO>> salvarPersonagem(@RequestBody List<Personagem> listaPersonagens){

            List<PersonagemDTO> personagens = PersonagemDTO.converter(personagemService.salvar(listaPersonagens));


            return ResponseEntity.status(HttpStatus.CREATED).body(personagens);
        }
}
