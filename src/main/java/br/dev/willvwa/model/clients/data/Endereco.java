package br.dev.willvwa.model.clients.data;

import br.dev.willvwa.model.abstracted.Entidade;
import br.dev.willvwa.model.clients.Pessoa;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Endereco extends Entidade {

    @Column
    @NotEmpty(message = "Informe a rua!")
    private String logradouro;

    @ManyToOne
    private Pessoa pessoa;
}
