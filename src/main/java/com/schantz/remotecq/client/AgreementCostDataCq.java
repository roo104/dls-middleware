package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCostDataCq implements Serializable {
	@JsonProperty("agreementCostEntryCqCollection")
	private List<AgreementCostEntryCq> agreementCostEntryCqCollection = new ArrayList<AgreementCostEntryCq>();
	
	@JsonProperty("scopeCq")
	private ScopeCq scopeCq = null;
	
	public AgreementCostDataCq addAgreementCostEntryCqCollectionItem(AgreementCostEntryCq agreementCostEntryCqCollectionItem) {
		this.agreementCostEntryCqCollection.add(agreementCostEntryCqCollectionItem);
		return this;
	}
	
	public List<AgreementCostEntryCq> getAgreementCostEntryCqCollection() {
		return agreementCostEntryCqCollection;
	}
	
	public void setAgreementCostEntryCqCollection(List<AgreementCostEntryCq> agreementCostEntryCqCollection) {
		this.agreementCostEntryCqCollection = agreementCostEntryCqCollection;
	}
	
	public ScopeCq getScopeCq() {
		return scopeCq;
	}
	
	public void setScopeCq(ScopeCq scopeCq) {
		this.scopeCq = scopeCq;
	}
}

