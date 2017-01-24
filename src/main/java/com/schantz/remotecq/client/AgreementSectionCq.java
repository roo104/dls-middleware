package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementSectionCq implements Serializable {
	@JsonProperty("sectionKey")
	private CqMessageKey sectionKey = null;
	
	@JsonProperty("agreementFieldCqCollection")
	private List<AgreementFieldCq> agreementFieldCqCollection = new ArrayList<AgreementFieldCq>();
	
	
	public CqMessageKey getSectionKey() {
		return sectionKey;
	}
	
	public void setSectionKey(CqMessageKey sectionKey) {
		this.sectionKey = sectionKey;
	}
	
	public AgreementSectionCq addAgreementFieldCqCollectionItem(AgreementFieldCq agreementFieldCqCollectionItem) {
		this.agreementFieldCqCollection.add(agreementFieldCqCollectionItem);
		return this;
	}
	
	public List<AgreementFieldCq> getAgreementFieldCqCollection() {
		return agreementFieldCqCollection;
	}
	
	public void setAgreementFieldCqCollection(List<AgreementFieldCq> agreementFieldCqCollection) {
		this.agreementFieldCqCollection = agreementFieldCqCollection;
	}
}

