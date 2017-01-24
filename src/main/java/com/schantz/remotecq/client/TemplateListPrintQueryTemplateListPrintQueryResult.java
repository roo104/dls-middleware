package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TemplateListPrintQueryTemplateListPrintQueryResult implements Serializable {
	@JsonProperty("printTemplateTypeCq")
	private String printTemplateTypeCq = null;
	
	@JsonProperty("printTemplateStatusCq")
	private String printTemplateStatusCq = null;
	
	
	public String getPrintTemplateTypeCq() {
		return printTemplateTypeCq;
	}
	
	public void setPrintTemplateTypeCq(String printTemplateTypeCq) {
		this.printTemplateTypeCq = printTemplateTypeCq;
	}
	
	public String getPrintTemplateStatusCq() {
		return printTemplateStatusCq;
	}
	
	public void setPrintTemplateStatusCq(String printTemplateStatusCq) {
		this.printTemplateStatusCq = printTemplateStatusCq;
	}
}

