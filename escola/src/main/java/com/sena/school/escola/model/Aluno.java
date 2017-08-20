package com.sena.school.escola.model;

public class Aluno extends User implements Autenticavel{
	private String password;
	private String login;
	
	@Override
	public boolean autentica(String senha, String login) {
		if (senha == this.password && login == this.login) {
			return true;
		}
		return false;
	}
	
	
}
