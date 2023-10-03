package com.serasa.repository;

import com.serasa.domain.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PessoaRepositoryImpl implements PessoaRepository {

    private List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public boolean isNomeSujo(Pessoa pessoa) {
        return this.pessoas.contains(pessoa);
    }

    @Override
    public void adicionarNomeNoSerasa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    @Override
    public void retirarNomeDoSerasa(Pessoa pessoa) {
        this.pessoas.remove(pessoa);
    }

    @Override
    public List<Pessoa> exibirTodosOsNomesSujos() {
        return this.pessoas;
    }

    @Override
    public Optional<Pessoa> exibirPessoa(String cpf) {
        return this.pessoas.stream().filter(pessoa -> pessoa.getCpf().equals(cpf)).findAny();
    }
}
