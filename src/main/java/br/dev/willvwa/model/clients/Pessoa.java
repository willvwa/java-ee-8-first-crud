package br.dev.willvwa.model.clients;

import br.dev.willvwa.model.abstracted.Entidade;
import br.dev.willvwa.model.clients.data.Endereco;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pessoa extends Entidade {

    @NotEmpty(message = "Informe um nome!")
    @Column
    private String nome;

    @Email(message = "Informe um email válido!")
    @Column
    private String email;

    @OneToMany
    private List<Endereco> enderecos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
