package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("cidade")
public class CidadeRest {

	@GET
	@Path("olagalera/{parametro}")
	public Response exibirUmaMensagem(@PathParam("parametro") String nome) {
		return Response.status(200).entity("Ola galera fera " + nome).build();
	}
}
