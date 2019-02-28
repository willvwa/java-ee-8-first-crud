package br.dev.willvwa.repository;

import br.dev.willvwa.model.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PessoaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void salvar(Pessoa pessoa) {

        entityManager.persist(pessoa);
    }

    public List<Pessoa> consultar() {

        return entityManager.createQuery("SELECT P from Pessoa P", Pessoa.class).getResultList();
    }

    @Transactional
    public void remover(Pessoa pessoa) {

        entityManager.remove(entityManager.merge(pessoa));
    }
}
