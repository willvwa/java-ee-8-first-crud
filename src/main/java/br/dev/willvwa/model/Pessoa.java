package br.dev.willvwa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Objects;

@Entity //JPA
public class Pessoa extends Entidade {

    @NotEmpty(message = "Informe um nome!") //Bean Validation
    private String nome;

    @NotEmpty(message = "Informe um sobrenome!") //Bean Validation
    private String sobrenome;

    private Date dataNascimento;

    private Long cpf;

    @Email
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(sobrenome, pessoa.sobrenome) &&
                Objects.equals(dataNascimento, pessoa.dataNascimento) &&
                Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, dataNascimento, cpf, email);
    }
}
