package br.edu.universidade.rest;

import br.edu.universidade.model.Aluno;
import br.edu.universidade.repository.AlunoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/v1/alunos")

public class AlunoRest {

    @Inject
    AlunoRepository alunoRepository;


    @POST
    @Transactional
    public Response cadastrar(Aluno aluno){

        alunoRepository.persist(aluno);

        return Response.ok(aluno).status(Response.Status.CREATED).build();


    }

    @GET
    public Response listarTodos(){

        var alunos = alunoRepository.listAll();
        return Response.ok(alunos).status(Response.Status.OK).build();
    }

    @GET
    @Path("/{id}")
    public Response listarPorId(@PathParam("id") Long id){

        if(id != null){
           
            var aluno = alunoRepository.findById(id);
            if(aluno != null){
                return Response.ok(aluno).status(Response.Status.OK).build();
            }else{
                return Response.status(Response.Status.NOT_FOUND).build();
            }

        }

        return Response.status(Response.Status.BAD_REQUEST).build();

    }

}
