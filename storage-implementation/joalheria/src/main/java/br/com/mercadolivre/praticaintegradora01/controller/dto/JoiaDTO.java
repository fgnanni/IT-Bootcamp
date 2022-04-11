package br.com.mercadolivre.praticaintegradora01.controller.dto;

import br.com.mercadolivre.praticaintegradora01.model.Joia;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
public class JoiaDTO {

    private Long id;
    private String material;
    private double peso;
    private int quilates;

    public static JoiaDTO converter(Joia joia){
        JoiaDTO joiaConvert = new JoiaDTO();
        joiaConvert.setId(joia.getId());
        joiaConvert.setMaterial(joia.getMaterial());
        joiaConvert.setPeso(joia.getPeso());
        joiaConvert.setQuilates(joia.getQuilates());
        return joiaConvert;
    }

    public static List<JoiaDTO> converter(List<Joia> joias){

        List<JoiaDTO> joiasDTO = joias.stream().map(JoiaDTO::converter).collect(Collectors.toList());
        return joiasDTO;
    }
}
