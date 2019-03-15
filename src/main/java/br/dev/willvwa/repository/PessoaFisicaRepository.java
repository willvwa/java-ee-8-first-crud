package br.dev.willvwa.repository;

import br.dev.willvwa.model.clients.PessoaFisica;
import br.dev.willvwa.repository.abstracted.Repository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PessoaFisicaRepository extends Repository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void salvar(PessoaFisica pessoaFisica) {

        entityManager.persist(pessoaFisica);
    }

    public List<PessoaFisica> encontrarTodos() {

        return entityManager.createQuery("SELECT PessoaFisica from PessoaFisica P", PessoaFisica.class).getResultList();
    }

    @Transactional
    public void remover(PessoaFisica pessoaFisica) {

        entityManager.remove(entityManager.merge(pessoaFisica));
    }
}

