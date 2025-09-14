package br.edu.universidade.repository;


import br.edu.universidade.model.Aluno;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlunoRepository implements PanacheRepository<Aluno> {
    // Implementação de métodos específicos para o repositório de Alun, se necessário
    // Caso contrário, o PanacheRepository já fornece métodos básicos como findAll(), findById(), persist(), etc.

}
