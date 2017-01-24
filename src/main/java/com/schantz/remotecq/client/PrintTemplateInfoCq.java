package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PrintTemplateInfoCq implements Serializable {
	@JsonProperty("ended")
	private Boolean ended = false;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("outOfService")
	private Boolean outOfService = false;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("activeVersionStartDate")
	private LocalDate activeVersionStartDate = null;
	
	@JsonProperty("baseStartDate")
	private LocalDate baseStartDate = null;
	
	@JsonProperty("baseEndDate")
	private LocalDate baseEndDate = null;
	
	@JsonProperty("createdBy")
	private String createdBy = null;
	
	@JsonProperty("printTemplateIdCq")
	private PrintTemplateIdCq printTemplateIdCq = null;
	
	@JsonProperty("printTemplateStatusCq")
	private String printTemplateStatusCq = null;
	
	@JsonProperty("printTemplateTypeCq")
	private String printTemplateTypeCq = null;
	
	
	public Boolean getEnded() {
		return ended;
	}
	
	public void setEnded(Boolean ended) {
		this.ended = ended;
	}
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public Boolean getOutOfService() {
		return outOfService;
	}
	
	public void setOutOfService(Boolean outOfService) {
		this.outOfService = outOfService;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getActiveVersionStartDate() {
		return activeVersionStartDate;
	}
	
	public void setActiveVersionStartDate(LocalDate activeVersionStartDate) {
		this.activeVersionStartDate = activeVersionStartDate;
	}
	
	public LocalDate getBaseStartDate() {
		return baseStartDate;
	}
	
	public void setBaseStartDate(LocalDate baseStartDate) {
		this.baseStartDate = baseStartDate;
	}
	
	public LocalDate getBaseEndDate() {
		return baseEndDate;
	}
	
	public void setBaseEndDate(LocalDate baseEndDate) {
		this.baseEndDate = baseEndDate;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public PrintTemplateIdCq getPrintTemplateIdCq() {
		return printTemplateIdCq;
	}
	
	public void setPrintTemplateIdCq(PrintTemplateIdCq printTemplateIdCq) {
		this.printTemplateIdCq = printTemplateIdCq;
	}
	
	public String getPrintTemplateStatusCq() {
		return printTemplateStatusCq;
	}
	
	public void setPrintTemplateStatusCq(String printTemplateStatusCq) {
		this.printTemplateStatusCq = printTemplateStatusCq;
	}
	
	public String getPrintTemplateTypeCq() {
		return printTemplateTypeCq;
	}
	
	public void setPrintTemplateTypeCq(String printTemplateTypeCq) {
		this.printTemplateTypeCq = printTemplateTypeCq;
	}
}

