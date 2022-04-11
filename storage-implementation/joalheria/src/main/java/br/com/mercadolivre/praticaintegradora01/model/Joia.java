package br.com.mercadolivre.praticaintegradora01.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_joia")
    private Long id;
    private String material;
    private double peso;
    private int quilates;

}
