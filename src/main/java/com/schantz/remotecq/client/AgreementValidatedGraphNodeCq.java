package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementValidatedGraphNodeCq implements Serializable {
	@JsonProperty("versionGraphCollection")
	private List<AgreementGraphNodeCq> versionGraphCollection = new ArrayList<AgreementGraphNodeCq>();
	
	@JsonProperty("agreementVersionIdCq")
	private AgreementVersionIdCq agreementVersionIdCq = null;
	
	@JsonProperty("valid")
	private Boolean valid = false;
	
	@JsonProperty("agreementValidationMessageCqCollection")
	private List<AgreementValidationMessageCq> agreementValidationMessageCqCollection = new ArrayList<AgreementValidationMessageCq>();
	
	public AgreementValidatedGraphNodeCq addVersionGraphCollectionItem(AgreementGraphNodeCq versionGraphCollectionItem) {
		this.versionGraphCollection.add(versionGraphCollectionItem);
		return this;
	}
	
	public List<AgreementGraphNodeCq> getVersionGraphCollection() {
		return versionGraphCollection;
	}
	
	public void setVersionGraphCollection(List<AgreementGraphNodeCq> versionGraphCollection) {
		this.versionGraphCollection = versionGraphCollection;
	}
	
	public AgreementVersionIdCq getAgreementVersionIdCq() {
		return agreementVersionIdCq;
	}
	
	public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
		this.agreementVersionIdCq = agreementVersionIdCq;
	}
	
	public Boolean getValid() {
		return valid;
	}
	
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	
	public AgreementValidatedGraphNodeCq addAgreementValidationMessageCqCollectionItem(AgreementValidationMessageCq agreementValidationMessageCqCollectionItem) {
		this.agreementValidationMessageCqCollection.add(agreementValidationMessageCqCollectionItem);
		return this;
	}
	
	public List<AgreementValidationMessageCq> getAgreementValidationMessageCqCollection() {
		return agreementValidationMessageCqCollection;
	}
	
	public void setAgreementValidationMessageCqCollection(List<AgreementValidationMessageCq> agreementValidationMessageCqCollection) {
		this.agreementValidationMessageCqCollection = agreementValidationMessageCqCollection;
	}
}

