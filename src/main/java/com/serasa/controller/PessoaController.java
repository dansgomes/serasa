package com.serasa.controller;

import com.serasa.domain.Pessoa;
import com.serasa.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
@AllArgsConstructor
public class PessoaController {

    private PessoaService service;

    @GetMapping("/{cpf}")
    public Pessoa exibirPessoa(@PathVariable String cpf){
        return this.service.exibirPessoa(cpf);
    }

    @GetMapping("/todos")
    public List<Pessoa> exibirTodosOsNomesSujos(){
        return this.service.exibirTodosOsNomesSujos();
    }

    @PostMapping
    public String adicionarNomeNoSerasa(@RequestBody Pessoa pessoa) {
        return this.service.adicionarNomeNoSerasa(pessoa);
    }

    @PostMapping("/varios")
    public String adicionarVariosNomeNoSerasa(@RequestBody List<Pessoa> pessoa) {

        pessoa.forEach(p -> this.service.adicionarNomeNoSerasa(p));
        return "Pessoas adicionado com sucesso!";
    }

    @DeleteMapping
    public String retirarNomeDoSerasa(@RequestBody Pessoa pessoa) {
        return this.service.retirarNomeDoSerasa(pessoa);
    }
}
