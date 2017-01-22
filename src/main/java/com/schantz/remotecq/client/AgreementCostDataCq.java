package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementCostDataCq implements Serializable {
  @JsonProperty("agreementCostEntryCqCollection")
  private List<AgreementCostEntryCqObject> agreementCostEntryCqCollection = new ArrayList<AgreementCostEntryCqObject>();

  @JsonProperty("scopeCq")
  private ScopeCq scopeCq = null;

  public AgreementCostDataCq addAgreementCostEntryCqCollectionItem(AgreementCostEntryCqObject agreementCostEntryCqCollectionItem) {
    this.agreementCostEntryCqCollection.add(agreementCostEntryCqCollectionItem);
    return this;
  }

  public List<AgreementCostEntryCqObject> getAgreementCostEntryCqCollection() {
    return agreementCostEntryCqCollection;
  }

  public void setAgreementCostEntryCqCollection(List<AgreementCostEntryCqObject> agreementCostEntryCqCollection) {
    this.agreementCostEntryCqCollection = agreementCostEntryCqCollection;
  }

  public ScopeCq getScopeCq() {
    return scopeCq;
  }

  public void setScopeCq(ScopeCq scopeCq) {
    this.scopeCq = scopeCq;
  }
}

