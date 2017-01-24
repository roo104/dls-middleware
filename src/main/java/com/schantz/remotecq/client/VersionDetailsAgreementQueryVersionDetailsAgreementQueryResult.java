package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsAgreementQueryVersionDetailsAgreementQueryResult implements Serializable {
	@JsonProperty("agreementVersionId")
	private AgreementVersionIdCq agreementVersionId = null;
	
	@JsonProperty("filterValuesCollection")
	private List<DimensionValueCq> filterValuesCollection = new ArrayList<DimensionValueCq>();
	
	
	public AgreementVersionIdCq getAgreementVersionId() {
		return agreementVersionId;
	}
	
	public void setAgreementVersionId(AgreementVersionIdCq agreementVersionId) {
		this.agreementVersionId = agreementVersionId;
	}
	
	public VersionDetailsAgreementQueryVersionDetailsAgreementQueryResult addFilterValuesCollectionItem(DimensionValueCq filterValuesCollectionItem) {
		this.filterValuesCollection.add(filterValuesCollectionItem);
		return this;
	}
	
	public List<DimensionValueCq> getFilterValuesCollection() {
		return filterValuesCollection;
	}
	
	public void setFilterValuesCollection(List<DimensionValueCq> filterValuesCollection) {
		this.filterValuesCollection = filterValuesCollection;
	}
}

