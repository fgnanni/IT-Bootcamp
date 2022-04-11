package br.com.mercadolivre.praticaintegradora01.controller;


import br.com.mercadolivre.praticaintegradora01.controller.dto.JoiaDTO;
import br.com.mercadolivre.praticaintegradora01.model.Joia;
import br.com.mercadolivre.praticaintegradora01.service.JoiaService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class JoiaController {

    private final JoiaService joiaService;

    @PostMapping("/joia/inserir")
    public ResponseEntity<String> salvaJoia(@RequestBody Joia joia){
        JoiaDTO joiaSalva = joiaService.saveJoia(joia);
        return ResponseEntity.status(HttpStatus.CREATED).body("Joia salva! Numero: " + joiaSalva.getId());
    }

    @GetMapping("/joias")
    public ResponseEntity<List<JoiaDTO>> listarJoias(){
        List<JoiaDTO> listaJoias = joiaService.getJoias();
        return ResponseEntity.status(HttpStatus.OK).body(listaJoias);
    }

    @DeleteMapping("joia/excluir")
    public ResponseEntity<String> deletarJoia(@RequestParam Long id){
        joiaService.deleteJoia(id);
        return ResponseEntity.status(HttpStatus.OK).body("Joia deletada com sucesso");
    }

    @PutMapping("joia/atualizar")
    public ResponseEntity<JoiaDTO> atualizarJoia(@RequestParam Long id, @RequestBody Joia joia){
        JoiaDTO joiaDTO = joiaService.updateJoia(id, joia);
        return ResponseEntity.status(HttpStatus.OK).body(joiaDTO);
    }

}
