package com.sena.school.escola;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("register")
public class Register {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMensagem() {
		return "GET teste";
	}
	
	@POST
	@Path("/{idCard}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public int setRegister(@PathParam("idCard") int idCard) {
		return idCard;
	}
	
}
