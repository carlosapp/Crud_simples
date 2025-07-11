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
    @Column(unique = true, nullable = false, length = 11)
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
