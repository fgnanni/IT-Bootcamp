package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter @Setter
public class SubjectDTO {

    @NotNull(message = "O ni=ome do assunto não pode ficar vazio.")
    @NotEmpty(message = "O ni=ome do assunto não pode ficar vazio.")
    @Pattern(regexp = "[A-Z]+", message = "O nome do assunto deve comecar com letra maiúscula.")
    @Max(value = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    String name;
    @NotNull(message = "A nota não pode estar vazia.")
    @Min(value = 0, message = "A nota mínima é 0.0.")
    @Max(value = 0, message = "A nota máxima é 10.0.")
    Double score;
}
