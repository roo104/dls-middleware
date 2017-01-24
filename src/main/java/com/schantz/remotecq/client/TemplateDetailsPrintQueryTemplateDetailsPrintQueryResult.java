package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TemplateDetailsPrintQueryTemplateDetailsPrintQueryResult implements Serializable {
	@JsonProperty("printTemplateIdCq")
	private PrintTemplateIdCq printTemplateIdCq = null;
	
	
	public PrintTemplateIdCq getPrintTemplateIdCq() {
		return printTemplateIdCq;
	}
	
	public void setPrintTemplateIdCq(PrintTemplateIdCq printTemplateIdCq) {
		this.printTemplateIdCq = printTemplateIdCq;
	}
}

