package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimCq implements Serializable {
  @JsonProperty("claimIdCq")
  private ClaimIdCq claimIdCq = null;

  @JsonProperty("currentVersionHistoryCollection")
  private List<ClaimVersionInfoCq> currentVersionHistoryCollection = new ArrayList<ClaimVersionInfoCq>();

  @JsonProperty("oiAccountIdCq")
  private OiAccountIdCq oiAccountIdCq = null;

  @JsonProperty("claimProductTypeDataCqCollection")
  private List<ClaimProductTypeDataCq> claimProductTypeDataCqCollection = new ArrayList<ClaimProductTypeDataCq>();

  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;


  public ClaimIdCq getClaimIdCq() {
    return claimIdCq;
  }

  public void setClaimIdCq(ClaimIdCq claimIdCq) {
    this.claimIdCq = claimIdCq;
  }
  public ClaimCq addCurrentVersionHistoryCollectionItem(ClaimVersionInfoCq currentVersionHistoryCollectionItem) {
    this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
    return this;
  }

  public List<ClaimVersionInfoCq> getCurrentVersionHistoryCollection() {
    return currentVersionHistoryCollection;
  }

  public void setCurrentVersionHistoryCollection(List<ClaimVersionInfoCq> currentVersionHistoryCollection) {
    this.currentVersionHistoryCollection = currentVersionHistoryCollection;
  }

  public OiAccountIdCq getOiAccountIdCq() {
    return oiAccountIdCq;
  }

  public void setOiAccountIdCq(OiAccountIdCq oiAccountIdCq) {
    this.oiAccountIdCq = oiAccountIdCq;
  }
  public ClaimCq addClaimProductTypeDataCqCollectionItem(ClaimProductTypeDataCq claimProductTypeDataCqCollectionItem) {
    this.claimProductTypeDataCqCollection.add(claimProductTypeDataCqCollectionItem);
    return this;
  }

  public List<ClaimProductTypeDataCq> getClaimProductTypeDataCqCollection() {
    return claimProductTypeDataCqCollection;
  }

  public void setClaimProductTypeDataCqCollection(List<ClaimProductTypeDataCq> claimProductTypeDataCqCollection) {
    this.claimProductTypeDataCqCollection = claimProductTypeDataCqCollection;
  }

  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }
}

