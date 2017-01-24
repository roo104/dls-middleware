package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BeneficiarySummaryPolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("historicBeneficiarySummaryEntryCqCollection")
	private List<BeneficiarySummaryEntryCq> historicBeneficiarySummaryEntryCqCollection = new ArrayList<BeneficiarySummaryEntryCq>();
	
	@JsonProperty("beneficiarySummaryEntryCqCollection")
	private List<BeneficiarySummaryEntryCq> beneficiarySummaryEntryCqCollection = new ArrayList<BeneficiarySummaryEntryCq>();
	
	public BeneficiarySummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BeneficiarySummaryPolicyQueryResult addHistoricBeneficiarySummaryEntryCqCollectionItem(BeneficiarySummaryEntryCq historicBeneficiarySummaryEntryCqCollectionItem) {
		this.historicBeneficiarySummaryEntryCqCollection.add(historicBeneficiarySummaryEntryCqCollectionItem);
		return this;
	}
	
	public List<BeneficiarySummaryEntryCq> getHistoricBeneficiarySummaryEntryCqCollection() {
		return historicBeneficiarySummaryEntryCqCollection;
	}
	
	public void setHistoricBeneficiarySummaryEntryCqCollection(List<BeneficiarySummaryEntryCq> historicBeneficiarySummaryEntryCqCollection) {
		this.historicBeneficiarySummaryEntryCqCollection = historicBeneficiarySummaryEntryCqCollection;
	}
	
	public BeneficiarySummaryPolicyQueryResult addBeneficiarySummaryEntryCqCollectionItem(BeneficiarySummaryEntryCq beneficiarySummaryEntryCqCollectionItem) {
		this.beneficiarySummaryEntryCqCollection.add(beneficiarySummaryEntryCqCollectionItem);
		return this;
	}
	
	public List<BeneficiarySummaryEntryCq> getBeneficiarySummaryEntryCqCollection() {
		return beneficiarySummaryEntryCqCollection;
	}
	
	public void setBeneficiarySummaryEntryCqCollection(List<BeneficiarySummaryEntryCq> beneficiarySummaryEntryCqCollection) {
		this.beneficiarySummaryEntryCqCollection = beneficiarySummaryEntryCqCollection;
	}
}

