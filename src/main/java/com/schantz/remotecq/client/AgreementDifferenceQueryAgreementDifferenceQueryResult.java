package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementDifferenceQueryAgreementDifferenceQueryResult implements Serializable {
  @JsonProperty("versionIdCollection")
  private List<AgreementVersionIdCq> versionIdCollection = new ArrayList<AgreementVersionIdCq>();

  public AgreementDifferenceQueryAgreementDifferenceQueryResult addVersionIdCollectionItem(AgreementVersionIdCq versionIdCollectionItem) {
    this.versionIdCollection.add(versionIdCollectionItem);
    return this;
  }

  public List<AgreementVersionIdCq> getVersionIdCollection() {
    return versionIdCollection;
  }

  public void setVersionIdCollection(List<AgreementVersionIdCq> versionIdCollection) {
    this.versionIdCollection = versionIdCollection;
  }
}

