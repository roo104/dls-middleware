package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementVersionDifferenceCq implements Serializable {
  @JsonProperty("entryCollection")
  private List<AgreementVersionDifferenceEntryCq> entryCollection = new ArrayList<AgreementVersionDifferenceEntryCq>();

  @JsonProperty("agreementPackageDifferenceCqCollection")
  private List<AgreementPackageDifferenceCq> agreementPackageDifferenceCqCollection = new ArrayList<AgreementPackageDifferenceCq>();

  @JsonProperty("versionIdCollection")
  private List<AgreementVersionIdCq> versionIdCollection = new ArrayList<AgreementVersionIdCq>();

  public AgreementVersionDifferenceCq addEntryCollectionItem(AgreementVersionDifferenceEntryCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<AgreementVersionDifferenceEntryCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<AgreementVersionDifferenceEntryCq> entryCollection) {
    this.entryCollection = entryCollection;
  }
  public AgreementVersionDifferenceCq addAgreementPackageDifferenceCqCollectionItem(AgreementPackageDifferenceCq agreementPackageDifferenceCqCollectionItem) {
    this.agreementPackageDifferenceCqCollection.add(agreementPackageDifferenceCqCollectionItem);
    return this;
  }

  public List<AgreementPackageDifferenceCq> getAgreementPackageDifferenceCqCollection() {
    return agreementPackageDifferenceCqCollection;
  }

  public void setAgreementPackageDifferenceCqCollection(List<AgreementPackageDifferenceCq> agreementPackageDifferenceCqCollection) {
    this.agreementPackageDifferenceCqCollection = agreementPackageDifferenceCqCollection;
  }
  public AgreementVersionDifferenceCq addVersionIdCollectionItem(AgreementVersionIdCq versionIdCollectionItem) {
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

