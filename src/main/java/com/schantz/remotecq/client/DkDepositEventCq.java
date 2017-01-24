package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DkDepositEventCq implements Serializable {
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("lifeEventIdCq")
	private String lifeEventIdCq = null;
	
	@JsonProperty("inclusionId")
	private EventInclusionIdCq inclusionId = null;
	
	@JsonProperty("validationOverrideCqCollection")
	private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();
	
	@JsonProperty("originalStartDate")
	private LocalDate originalStartDate = null;
	
	@JsonProperty("taxCode2Used")
	private Double taxCode2Used = null;
	
	@JsonProperty("taxCode3Used")
	private Double taxCode3Used = null;
	
	@JsonProperty("taxCode8Used")
	private Double taxCode8Used = null;
	
	@JsonProperty("costRefund")
	private Double costRefund = null;
	
	@JsonProperty("penalInterest")
	private Double penalInterest = null;
	
	@JsonProperty("exemptAmount")
	private Double exemptAmount = null;
	
	@JsonProperty("palTaxBase")
	private Double palTaxBase = null;
	
	@JsonProperty("palTax")
	private Double palTax = null;
	
	@JsonProperty("unusedPalPreviousYears")
	private Double unusedPalPreviousYears = null;
	
	@JsonProperty("amountSpecCqCollection")
	private List<AmountSpecCq> amountSpecCqCollection = new ArrayList<AmountSpecCq>();
	
	@JsonProperty("oiAccountReceivableRefCq")
	private OiAccountReceivableRefCq oiAccountReceivableRefCq = null;
	
	@JsonProperty("contributerShareCqCollection")
	private List<ContributerShareCq> contributerShareCqCollection = new ArrayList<ContributerShareCq>();
	
	@JsonProperty("palPerYearCqCollection")
	private List<PalPerYearCq> palPerYearCqCollection = new ArrayList<PalPerYearCq>();
	
	@JsonProperty("dkDepositTransferTypeCq")
	private String dkDepositTransferTypeCq = null;
	
	@JsonProperty("isUseWelfareAgreement")
	private Boolean isUseWelfareAgreement = false;
	
	@JsonProperty("isWelfareAgreementDecided")
	private Boolean isWelfareAgreementDecided = false;
	
	@JsonProperty("isUseParagraph15a")
	private Boolean isUseParagraph15a = false;
	
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	public String getLifeEventIdCq() {
		return lifeEventIdCq;
	}
	
	public void setLifeEventIdCq(String lifeEventIdCq) {
		this.lifeEventIdCq = lifeEventIdCq;
	}
	
	public EventInclusionIdCq getInclusionId() {
		return inclusionId;
	}
	
	public void setInclusionId(EventInclusionIdCq inclusionId) {
		this.inclusionId = inclusionId;
	}
	
	public DkDepositEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
		this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
		return this;
	}
	
	public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
		return validationOverrideCqCollection;
	}
	
	public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
		this.validationOverrideCqCollection = validationOverrideCqCollection;
	}
	
	public LocalDate getOriginalStartDate() {
		return originalStartDate;
	}
	
	public void setOriginalStartDate(LocalDate originalStartDate) {
		this.originalStartDate = originalStartDate;
	}
	
	public Double getTaxCode2Used() {
		return taxCode2Used;
	}
	
	public void setTaxCode2Used(Double taxCode2Used) {
		this.taxCode2Used = taxCode2Used;
	}
	
	public Double getTaxCode3Used() {
		return taxCode3Used;
	}
	
	public void setTaxCode3Used(Double taxCode3Used) {
		this.taxCode3Used = taxCode3Used;
	}
	
	public Double getTaxCode8Used() {
		return taxCode8Used;
	}
	
	public void setTaxCode8Used(Double taxCode8Used) {
		this.taxCode8Used = taxCode8Used;
	}
	
	public Double getCostRefund() {
		return costRefund;
	}
	
	public void setCostRefund(Double costRefund) {
		this.costRefund = costRefund;
	}
	
	public Double getPenalInterest() {
		return penalInterest;
	}
	
	public void setPenalInterest(Double penalInterest) {
		this.penalInterest = penalInterest;
	}
	
	public Double getExemptAmount() {
		return exemptAmount;
	}
	
	public void setExemptAmount(Double exemptAmount) {
		this.exemptAmount = exemptAmount;
	}
	
	public Double getPalTaxBase() {
		return palTaxBase;
	}
	
	public void setPalTaxBase(Double palTaxBase) {
		this.palTaxBase = palTaxBase;
	}
	
	public Double getPalTax() {
		return palTax;
	}
	
	public void setPalTax(Double palTax) {
		this.palTax = palTax;
	}
	
	public Double getUnusedPalPreviousYears() {
		return unusedPalPreviousYears;
	}
	
	public void setUnusedPalPreviousYears(Double unusedPalPreviousYears) {
		this.unusedPalPreviousYears = unusedPalPreviousYears;
	}
	
	public DkDepositEventCq addAmountSpecCqCollectionItem(AmountSpecCq amountSpecCqCollectionItem) {
		this.amountSpecCqCollection.add(amountSpecCqCollectionItem);
		return this;
	}
	
	public List<AmountSpecCq> getAmountSpecCqCollection() {
		return amountSpecCqCollection;
	}
	
	public void setAmountSpecCqCollection(List<AmountSpecCq> amountSpecCqCollection) {
		this.amountSpecCqCollection = amountSpecCqCollection;
	}
	
	public OiAccountReceivableRefCq getOiAccountReceivableRefCq() {
		return oiAccountReceivableRefCq;
	}
	
	public void setOiAccountReceivableRefCq(OiAccountReceivableRefCq oiAccountReceivableRefCq) {
		this.oiAccountReceivableRefCq = oiAccountReceivableRefCq;
	}
	
	public DkDepositEventCq addContributerShareCqCollectionItem(ContributerShareCq contributerShareCqCollectionItem) {
		this.contributerShareCqCollection.add(contributerShareCqCollectionItem);
		return this;
	}
	
	public List<ContributerShareCq> getContributerShareCqCollection() {
		return contributerShareCqCollection;
	}
	
	public void setContributerShareCqCollection(List<ContributerShareCq> contributerShareCqCollection) {
		this.contributerShareCqCollection = contributerShareCqCollection;
	}
	
	public DkDepositEventCq addPalPerYearCqCollectionItem(PalPerYearCq palPerYearCqCollectionItem) {
		this.palPerYearCqCollection.add(palPerYearCqCollectionItem);
		return this;
	}
	
	public List<PalPerYearCq> getPalPerYearCqCollection() {
		return palPerYearCqCollection;
	}
	
	public void setPalPerYearCqCollection(List<PalPerYearCq> palPerYearCqCollection) {
		this.palPerYearCqCollection = palPerYearCqCollection;
	}
	
	public String getDkDepositTransferTypeCq() {
		return dkDepositTransferTypeCq;
	}
	
	public void setDkDepositTransferTypeCq(String dkDepositTransferTypeCq) {
		this.dkDepositTransferTypeCq = dkDepositTransferTypeCq;
	}
	
	public Boolean getIsUseWelfareAgreement() {
		return isUseWelfareAgreement;
	}
	
	public void setIsUseWelfareAgreement(Boolean isUseWelfareAgreement) {
		this.isUseWelfareAgreement = isUseWelfareAgreement;
	}
	
	public Boolean getIsWelfareAgreementDecided() {
		return isWelfareAgreementDecided;
	}
	
	public void setIsWelfareAgreementDecided(Boolean isWelfareAgreementDecided) {
		this.isWelfareAgreementDecided = isWelfareAgreementDecided;
	}
	
	public Boolean getIsUseParagraph15a() {
		return isUseParagraph15a;
	}
	
	public void setIsUseParagraph15a(Boolean isUseParagraph15a) {
		this.isUseParagraph15a = isUseParagraph15a;
	}
}

