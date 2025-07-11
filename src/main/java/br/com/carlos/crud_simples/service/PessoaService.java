package br.com.carlos.crud_simples.service;

import br.com.carlos.crud_simples.model.Pessoa;
import br.com.carlos.crud_simples.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

public class PessoaService {
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
