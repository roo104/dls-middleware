package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreateManualAccountItemCommand implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("dueDate")
	private LocalDate dueDate = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("personIdCq")
	private PersonIdCq personIdCq = null;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public PersonIdCq getPersonIdCq() {
		return personIdCq;
	}
	
	public void setPersonIdCq(PersonIdCq personIdCq) {
		this.personIdCq = personIdCq;
	}
}

