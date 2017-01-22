package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementPackageDifferenceCq implements Serializable {
  @JsonProperty("entryCollection")
  private List<AgreementPackageDifferenceEntryCq> entryCollection = new ArrayList<AgreementPackageDifferenceEntryCq>();

  @JsonProperty("agreementCoverDifferenceCqCollection")
  private List<AgreementCoverDifferenceCq> agreementCoverDifferenceCqCollection = new ArrayList<AgreementCoverDifferenceCq>();

  @JsonProperty("packageIdCollection")
  private List<AgreementPackageIdCq> packageIdCollection = new ArrayList<AgreementPackageIdCq>();

  public AgreementPackageDifferenceCq addEntryCollectionItem(AgreementPackageDifferenceEntryCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<AgreementPackageDifferenceEntryCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<AgreementPackageDifferenceEntryCq> entryCollection) {
    this.entryCollection = entryCollection;
  }
  public AgreementPackageDifferenceCq addAgreementCoverDifferenceCqCollectionItem(AgreementCoverDifferenceCq agreementCoverDifferenceCqCollectionItem) {
    this.agreementCoverDifferenceCqCollection.add(agreementCoverDifferenceCqCollectionItem);
    return this;
  }

  public List<AgreementCoverDifferenceCq> getAgreementCoverDifferenceCqCollection() {
    return agreementCoverDifferenceCqCollection;
  }

  public void setAgreementCoverDifferenceCqCollection(List<AgreementCoverDifferenceCq> agreementCoverDifferenceCqCollection) {
    this.agreementCoverDifferenceCqCollection = agreementCoverDifferenceCqCollection;
  }
  public AgreementPackageDifferenceCq addPackageIdCollectionItem(AgreementPackageIdCq packageIdCollectionItem) {
    this.packageIdCollection.add(packageIdCollectionItem);
    return this;
  }

  public List<AgreementPackageIdCq> getPackageIdCollection() {
    return packageIdCollection;
  }

  public void setPackageIdCollection(List<AgreementPackageIdCq> packageIdCollection) {
    this.packageIdCollection = packageIdCollection;
  }
}

