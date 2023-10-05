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


    @GetMapping("cpf/{cpf}")
    public Pessoa exibirPessoaPorCpf(@PathVariable String cpf){

        List<Pessoa> listaPessoas = List.of(new Pessoa("Rafael", "123", "21324"), new Pessoa("Daniel","1234", "1235555"), new Pessoa());

        for (int i = 0; i < listaPessoas.size(); i++) {

            if(listaPessoas.get(i).getCpf().equals(cpf)){
                return listaPessoas.get(i);
            }
        }

        return new Pessoa();
    }

    @GetMapping("rg/{rg}")
    public Pessoa exibirPessoaPorRG(@PathVariable String rg){
        return null;
    }
}
