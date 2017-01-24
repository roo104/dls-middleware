package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreateTemplatePrintCommand implements Serializable {
	@JsonProperty("templateId")
	private String templateId = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("outOfService")
	private Boolean outOfService = false;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("printTemplateTypeCq")
	private String printTemplateTypeCq = null;
	
	
	public String getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getOutOfService() {
		return outOfService;
	}
	
	public void setOutOfService(Boolean outOfService) {
		this.outOfService = outOfService;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getPrintTemplateTypeCq() {
		return printTemplateTypeCq;
	}
	
	public void setPrintTemplateTypeCq(String printTemplateTypeCq) {
		this.printTemplateTypeCq = printTemplateTypeCq;
	}
}

