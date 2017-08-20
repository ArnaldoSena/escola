package com.sena.school.escola.model;

public class User {
	private int idUser;
	private String nome;
	private String login;
	private String password;
	
	
	public User() {}
	

	public User(int idUser, String nome, String login, String password) {
		super();
		this.idUser = idUser;
		this.nome = nome;
		this.login = login;
		this.password = password;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	public User(int id, String nome) {
		this.idUser = id;
		this.nome = nome;
	}
	
	public int getId() {
		return idUser;
	}
	
	public void setId(int id) {
		this.idUser = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
