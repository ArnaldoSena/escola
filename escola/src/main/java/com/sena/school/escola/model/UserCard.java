package com.sena.school.escola.model;

public class UserCard extends Card implements Autenticavel {

	private String[] access = null;
	
	public UserCard() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean autentica(String senha, String login) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
