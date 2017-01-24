package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementVariantDifferenceCq implements Serializable {
	@JsonProperty("entryCollection")
	private List<AgreementVariantDifferenceEntryCq> entryCollection = new ArrayList<AgreementVariantDifferenceEntryCq>();
	
	@JsonProperty("variantIdCollection")
	private List<AgreementCoverVariantIdCq> variantIdCollection = new ArrayList<AgreementCoverVariantIdCq>();
	
	public AgreementVariantDifferenceCq addEntryCollectionItem(AgreementVariantDifferenceEntryCq entryCollectionItem) {
		this.entryCollection.add(entryCollectionItem);
		return this;
	}
	
	public List<AgreementVariantDifferenceEntryCq> getEntryCollection() {
		return entryCollection;
	}
	
	public void setEntryCollection(List<AgreementVariantDifferenceEntryCq> entryCollection) {
		this.entryCollection = entryCollection;
	}
	
	public AgreementVariantDifferenceCq addVariantIdCollectionItem(AgreementCoverVariantIdCq variantIdCollectionItem) {
		this.variantIdCollection.add(variantIdCollectionItem);
		return this;
	}
	
	public List<AgreementCoverVariantIdCq> getVariantIdCollection() {
		return variantIdCollection;
	}
	
	public void setVariantIdCollection(List<AgreementCoverVariantIdCq> variantIdCollection) {
		this.variantIdCollection = variantIdCollection;
	}
}

