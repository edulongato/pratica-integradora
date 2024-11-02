package com.descomplica.aula.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instrutor")
    private Long idInstrutor;

    @Column(name = "rg")
    private int RG;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nascimento")
    private LocalDate dataNascimento;

    @Column(name = "titulacao")
    private Integer titulacaoInstrutor;

    @OneToMany(mappedBy = "instrutor")
    private List<Turma> turmaList;

}
