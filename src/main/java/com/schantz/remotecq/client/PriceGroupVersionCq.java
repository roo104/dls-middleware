package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupVersionCq implements Serializable {
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTIme")
	private OffsetDateTime createTIme = null;
	
	@JsonProperty("terminationDate")
	private LocalDate terminationDate = null;
	
	@JsonProperty("noRenewalBefore")
	private LocalDate noRenewalBefore = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("versionNumber")
	private String versionNumber = null;
	
	@JsonProperty("calculatedNextRenewal")
	private LocalDate calculatedNextRenewal = null;
	
	@JsonProperty("priceGroupVersionIdCq")
	private PriceGroupVersionIdCq priceGroupVersionIdCq = null;
	
	@JsonProperty("priceGroupPriceCqCollection")
	private List<PriceGroupPriceCq> priceGroupPriceCqCollection = new ArrayList<PriceGroupPriceCq>();
	
	@JsonProperty("priceGroupCq")
	private PriceGroupCq priceGroupCq = null;
	
	@JsonProperty("priceGroupVersionInfoCq")
	private PriceGroupVersionInfoCq priceGroupVersionInfoCq = null;
	
	@JsonProperty("priceGroupRenewalCycleEntryCqCollection")
	private List<PriceGroupRenewalCycleEntryCq> priceGroupRenewalCycleEntryCqCollection = new ArrayList<PriceGroupRenewalCycleEntryCq>();
	
	@JsonProperty("priceGroupStatusTypeCq")
	private String priceGroupStatusTypeCq = null;
	
	@JsonProperty("priceGroupValidationMessageCqCollection")
	private List<PriceGroupValidationMessageCq> priceGroupValidationMessageCqCollection = new ArrayList<PriceGroupValidationMessageCq>();
	
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateTIme() {
		return createTIme;
	}
	
	public void setCreateTIme(OffsetDateTime createTIme) {
		this.createTIme = createTIme;
	}
	
	public LocalDate getTerminationDate() {
		return terminationDate;
	}
	
	public void setTerminationDate(LocalDate terminationDate) {
		this.terminationDate = terminationDate;
	}
	
	public LocalDate getNoRenewalBefore() {
		return noRenewalBefore;
	}
	
	public void setNoRenewalBefore(LocalDate noRenewalBefore) {
		this.noRenewalBefore = noRenewalBefore;
	}
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public String getVersionNumber() {
		return versionNumber;
	}
	
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	
	public LocalDate getCalculatedNextRenewal() {
		return calculatedNextRenewal;
	}
	
	public void setCalculatedNextRenewal(LocalDate calculatedNextRenewal) {
		this.calculatedNextRenewal = calculatedNextRenewal;
	}
	
	public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
		return priceGroupVersionIdCq;
	}
	
	public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
		this.priceGroupVersionIdCq = priceGroupVersionIdCq;
	}
	
	public PriceGroupVersionCq addPriceGroupPriceCqCollectionItem(PriceGroupPriceCq priceGroupPriceCqCollectionItem) {
		this.priceGroupPriceCqCollection.add(priceGroupPriceCqCollectionItem);
		return this;
	}
	
	public List<PriceGroupPriceCq> getPriceGroupPriceCqCollection() {
		return priceGroupPriceCqCollection;
	}
	
	public void setPriceGroupPriceCqCollection(List<PriceGroupPriceCq> priceGroupPriceCqCollection) {
		this.priceGroupPriceCqCollection = priceGroupPriceCqCollection;
	}
	
	public PriceGroupCq getPriceGroupCq() {
		return priceGroupCq;
	}
	
	public void setPriceGroupCq(PriceGroupCq priceGroupCq) {
		this.priceGroupCq = priceGroupCq;
	}
	
	public PriceGroupVersionInfoCq getPriceGroupVersionInfoCq() {
		return priceGroupVersionInfoCq;
	}
	
	public void setPriceGroupVersionInfoCq(PriceGroupVersionInfoCq priceGroupVersionInfoCq) {
		this.priceGroupVersionInfoCq = priceGroupVersionInfoCq;
	}
	
	public PriceGroupVersionCq addPriceGroupRenewalCycleEntryCqCollectionItem(PriceGroupRenewalCycleEntryCq priceGroupRenewalCycleEntryCqCollectionItem) {
		this.priceGroupRenewalCycleEntryCqCollection.add(priceGroupRenewalCycleEntryCqCollectionItem);
		return this;
	}
	
	public List<PriceGroupRenewalCycleEntryCq> getPriceGroupRenewalCycleEntryCqCollection() {
		return priceGroupRenewalCycleEntryCqCollection;
	}
	
	public void setPriceGroupRenewalCycleEntryCqCollection(List<PriceGroupRenewalCycleEntryCq> priceGroupRenewalCycleEntryCqCollection) {
		this.priceGroupRenewalCycleEntryCqCollection = priceGroupRenewalCycleEntryCqCollection;
	}
	
	public String getPriceGroupStatusTypeCq() {
		return priceGroupStatusTypeCq;
	}
	
	public void setPriceGroupStatusTypeCq(String priceGroupStatusTypeCq) {
		this.priceGroupStatusTypeCq = priceGroupStatusTypeCq;
	}
	
	public PriceGroupVersionCq addPriceGroupValidationMessageCqCollectionItem(PriceGroupValidationMessageCq priceGroupValidationMessageCqCollectionItem) {
		this.priceGroupValidationMessageCqCollection.add(priceGroupValidationMessageCqCollectionItem);
		return this;
	}
	
	public List<PriceGroupValidationMessageCq> getPriceGroupValidationMessageCqCollection() {
		return priceGroupValidationMessageCqCollection;
	}
	
	public void setPriceGroupValidationMessageCqCollection(List<PriceGroupValidationMessageCq> priceGroupValidationMessageCqCollection) {
		this.priceGroupValidationMessageCqCollection = priceGroupValidationMessageCqCollection;
	}
}

