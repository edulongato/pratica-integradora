package com.descomplica.aula.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turma")
    private Integer idTurma;

    @Column(name = "horario")
    private LocalTime horario;

    @Column(name = "duracao")
    private int duracaoTurma;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "idInstrutor")
    private Instrutor instrutor;

}
