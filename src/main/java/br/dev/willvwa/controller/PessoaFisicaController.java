package br.dev.willvwa.controller;

import br.dev.willvwa.controller.abstracted.Controller;
import br.dev.willvwa.model.clients.PessoaFisica;
import br.dev.willvwa.service.PessoaFisicaService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PessoaFisicaController extends Controller {

    @Inject
    private PessoaFisicaService pessoaFisicaService;

    public void salvar(PessoaFisica pessoaFisica) {

        this.pessoaFisicaService.salvar(pessoaFisica);
    }

    public List<PessoaFisica> encontrarTodos() {

        return this.pessoaFisicaService.encontrarTodos();
    }

    public void remover(PessoaFisica pessoaFisica) {

        this.pessoaFisicaService.remover(pessoaFisica);
    }
}
