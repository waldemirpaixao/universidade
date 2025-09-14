package br.edu.universidade.repository;


import br.edu.universidade.model.Cidade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CidadeRepository implements PanacheRepository<Cidade>{

}
