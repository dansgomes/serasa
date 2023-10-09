package com.serasa.controller;

import com.serasa.domain.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private List<Pessoa> listaPessoas = List.of(new Pessoa("Rafael", "123"), new Pessoa("Daniel", "223"), new Pessoa("João", "321"));

    @GetMapping("cpf/{cpf}")
    public Pessoa exibirPessoaPorCpf(@PathVariable String cpf) {


        for (int i = 0; i < listaPessoas.size(); i++) {

            if (listaPessoas.get(i).getCpf().equals(cpf)) {
                return listaPessoas.get(i);
            }
        }

        return new Pessoa();
    }

    @GetMapping("rg/{rg}")
    public Pessoa exibirPessoaPorRG(@PathVariable String rg) {

        for (int i = 0; i < listaPessoas.size(); i++) {

            if (listaPessoas.get(i).getRg().equals(rg)) {
                return listaPessoas.get(i);
            }
        }
        return new Pessoa();
    }

    @GetMapping("telefone/{telefone}")
    public Pessoa exibirPessoaPorTelefone(@PathVariable String telefone) {
        for (int i = 0; i < listaPessoas.size(); i++) {

            if (listaPessoas.get(i).getRg().equals(telefone)) {
                return listaPessoas.get(i);
            }
            return new Pessoa();
        }
    }
}

