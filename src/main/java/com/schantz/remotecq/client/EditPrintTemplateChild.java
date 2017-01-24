package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EditPrintTemplateChild implements Serializable {
	@JsonProperty("required")
	private Boolean required = false;
	
	@JsonProperty("defaultSelected")
	private Boolean defaultSelected = false;
	
	@JsonProperty("printTemplateIdCq")
	private PrintTemplateIdCq printTemplateIdCq = null;
	
	
	public Boolean getRequired() {
		return required;
	}
	
	public void setRequired(Boolean required) {
		this.required = required;
	}
	
	public Boolean getDefaultSelected() {
		return defaultSelected;
	}
	
	public void setDefaultSelected(Boolean defaultSelected) {
		this.defaultSelected = defaultSelected;
	}
	
	public PrintTemplateIdCq getPrintTemplateIdCq() {
		return printTemplateIdCq;
	}
	
	public void setPrintTemplateIdCq(PrintTemplateIdCq printTemplateIdCq) {
		this.printTemplateIdCq = printTemplateIdCq;
	}
}

