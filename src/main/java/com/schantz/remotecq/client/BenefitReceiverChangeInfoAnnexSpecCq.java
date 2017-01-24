package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BenefitReceiverChangeInfoAnnexSpecCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("share")
	private Double share = null;
	
	@JsonProperty("total")
	private Double total = null;
	
	@JsonProperty("inheritanceTax")
	private Double inheritanceTax = null;
	
	@JsonProperty("tax")
	private Double tax = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	@JsonProperty("paymentTaxTypeCq")
	private String paymentTaxTypeCq = null;
	
	@JsonProperty("legalPartyIdCq")
	private LegalPartyIdCq legalPartyIdCq = null;
	
	@JsonProperty("benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection")
	private List<BenefitReceiverChangeInfoAnnexStateTaxSpecCq> benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection = new ArrayList<BenefitReceiverChangeInfoAnnexStateTaxSpecCq>();
	
	@JsonProperty("isConverToLumpSum")
	private Boolean isConverToLumpSum = false;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getShare() {
		return share;
	}
	
	public void setShare(Double share) {
		this.share = share;
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
	
	public Double getTax() {
		return tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
	
	public String getPaymentTaxTypeCq() {
		return paymentTaxTypeCq;
	}
	
	public void setPaymentTaxTypeCq(String paymentTaxTypeCq) {
		this.paymentTaxTypeCq = paymentTaxTypeCq;
	}
	
	public LegalPartyIdCq getLegalPartyIdCq() {
		return legalPartyIdCq;
	}
	
	public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
		this.legalPartyIdCq = legalPartyIdCq;
	}
	
	public BenefitReceiverChangeInfoAnnexSpecCq addBenefitReceiverChangeInfoAnnexStateTaxSpecCqCollectionItem(BenefitReceiverChangeInfoAnnexStateTaxSpecCq benefitReceiverChangeInfoAnnexStateTaxSpecCqCollectionItem) {
		this.benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection.add(benefitReceiverChangeInfoAnnexStateTaxSpecCqCollectionItem);
		return this;
	}
	
	public List<BenefitReceiverChangeInfoAnnexStateTaxSpecCq> getBenefitReceiverChangeInfoAnnexStateTaxSpecCqCollection() {
		return benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection;
	}
	
	public void setBenefitReceiverChangeInfoAnnexStateTaxSpecCqCollection(List<BenefitReceiverChangeInfoAnnexStateTaxSpecCq> benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection) {
		this.benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection = benefitReceiverChangeInfoAnnexStateTaxSpecCqCollection;
	}
	
	public Boolean getIsConverToLumpSum() {
		return isConverToLumpSum;
	}
	
	public void setIsConverToLumpSum(Boolean isConverToLumpSum) {
		this.isConverToLumpSum = isConverToLumpSum;
	}
}

