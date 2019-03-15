package br.dev.willvwa.service;

import br.dev.willvwa.model.clients.PessoaFisica;
import br.dev.willvwa.repository.PessoaFisicaRepository;
import br.dev.willvwa.service.abstracted.Service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PessoaFisicaService extends Service {

    @Inject
    private PessoaFisicaRepository pessoaFisicaRepository;

    public void salvar(PessoaFisica pessoaFisica) {

        this.pessoaFisicaRepository.salvar(pessoaFisica);
    }

    public List<PessoaFisica> encontrarTodos() {

        return this.pessoaFisicaRepository.encontrarTodos();
    }

    public void remover(PessoaFisica pessoaFisica) {

        this.pessoaFisicaRepository.remover(pessoaFisica);
    }
}
