package com.sena.school.escola.model;

public interface Bancario {
	
	public boolean isBancario(Card card);
	public double getBalance();
	public double setDeposit(Double value);
	public double setTransference();
}
