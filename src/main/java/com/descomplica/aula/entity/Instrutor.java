package com.descomplica.aula.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstrutor;

    private int RG;
    private String nome;
    private Date nascimento;
    private int titulacao;

}
