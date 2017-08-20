package com.sena.school.escola.model;

public class User {
	private int id;
	private String nome;
	private String login;
	
	public User() {}
	
	public User(int id, String nome, String login) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	public User(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
