package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotEmpty(message = "O nome do aluno não pode ficar vazio.")
    @NotNull(message = "O nome do aluno não pode ficar vazio.")
    @NotBlank(message = "O nome do aluno não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do aluno deve comecar com letra maiuscula.")
    @Size(max = 50, message = "O comprimento do nome não pode exceder 50 caracteres.")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "A lista nao pode estar vazia.")
    List<SubjectDTO> subjects;
}
