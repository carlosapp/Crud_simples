package br.com.carlos.crud_simples.service;

import br.com.carlos.crud_simples.model.Pessoa;
import br.com.carlos.crud_simples.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Pessoa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
