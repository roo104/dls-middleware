package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class DkTaxCardCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("creationDate")
	private OffsetDateTime creationDate = null;
	
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("taxPct")
	private Double taxPct = null;
	
	@JsonProperty("taxAllowance")
	private Double taxAllowance = null;
	
	@JsonProperty("taxOverride")
	private Double taxOverride = null;
	
	@JsonProperty("dkTaxCardStateCq")
	private String dkTaxCardStateCq = null;
	
	@JsonProperty("dkTaxCardTypeCq")
	private String dkTaxCardTypeCq = null;
	
	@JsonProperty("dkTaxCardSubscriptionStateCq")
	private String dkTaxCardSubscriptionStateCq = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public OffsetDateTime getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(OffsetDateTime creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public Double getTaxPct() {
		return taxPct;
	}
	
	public void setTaxPct(Double taxPct) {
		this.taxPct = taxPct;
	}
	
	public Double getTaxAllowance() {
		return taxAllowance;
	}
	
	public void setTaxAllowance(Double taxAllowance) {
		this.taxAllowance = taxAllowance;
	}
	
	public Double getTaxOverride() {
		return taxOverride;
	}
	
	public void setTaxOverride(Double taxOverride) {
		this.taxOverride = taxOverride;
	}
	
	public String getDkTaxCardStateCq() {
		return dkTaxCardStateCq;
	}
	
	public void setDkTaxCardStateCq(String dkTaxCardStateCq) {
		this.dkTaxCardStateCq = dkTaxCardStateCq;
	}
	
	public String getDkTaxCardTypeCq() {
		return dkTaxCardTypeCq;
	}
	
	public void setDkTaxCardTypeCq(String dkTaxCardTypeCq) {
		this.dkTaxCardTypeCq = dkTaxCardTypeCq;
	}
	
	public String getDkTaxCardSubscriptionStateCq() {
		return dkTaxCardSubscriptionStateCq;
	}
	
	public void setDkTaxCardSubscriptionStateCq(String dkTaxCardSubscriptionStateCq) {
		this.dkTaxCardSubscriptionStateCq = dkTaxCardSubscriptionStateCq;
	}
}

