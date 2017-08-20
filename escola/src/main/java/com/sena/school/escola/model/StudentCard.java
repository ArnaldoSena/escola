package com.sena.school.escola.model;

public class StudentCard extends Card implements Bancario, Autenticavel{

	private boolean isBancario = false;
	private double balance = 0.0;
	private boolean credit = false;
	
	public StudentCard() {}

	public StudentCard(boolean isBancario, double balance, boolean credit) {
		super();
		this.isBancario = isBancario;
		this.balance = balance;
		this.credit = credit;
	}


	@Override
	public boolean isBancario(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setDeposit(Double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setTransference() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isBancario() {
		return isBancario;
	}

	public void setBancario(boolean isBancario) {
		this.isBancario = isBancario;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public boolean autentica(String senha, String login) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isCredit() {
		return credit;
	}

	public void setCredit(boolean credit) {
		this.credit = credit;
	}
}
