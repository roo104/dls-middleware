package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AuditTrailAgreementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("extendedVersionDetailsCqCollection")
	private List<ExtendedVersionDetailsCq> extendedVersionDetailsCqCollection = new ArrayList<ExtendedVersionDetailsCq>();
	
	public AuditTrailAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public AuditTrailAgreementQueryResult addExtendedVersionDetailsCqCollectionItem(ExtendedVersionDetailsCq extendedVersionDetailsCqCollectionItem) {
		this.extendedVersionDetailsCqCollection.add(extendedVersionDetailsCqCollectionItem);
		return this;
	}
	
	public List<ExtendedVersionDetailsCq> getExtendedVersionDetailsCqCollection() {
		return extendedVersionDetailsCqCollection;
	}
	
	public void setExtendedVersionDetailsCqCollection(List<ExtendedVersionDetailsCq> extendedVersionDetailsCqCollection) {
		this.extendedVersionDetailsCqCollection = extendedVersionDetailsCqCollection;
	}
}

