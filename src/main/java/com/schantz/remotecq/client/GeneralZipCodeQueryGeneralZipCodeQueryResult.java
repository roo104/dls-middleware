package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class GeneralZipCodeQueryGeneralZipCodeQueryResult implements Serializable {
	@JsonProperty("zipCode")
	private String zipCode = null;
	
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}

