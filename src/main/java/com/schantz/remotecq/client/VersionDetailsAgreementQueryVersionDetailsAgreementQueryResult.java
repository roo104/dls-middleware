package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class VersionDetailsAgreementQueryVersionDetailsAgreementQueryResult implements Serializable {
  @JsonProperty("agreementVersionId")
  private AgreementVersionIdCq agreementVersionId = null;

  @JsonProperty("filterValuesCollection")
  private List<AgreementDimensionValueCq> filterValuesCollection = new ArrayList<AgreementDimensionValueCq>();


  public AgreementVersionIdCq getAgreementVersionId() {
    return agreementVersionId;
  }

  public void setAgreementVersionId(AgreementVersionIdCq agreementVersionId) {
    this.agreementVersionId = agreementVersionId;
  }
  public VersionDetailsAgreementQueryVersionDetailsAgreementQueryResult addFilterValuesCollectionItem(AgreementDimensionValueCq filterValuesCollectionItem) {
    this.filterValuesCollection.add(filterValuesCollectionItem);
    return this;
  }

  public List<AgreementDimensionValueCq> getFilterValuesCollection() {
    return filterValuesCollection;
  }

  public void setFilterValuesCollection(List<AgreementDimensionValueCq> filterValuesCollection) {
    this.filterValuesCollection = filterValuesCollection;
  }
}

