package com.sena.school.escola.database;

import java.util.Date;

public class Registro {
	
	private int UserId;
	private Date dataReg;
	
	public int getUserId() {
		return UserId;
	}
	
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public Date getDataReg() {
		return dataReg;
	}
	
	public void setDataReg(Date dataReg) {
		this.dataReg = dataReg;
	}
	
}
