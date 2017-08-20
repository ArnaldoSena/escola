package com.sena.school.escola.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reader {
	private String firmware = "";
	private String idReader = "";
	
	public String getFirmware() {
		return firmware;
	}
	
	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}
	
	public String getIdReader() {
		return idReader;
	}
	
	public void setIdReader(String idReade) {
		this.idReader = idReade;
	}	
}
