package br.dev.willvwa.model.clients;

import javax.persistence.*;

@Entity
public class PessoaJuridica extends Pessoa {

    @Column
    private Long cnpj;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
