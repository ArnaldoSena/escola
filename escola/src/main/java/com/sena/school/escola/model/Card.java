package com.sena.school.escola.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.sena.school.escola.database.UserDB;

@XmlRootElement
public class Card {
	
	private int idCard = 1234;
	private Date expired = new Date();
	private int codeCard = 123; // three number behind
	private int password = 1234;	
	private boolean blocked = true;
	private User usuario;
	
	public Card() {}
	
	public Card(int idCard, int codeCard, Date expired, int password, boolean blocked) {
			this.idCard = idCard;
			this.expired = expired;
			this.codeCard = codeCard;
			this.blocked = blocked;
	}
	
	public void setUserCard(User usuario) {
		this.usuario = usuario;
	}
	
	public User getUser() {
		return usuario;
	}
	
	public int getIdCard() {
		return idCard;
	}
	
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	
	public Date getExpired() {
		return expired;
	}
	
	public void setExpired(Date expired) {
		this.expired = expired;
	}
	
	public int getCodeCard() {
		return codeCard;
	}
	
	public void setCodeCard(int codeCard) {
		this.codeCard = codeCard;
	}

	public boolean isBlocked() {
		return blocked;
	}
	
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
