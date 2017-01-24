package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceAgreementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("agreementCoverVariantPriceCqCollection")
	private List<AgreementCoverVariantPriceCq> agreementCoverVariantPriceCqCollection = new ArrayList<AgreementCoverVariantPriceCq>();
	
	public PriceAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PriceAgreementQueryResult addAgreementCoverVariantPriceCqCollectionItem(AgreementCoverVariantPriceCq agreementCoverVariantPriceCqCollectionItem) {
		this.agreementCoverVariantPriceCqCollection.add(agreementCoverVariantPriceCqCollectionItem);
		return this;
	}
	
	public List<AgreementCoverVariantPriceCq> getAgreementCoverVariantPriceCqCollection() {
		return agreementCoverVariantPriceCqCollection;
	}
	
	public void setAgreementCoverVariantPriceCqCollection(List<AgreementCoverVariantPriceCq> agreementCoverVariantPriceCqCollection) {
		this.agreementCoverVariantPriceCqCollection = agreementCoverVariantPriceCqCollection;
	}
}

