package com.sena.school.escola;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sena.school.escola.database.CardsDB;
import com.sena.school.escola.database.Registro;
import com.sena.school.escola.database.UserDB;
import com.sena.school.escola.model.Card;
import com.sena.school.escola.model.User;

@Path("register")
public class Register {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMensagem() {
		return "GET teste";
	}
	
	@GET
	@Path("/{idCard}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean getMessagem(@PathParam("idCard") int idCard) {
		//TO DO verifica se existe e se tem autorizacao 
		Card cartao = (new CardsDB()).getCard(idCard);
		if ((cartao != null) && (!cartao.isBlocked())) {
			Registro registro = new Registro();
			registro.setDataReg(new Date());
			registro.setUserId(cartao.getUser().getId() );
			System.out.println(registro.toString());
			return true;
		}
		//TO DO registra a batida em tread
		
		
		return false;
	}
	
	@POST
	@Path("/{idCard}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String setRegister(@PathParam("idCard") int idCard) {
		return Integer.toString(idCard);
	}
	
	
	
}
