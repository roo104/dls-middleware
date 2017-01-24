package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class HumanTaskInstanceFilterCq implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("entity")
	private String entity = null;
	
	@JsonProperty("fromDueDate")
	private LocalDate fromDueDate = null;
	
	@JsonProperty("toDueDate")
	private LocalDate toDueDate = null;
	
	@JsonProperty("assignedTo")
	private String assignedTo = null;
	
	@JsonProperty("taskName")
	private String taskName = null;
	
	@JsonProperty("labelText")
	private String labelText = null;
	
	@JsonProperty("processIdCq")
	private ProcessIdCq processIdCq = null;
	
	@JsonProperty("taskSeverityCq")
	private String taskSeverityCq = null;
	
	@JsonProperty("filterIdCq")
	private FilterIdCq filterIdCq = null;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEntity() {
		return entity;
	}
	
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	public LocalDate getFromDueDate() {
		return fromDueDate;
	}
	
	public void setFromDueDate(LocalDate fromDueDate) {
		this.fromDueDate = fromDueDate;
	}
	
	public LocalDate getToDueDate() {
		return toDueDate;
	}
	
	public void setToDueDate(LocalDate toDueDate) {
		this.toDueDate = toDueDate;
	}
	
	public String getAssignedTo() {
		return assignedTo;
	}
	
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getLabelText() {
		return labelText;
	}
	
	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}
	
	public ProcessIdCq getProcessIdCq() {
		return processIdCq;
	}
	
	public void setProcessIdCq(ProcessIdCq processIdCq) {
		this.processIdCq = processIdCq;
	}
	
	public String getTaskSeverityCq() {
		return taskSeverityCq;
	}
	
	public void setTaskSeverityCq(String taskSeverityCq) {
		this.taskSeverityCq = taskSeverityCq;
	}
	
	public FilterIdCq getFilterIdCq() {
		return filterIdCq;
	}
	
	public void setFilterIdCq(FilterIdCq filterIdCq) {
		this.filterIdCq = filterIdCq;
	}
}

