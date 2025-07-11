package br.com.carlos.crud_simples.repository;

import br.com.carlos.crud_simples.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {


}
