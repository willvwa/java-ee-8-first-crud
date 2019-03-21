package br.dev.willvwa.model.clients;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;

@Entity
public class PessoaFisica extends Pessoa {

    @Column
    private Long cpf;

    @NotEmpty(message = "Informe um sobrenome!")
    @Column
    private String sobrenome;

    @PastOrPresent
    @Temporal(TemporalType.DATE)
    @Column
    private Date dataNascimento;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
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
}
