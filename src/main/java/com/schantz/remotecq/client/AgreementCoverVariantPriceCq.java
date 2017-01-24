package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCoverVariantPriceCq implements Serializable {
	@JsonProperty("agreementVariantCq")
	private AgreementVariantCq agreementVariantCq = null;
	
	@JsonProperty("agreementCoverVariantPriceEntryCqCollection")
	private List<AgreementCoverVariantPriceEntryCq> agreementCoverVariantPriceEntryCqCollection = new ArrayList<AgreementCoverVariantPriceEntryCq>();
	
	
	public AgreementVariantCq getAgreementVariantCq() {
		return agreementVariantCq;
	}
	
	public void setAgreementVariantCq(AgreementVariantCq agreementVariantCq) {
		this.agreementVariantCq = agreementVariantCq;
	}
	
	public AgreementCoverVariantPriceCq addAgreementCoverVariantPriceEntryCqCollectionItem(AgreementCoverVariantPriceEntryCq agreementCoverVariantPriceEntryCqCollectionItem) {
		this.agreementCoverVariantPriceEntryCqCollection.add(agreementCoverVariantPriceEntryCqCollectionItem);
		return this;
	}
	
	public List<AgreementCoverVariantPriceEntryCq> getAgreementCoverVariantPriceEntryCqCollection() {
		return agreementCoverVariantPriceEntryCqCollection;
	}
	
	public void setAgreementCoverVariantPriceEntryCqCollection(List<AgreementCoverVariantPriceEntryCq> agreementCoverVariantPriceEntryCqCollection) {
		this.agreementCoverVariantPriceEntryCqCollection = agreementCoverVariantPriceEntryCqCollection;
	}
}

