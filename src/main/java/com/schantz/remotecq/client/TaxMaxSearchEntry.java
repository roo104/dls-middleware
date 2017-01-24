package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TaxMaxSearchEntry implements Serializable {
	@JsonProperty("id")
	private Long id = null;
	
	@JsonProperty("transTime")
	private OffsetDateTime transTime = null;
	
	@JsonProperty("user")
	private String user = null;
	
	@JsonProperty("dueDate")
	private LocalDate dueDate = null;
	
	@JsonProperty("valeurDate")
	private LocalDate valeurDate = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("policyId")
	private PolicyIdCq policyId = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public OffsetDateTime getTransTime() {
		return transTime;
	}
	
	public void setTransTime(OffsetDateTime transTime) {
		this.transTime = transTime;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public LocalDate getValeurDate() {
		return valeurDate;
	}
	
	public void setValeurDate(LocalDate valeurDate) {
		this.valeurDate = valeurDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public PolicyIdCq getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(PolicyIdCq policyId) {
		this.policyId = policyId;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
}

