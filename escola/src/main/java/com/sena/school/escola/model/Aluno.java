package com.sena.school.escola.model;

public class Aluno extends User implements Autenticavel{
	private String password;
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean autentica(String senha) {
		if(senha == password) return false; else return true;
	}
}
