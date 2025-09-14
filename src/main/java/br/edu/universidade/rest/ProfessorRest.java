package br.edu.universidade.rest;

import br.edu.universidade.service.ProfessorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/professores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfessorRest {

    @Inject
    private ProfessorService professorService;

    @GET
    public Response ListarTodos() {

        return Response.ok(professorService.ListarTodos()).build();
    }

}
