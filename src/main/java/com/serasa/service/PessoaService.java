package com.serasa.service;

import com.serasa.domain.Pessoa;
import com.serasa.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PessoaService {

    private PessoaRepository repository;

    public String adicionarNomeNoSerasa(Pessoa pessoa) {

        if(!this.repository.isNomeSujo(pessoa)){
            this.repository.adicionarNomeNoSerasa(pessoa);
            return pessoa.getNome() + " seu nome foi adicionado ao Serasa!";
        }

        return pessoa.getNome() + " já está com o nome sujo!";

    }

    public String retirarNomeDoSerasa(Pessoa pessoa) {
        if (this.repository.isNomeSujo(pessoa)) {
            this.repository.retirarNomeDoSerasa(pessoa);
            return pessoa.getNome() + " seu nome foi retirado do Serasa!";
        }
        return pessoa.getNome() + " não está com o nome sujo";
    }

    public List<Pessoa> exibirTodosOsNomesSujos() {
        return this.repository.exibirTodosOsNomesSujos();
    }


    public Pessoa exibirPessoa(String cpf) {

        if(this.repository.exibirPessoa(cpf).isEmpty()){
            return new Pessoa();
        }
        return this.repository.exibirPessoa(cpf).get();
    }
}
