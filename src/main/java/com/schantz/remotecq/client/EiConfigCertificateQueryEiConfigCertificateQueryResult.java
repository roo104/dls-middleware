package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EiConfigCertificateQueryEiConfigCertificateQueryResult implements Serializable {
	@JsonProperty("partner")
	private String partner = null;
	
	
	public String getPartner() {
		return partner;
	}
	
	public void setPartner(String partner) {
		this.partner = partner;
	}
}

