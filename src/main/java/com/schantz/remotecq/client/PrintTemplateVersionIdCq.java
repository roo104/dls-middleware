package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PrintTemplateVersionIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("printTemplateIdCq")
	private PrintTemplateIdCq printTemplateIdCq = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public PrintTemplateIdCq getPrintTemplateIdCq() {
		return printTemplateIdCq;
	}
	
	public void setPrintTemplateIdCq(PrintTemplateIdCq printTemplateIdCq) {
		this.printTemplateIdCq = printTemplateIdCq;
	}
}

