package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PrintTemplateVersionChildCq implements Serializable {
	@JsonProperty("defaultSelected")
	private Boolean defaultSelected = false;
	
	@JsonProperty("required")
	private Boolean required = false;
	
	@JsonProperty("template")
	private PrintTemplateVersionCq template = null;
	
	
	public Boolean getDefaultSelected() {
		return defaultSelected;
	}
	
	public void setDefaultSelected(Boolean defaultSelected) {
		this.defaultSelected = defaultSelected;
	}
	
	public Boolean getRequired() {
		return required;
	}
	
	public void setRequired(Boolean required) {
		this.required = required;
	}
	
	public PrintTemplateVersionCq getTemplate() {
		return template;
	}
	
	public void setTemplate(PrintTemplateVersionCq template) {
		this.template = template;
	}
}

