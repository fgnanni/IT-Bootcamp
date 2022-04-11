package br.com.mercadolivre.praticaintegradora01.service;

import br.com.mercadolivre.praticaintegradora01.controller.dto.JoiaDTO;
import br.com.mercadolivre.praticaintegradora01.model.Joia;
import br.com.mercadolivre.praticaintegradora01.repository.IJoiaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class JoiaService implements IJoiaService{

    private final IJoiaRepository joiaRepository;

    @Override
    public List<JoiaDTO> getJoias() {
        List<JoiaDTO> joias = JoiaDTO.converter(joiaRepository.findAll());
        return joias;
    }

    @Override
    public JoiaDTO saveJoia(Joia joia) {
        JoiaDTO joiaSalva = JoiaDTO.converter(joiaRepository.save(joia));
        return joiaSalva;
    }

    @Override
    public void deleteJoia(Long id) {
        Optional<Joia> joiaOP = joiaRepository.findById(id);
        if(!joiaOP.isPresent()){
            throw new RuntimeException("Id não encontrado");
        }

        joiaRepository.deleteById(id);
    }

    @Override
    public JoiaDTO updateJoia(Long id, Joia joia) {

        Optional<Joia> joiaOP = joiaRepository.findById(id);

        if(!joiaOP.isPresent()){
            throw new RuntimeException("Id não enconstrado");
        }

        joia.setId(id);

        return saveJoia(joia);
    }

}
