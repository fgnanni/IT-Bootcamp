package br.com.mercadolivre.praticaintegradora01.service;

import br.com.mercadolivre.praticaintegradora01.controller.dto.JoiaDTO;
import br.com.mercadolivre.praticaintegradora01.model.Joia;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IJoiaService {

    List<JoiaDTO> getJoias();
    JoiaDTO saveJoia (Joia joia);
    void deleteJoia(Long id);
    JoiaDTO updateJoia(Long id, Joia joia) throws RuntimeException;



}
