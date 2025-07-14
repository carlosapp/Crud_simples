package br.com.carlos.crud_simples.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Setter
    @Getter
    private long id;
    @Column(nullable = false)
    private int numero;

    @Setter
    @Getter
    @Column(nullable = false)
    private boolean alugado; //sempre true

   // @Setter
   // @Getter
  //  private Pessoa pessoa ;

    public Apartamento(){

    }

    public Apartamento(int numero, boolean alugado) {
        this.numero = numero;
        this.alugado = alugado;
      //  this.pessoa = pessoa;

    }



}


