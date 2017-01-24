package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class StopPaymentAnnexSpecCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("stateTax")
	private Double stateTax = null;
	
	@JsonProperty("total")
	private Double total = null;
	
	@JsonProperty("inheritanceTax")
	private Double inheritanceTax = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	@JsonProperty("legalPartyIdCq")
	private LegalPartyIdCq legalPartyIdCq = null;
	
	@JsonProperty("paymentTaxTypeCq")
	private String paymentTaxTypeCq = null;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getStateTax() {
		return stateTax;
	}
	
	public void setStateTax(Double stateTax) {
		this.stateTax = stateTax;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Double getInheritanceTax() {
		return inheritanceTax;
	}
	
	public void setInheritanceTax(Double inheritanceTax) {
		this.inheritanceTax = inheritanceTax;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
	
	public LegalPartyIdCq getLegalPartyIdCq() {
		return legalPartyIdCq;
	}
	
	public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
		this.legalPartyIdCq = legalPartyIdCq;
	}
	
	public String getPaymentTaxTypeCq() {
		return paymentTaxTypeCq;
	}
	
	public void setPaymentTaxTypeCq(String paymentTaxTypeCq) {
		this.paymentTaxTypeCq = paymentTaxTypeCq;
	}
}

