package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementCoverDifferenceCq implements Serializable {
  @JsonProperty("entryCollection")
  private List<AgreementCoverDifferenceEntryCq> entryCollection = new ArrayList<AgreementCoverDifferenceEntryCq>();

  @JsonProperty("agreementVariantDifferenceCqCollection")
  private List<AgreementVariantDifferenceCq> agreementVariantDifferenceCqCollection = new ArrayList<AgreementVariantDifferenceCq>();

  @JsonProperty("coverIdCollection")
  private List<AgreementCoverIdCq> coverIdCollection = new ArrayList<AgreementCoverIdCq>();

  public AgreementCoverDifferenceCq addEntryCollectionItem(AgreementCoverDifferenceEntryCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<AgreementCoverDifferenceEntryCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<AgreementCoverDifferenceEntryCq> entryCollection) {
    this.entryCollection = entryCollection;
  }
  public AgreementCoverDifferenceCq addAgreementVariantDifferenceCqCollectionItem(AgreementVariantDifferenceCq agreementVariantDifferenceCqCollectionItem) {
    this.agreementVariantDifferenceCqCollection.add(agreementVariantDifferenceCqCollectionItem);
    return this;
  }

  public List<AgreementVariantDifferenceCq> getAgreementVariantDifferenceCqCollection() {
    return agreementVariantDifferenceCqCollection;
  }

  public void setAgreementVariantDifferenceCqCollection(List<AgreementVariantDifferenceCq> agreementVariantDifferenceCqCollection) {
    this.agreementVariantDifferenceCqCollection = agreementVariantDifferenceCqCollection;
  }
  public AgreementCoverDifferenceCq addCoverIdCollectionItem(AgreementCoverIdCq coverIdCollectionItem) {
    this.coverIdCollection.add(coverIdCollectionItem);
    return this;
  }

  public List<AgreementCoverIdCq> getCoverIdCollection() {
    return coverIdCollection;
  }

  public void setCoverIdCollection(List<AgreementCoverIdCq> coverIdCollection) {
    this.coverIdCollection = coverIdCollection;
  }
}

