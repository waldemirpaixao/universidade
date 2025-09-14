package br.edu.universidade.service;

import java.util.List;

import br.edu.universidade.model.Telefone;
import br.edu.universidade.repository.TelefoneRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ServiceTelefone {

    @Inject
    TelefoneRepository telefoneRepository;

    @Transactional
    public Telefone cadastrar(Telefone telefone) {

        telefoneRepository.persist(telefone);
        return telefone; // Return the saved Telefone entity
    }


    public List<Telefone> listarTodos(){

        return  telefoneRepository.listAll();
    }

}
