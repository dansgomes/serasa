package com.serasa;

import com.serasa.domain.Pessoa;
import com.serasa.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SerasaAulaApplication implements CommandLineRunner {

    @Autowired
    private PessoaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SerasaAulaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List.of(new Pessoa("Rafael", "121212"),new Pessoa("Daniel", "131313"),new Pessoa("Paulo", "141414"),new Pessoa("Amanda", "151515"))
                .forEach(pessoa -> this.repository.adicionarNomeNoSerasa(pessoa));
    }
}
