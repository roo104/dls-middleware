package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CreationAgreementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("possibleParentsCollection")
	private List<AgreementIdCq> possibleParentsCollection = new ArrayList<AgreementIdCq>();
	
	@JsonProperty("possibleAdditionalParentsCollection")
	private List<AgreementIdCq> possibleAdditionalParentsCollection = new ArrayList<AgreementIdCq>();
	
	@JsonProperty("possibleTypesCollection")
	private List<String> possibleTypesCollection = new ArrayList<String>();
	
	@JsonProperty("possibleChildTypesCollection")
	private List<String> possibleChildTypesCollection = new ArrayList<String>();
	
	public CreationAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CreationAgreementQueryResult addPossibleParentsCollectionItem(AgreementIdCq possibleParentsCollectionItem) {
		this.possibleParentsCollection.add(possibleParentsCollectionItem);
		return this;
	}
	
	public List<AgreementIdCq> getPossibleParentsCollection() {
		return possibleParentsCollection;
	}
	
	public void setPossibleParentsCollection(List<AgreementIdCq> possibleParentsCollection) {
		this.possibleParentsCollection = possibleParentsCollection;
	}
	
	public CreationAgreementQueryResult addPossibleAdditionalParentsCollectionItem(AgreementIdCq possibleAdditionalParentsCollectionItem) {
		this.possibleAdditionalParentsCollection.add(possibleAdditionalParentsCollectionItem);
		return this;
	}
	
	public List<AgreementIdCq> getPossibleAdditionalParentsCollection() {
		return possibleAdditionalParentsCollection;
	}
	
	public void setPossibleAdditionalParentsCollection(List<AgreementIdCq> possibleAdditionalParentsCollection) {
		this.possibleAdditionalParentsCollection = possibleAdditionalParentsCollection;
	}
	
	public CreationAgreementQueryResult addPossibleTypesCollectionItem(String possibleTypesCollectionItem) {
		this.possibleTypesCollection.add(possibleTypesCollectionItem);
		return this;
	}
	
	public List<String> getPossibleTypesCollection() {
		return possibleTypesCollection;
	}
	
	public void setPossibleTypesCollection(List<String> possibleTypesCollection) {
		this.possibleTypesCollection = possibleTypesCollection;
	}
	
	public CreationAgreementQueryResult addPossibleChildTypesCollectionItem(String possibleChildTypesCollectionItem) {
		this.possibleChildTypesCollection.add(possibleChildTypesCollectionItem);
		return this;
	}
	
	public List<String> getPossibleChildTypesCollection() {
		return possibleChildTypesCollection;
	}
	
	public void setPossibleChildTypesCollection(List<String> possibleChildTypesCollection) {
		this.possibleChildTypesCollection = possibleChildTypesCollection;
	}
}

