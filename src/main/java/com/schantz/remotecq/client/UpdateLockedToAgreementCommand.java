package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class UpdateLockedToAgreementCommand implements Serializable {
	@JsonProperty("agreementIdCqCollection")
	private List<AgreementIdCq> agreementIdCqCollection = new ArrayList<AgreementIdCq>();
	
	@JsonProperty("claimModuleIdCq")
	private ClaimModuleIdCq claimModuleIdCq = null;
	
	public UpdateLockedToAgreementCommand addAgreementIdCqCollectionItem(AgreementIdCq agreementIdCqCollectionItem) {
		this.agreementIdCqCollection.add(agreementIdCqCollectionItem);
		return this;
	}
	
	public List<AgreementIdCq> getAgreementIdCqCollection() {
		return agreementIdCqCollection;
	}
	
	public void setAgreementIdCqCollection(List<AgreementIdCq> agreementIdCqCollection) {
		this.agreementIdCqCollection = agreementIdCqCollection;
	}
	
	public ClaimModuleIdCq getClaimModuleIdCq() {
		return claimModuleIdCq;
	}
	
	public void setClaimModuleIdCq(ClaimModuleIdCq claimModuleIdCq) {
		this.claimModuleIdCq = claimModuleIdCq;
	}
}

