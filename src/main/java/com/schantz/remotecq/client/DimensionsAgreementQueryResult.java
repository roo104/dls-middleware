package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DimensionsAgreementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("agreementDimensionCqCollection")
	private List<AgreementDimensionCq> agreementDimensionCqCollection = new ArrayList<AgreementDimensionCq>();
	
	public DimensionsAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public DimensionsAgreementQueryResult addAgreementDimensionCqCollectionItem(AgreementDimensionCq agreementDimensionCqCollectionItem) {
		this.agreementDimensionCqCollection.add(agreementDimensionCqCollectionItem);
		return this;
	}
	
	public List<AgreementDimensionCq> getAgreementDimensionCqCollection() {
		return agreementDimensionCqCollection;
	}
	
	public void setAgreementDimensionCqCollection(List<AgreementDimensionCq> agreementDimensionCqCollection) {
		this.agreementDimensionCqCollection = agreementDimensionCqCollection;
	}
}

