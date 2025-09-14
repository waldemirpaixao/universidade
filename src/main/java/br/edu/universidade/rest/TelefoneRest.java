package br.edu.universidade.rest;

import java.util.List;

import br.edu.universidade.model.Telefone;
import br.edu.universidade.service.ServiceTelefone;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/telefones")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TelefoneRest {

    @Inject
    ServiceTelefone serviceTelefone;

    @POST
    public Response cadastrar(Telefone telefone) {

       if (telefone == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        return Response.ok(serviceTelefone.cadastrar(telefone)).status(Response.Status.CREATED).build();


    }

    @GET
    public Response ListarTodos(){

        List<Telefone> telefone = serviceTelefone.listarTodos();

        return Response.ok(telefone).status(Response.Status.OK).build();
    }


}
