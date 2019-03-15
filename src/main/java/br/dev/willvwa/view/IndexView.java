package br.dev.willvwa.view;

import br.dev.willvwa.controller.PessoaFisicaController;
import br.dev.willvwa.model.clients.PessoaFisica;
import br.dev.willvwa.view.abstracted.View;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@ViewScoped
@Named
public class IndexView extends View {

    @Inject
    private PessoaFisicaController pessoaFisicaController;

    private PessoaFisica pessoaForm;

    private PessoaFisica pessoaSelecionada;

    private List<PessoaFisica> pessoas;

    @PostConstruct
    private void innit (){
        pessoaForm = new PessoaFisica();
        atualizarTabela();
    }

    public void cadastrar(){
        pessoaFisicaController.salvar(pessoaForm);
        limpar();
        atualizarTabela();
    }

    public void limpar(){
        this.pessoaForm = new PessoaFisica();
    }

    public void atualizarTabela() {
        this.pessoas = pessoaFisicaController.encontrarTodos();
    }

    public void excluir(){
        pessoaFisicaController.remover(pessoaSelecionada);
        limpar();
        atualizarTabela();
    }

    public void aoSelecionar(){
        this.pessoaForm = pessoaSelecionada;
    }

    public void aoDesselecionar(){
        limpar();
    }

    public void setPessoas(List<PessoaFisica> pessoas) {
        this.pessoas = pessoas;
    }

    public PessoaFisica getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(PessoaFisica pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public PessoaFisica getPessoaForm() {
        return pessoaForm;
    }

    public void setPessoaForm(PessoaFisica pessoaForm) {
        this.pessoaForm = pessoaForm;
    }

    public List<PessoaFisica> getPessoas() {
        return pessoas;
    }
}
