package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("uf")
public class UfRest {


	@GET
	@Path("hello")
	public Response helloWorld(){
		System.out.println("novo acesso");
		
		return Response.status(200).entity("Hello world").build();
		
		
		
	}
}
