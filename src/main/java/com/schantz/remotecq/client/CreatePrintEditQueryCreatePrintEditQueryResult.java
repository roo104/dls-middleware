package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreatePrintEditQueryCreatePrintEditQueryResult implements Serializable {
	@JsonProperty("printContextCq")
	private PrintContextCq printContextCq = null;
	
	@JsonProperty("printTemplateVersionIdCq")
	private PrintTemplateVersionIdCq printTemplateVersionIdCq = null;
	
	
	public PrintContextCq getPrintContextCq() {
		return printContextCq;
	}
	
	public void setPrintContextCq(PrintContextCq printContextCq) {
		this.printContextCq = printContextCq;
	}
	
	public PrintTemplateVersionIdCq getPrintTemplateVersionIdCq() {
		return printTemplateVersionIdCq;
	}
	
	public void setPrintTemplateVersionIdCq(PrintTemplateVersionIdCq printTemplateVersionIdCq) {
		this.printTemplateVersionIdCq = printTemplateVersionIdCq;
	}
}

