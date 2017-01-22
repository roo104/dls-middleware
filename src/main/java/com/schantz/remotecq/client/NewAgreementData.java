package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NewAgreementData implements Serializable {
  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("agreementName")
  private String agreementName = null;

  @JsonProperty("childrenInDraftBundleCollection")
  private List<NewAgreementData> childrenInDraftBundleCollection = new ArrayList<NewAgreementData>();

  @JsonProperty("parentAgreementsCollection")
  private List<AgreementIdCq> parentAgreementsCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("agreementTypeCq")
  private String agreementTypeCq = null;


  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }

  public String getAgreementName() {
    return agreementName;
  }

  public void setAgreementName(String agreementName) {
    this.agreementName = agreementName;
  }
  public NewAgreementData addChildrenInDraftBundleCollectionItem(NewAgreementData childrenInDraftBundleCollectionItem) {
    this.childrenInDraftBundleCollection.add(childrenInDraftBundleCollectionItem);
    return this;
  }

  public List<NewAgreementData> getChildrenInDraftBundleCollection() {
    return childrenInDraftBundleCollection;
  }

  public void setChildrenInDraftBundleCollection(List<NewAgreementData> childrenInDraftBundleCollection) {
    this.childrenInDraftBundleCollection = childrenInDraftBundleCollection;
  }
  public NewAgreementData addParentAgreementsCollectionItem(AgreementIdCq parentAgreementsCollectionItem) {
    this.parentAgreementsCollection.add(parentAgreementsCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getParentAgreementsCollection() {
    return parentAgreementsCollection;
  }

  public void setParentAgreementsCollection(List<AgreementIdCq> parentAgreementsCollection) {
    this.parentAgreementsCollection = parentAgreementsCollection;
  }

  public String getAgreementTypeCq() {
    return agreementTypeCq;
  }

  public void setAgreementTypeCq(String agreementTypeCq) {
    this.agreementTypeCq = agreementTypeCq;
  }
}

