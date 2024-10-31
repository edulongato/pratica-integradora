package com.descomplica.aula.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInstrutor;

    private int RG;
    private String nome;
    private LocalDate nascimento;
    private Integer titulacao;

    @OneToMany(mappedBy = "instrutor")
    private List<Turma> turmas;

}
