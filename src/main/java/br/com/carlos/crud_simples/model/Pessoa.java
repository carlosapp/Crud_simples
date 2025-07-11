package br.com.carlos.crud_simples.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = true, length = 11)
    private String cpf;
    @Column(nullable = false)
    private boolean ativo; //sempre true

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, boolean ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.ativo = ativo;
    }





}
