package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreatePrePaymentCommand implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("dueDate")
	private LocalDate dueDate = null;
	
	@JsonProperty("externalReference")
	private String externalReference = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("paymentTypeCq")
	private String paymentTypeCq = null;
	
	@JsonProperty("legalPartyIdCq")
	private LegalPartyIdCq legalPartyIdCq = null;
	
	@JsonProperty("isIsManual")
	private Boolean isIsManual = false;
	
	
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
	
	public String getExternalReference() {
		return externalReference;
	}
	
	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPaymentTypeCq() {
		return paymentTypeCq;
	}
	
	public void setPaymentTypeCq(String paymentTypeCq) {
		this.paymentTypeCq = paymentTypeCq;
	}
	
	public LegalPartyIdCq getLegalPartyIdCq() {
		return legalPartyIdCq;
	}
	
	public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
		this.legalPartyIdCq = legalPartyIdCq;
	}
	
	public Boolean getIsIsManual() {
		return isIsManual;
	}
	
	public void setIsIsManual(Boolean isIsManual) {
		this.isIsManual = isIsManual;
	}
}

