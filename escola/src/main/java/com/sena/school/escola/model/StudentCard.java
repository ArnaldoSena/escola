package com.sena.school.escola.model;

public class StudentCard extends Card implements Bancario{

	@Override
	public boolean isBancario(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

}
