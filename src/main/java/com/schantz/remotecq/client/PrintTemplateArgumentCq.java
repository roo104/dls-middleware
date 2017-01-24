package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PrintTemplateArgumentCq implements Serializable {
	@JsonProperty("required")
	private Boolean required = false;
	
	@JsonProperty("editable")
	private Boolean editable = false;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("printTemplateArgumentIdCq")
	private PrintTemplateArgumentIdCq printTemplateArgumentIdCq = null;
	
	
	public Boolean getRequired() {
		return required;
	}
	
	public void setRequired(Boolean required) {
		this.required = required;
	}
	
	public Boolean getEditable() {
		return editable;
	}
	
	public void setEditable(Boolean editable) {
		this.editable = editable;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PrintTemplateArgumentIdCq getPrintTemplateArgumentIdCq() {
		return printTemplateArgumentIdCq;
	}
	
	public void setPrintTemplateArgumentIdCq(PrintTemplateArgumentIdCq printTemplateArgumentIdCq) {
		this.printTemplateArgumentIdCq = printTemplateArgumentIdCq;
	}
}

