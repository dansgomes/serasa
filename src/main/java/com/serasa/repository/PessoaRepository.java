package com.serasa.repository;

import com.serasa.domain.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository {

    boolean isNomeSujo(Pessoa pessoa);

    void adicionarNomeNoSerasa(Pessoa pessoa);

    void retirarNomeDoSerasa(Pessoa pessoa);

    List<Pessoa> exibirTodosOsNomesSujos();

    Optional<Pessoa> exibirPessoa(String cpf);
}
