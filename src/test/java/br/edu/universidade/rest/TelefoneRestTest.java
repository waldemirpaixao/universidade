package br.edu.universidade.rest;

import org.junit.jupiter.api.Test;

import br.edu.universidade.testContainerOracle.OracleContainerTest;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

@QuarkusTest
@QuarkusTestResource(OracleContainerTest.class) 
public class TelefoneRestTest {

  @Test
  public void testTelefoneEndpoint() {

    String json = """
            {
        	"ddd":"(81)",
        	"idAluno":1,
        	"numero":"99119-7359",
        	"observacao":"Telefone pessoal",
        	"tipo":"Celular"

        }
            """;

    given()
        .contentType("application/json")
        .body(json)
        .when().post("/v1/telefone")
        .then()
        .statusCode(201);

  }

}