package com.sena.school.escola.database;

import java.util.ArrayList;
import java.util.List;

import com.sena.school.escola.model.User;

public class UserDB {
	
	private User usuario = new User();
	
	private static List<User> usuarios = new ArrayList<User>();
	
	public UserDB() {
		User user1 = new User(123, "Arnaldo", "arnaldosena", "123");
		User user2 = new User(234, "Mariana", "marianasena", "234");
		
		usuarios.add(user1);
		usuarios.add(user2);
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public static List<User> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(List<User> usuarios) {
		UserDB.usuarios = usuarios;
	}
	
	public User getUser(int idUser) {
		return usuarios.get(idUser);
	}
	
	public void addUser(User usuario) {
		this.usuarios.add(usuario);
	}
	
	public void deleteUser(User usuario) {
		usuarios.remove(usuario);
	}

}
