package com.descomplica.aula.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurma;

    private LocalTime horario;
    private int duracao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Instrutor instrutor;

}
