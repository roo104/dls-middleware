package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementGraphNodeCq implements Serializable {
	@JsonProperty("versionGraphCollection")
	private List<AgreementGraphNodeCq> versionGraphCollection = new ArrayList<AgreementGraphNodeCq>();
	
	@JsonProperty("agreementVersionIdCq")
	private AgreementVersionIdCq agreementVersionIdCq = null;
	
	public AgreementGraphNodeCq addVersionGraphCollectionItem(AgreementGraphNodeCq versionGraphCollectionItem) {
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
}

