package com.sena.school.escola.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reader {
	private String firmware = "";
	private String idReade = "";
	public String getFirmware() {
		return firmware;
	}
	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}
	public String getIdReade() {
		return idReade;
	}
	public void setIdReade(String idReade) {
		this.idReade = idReade;
	}
	
	
}
