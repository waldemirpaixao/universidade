package br.edu.universidade.service;

import java.util.List;

import br.edu.universidade.model.Professor;
import br.edu.universidade.repository.ProfessorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfessorService {

    @Inject
    private ProfessorRepository professorRepository;

    public List<Professor> ListarTodos() {

        return professorRepository.listAll();
    }

}
