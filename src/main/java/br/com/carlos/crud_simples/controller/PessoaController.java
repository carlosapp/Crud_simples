package br.com.carlos.crud_simples.controller;

import br.com.carlos.crud_simples.model.Pessoa;
import br.com.carlos.crud_simples.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/*@CrossOrigin(origins = {
        "https://meu-front-principal.com",
        "https://admin.meusistema.com",
        "http://localhost:3000" // para desenvolvimento local */
@RestController
@RequestMapping("/pessoas")
@CrossOrigin(origins = "*") // Habilita requisições de qualquer origem (útil para usar com frontend separado)
//@CrossOrigin(origins = "https://meu-frontend.com") // <- troque pelo domínio real
public class PessoaController {


    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa) {
        return service.salvar(pessoa);
    }

    @PutMapping("/{id}")
    public Pessoa atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        pessoa.setId(id);
        return service.salvar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
