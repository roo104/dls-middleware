package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DeathAnnexSpecCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("total")
	private Double total = null;
	
	@JsonProperty("inhritanceTax")
	private Double inhritanceTax = null;
	
	@JsonProperty("tax")
	private Double tax = null;
	
	@JsonProperty("legalPartyIdCq")
	private LegalPartyIdCq legalPartyIdCq = null;
	
	@JsonProperty("paymentTaxTypeCq")
	private String paymentTaxTypeCq = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	@JsonProperty("deathAnnexStateTaxSpecCqCollection")
	private List<DeathAnnexStateTaxSpecCq> deathAnnexStateTaxSpecCqCollection = new ArrayList<DeathAnnexStateTaxSpecCq>();
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Double getInhritanceTax() {
		return inhritanceTax;
	}
	
	public void setInhritanceTax(Double inhritanceTax) {
		this.inhritanceTax = inhritanceTax;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
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
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
	
	public DeathAnnexSpecCq addDeathAnnexStateTaxSpecCqCollectionItem(DeathAnnexStateTaxSpecCq deathAnnexStateTaxSpecCqCollectionItem) {
		this.deathAnnexStateTaxSpecCqCollection.add(deathAnnexStateTaxSpecCqCollectionItem);
		return this;
	}
	
	public List<DeathAnnexStateTaxSpecCq> getDeathAnnexStateTaxSpecCqCollection() {
		return deathAnnexStateTaxSpecCqCollection;
	}
	
	public void setDeathAnnexStateTaxSpecCqCollection(List<DeathAnnexStateTaxSpecCq> deathAnnexStateTaxSpecCqCollection) {
		this.deathAnnexStateTaxSpecCqCollection = deathAnnexStateTaxSpecCqCollection;
	}
}

