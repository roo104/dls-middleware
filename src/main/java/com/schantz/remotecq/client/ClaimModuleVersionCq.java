package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimModuleVersionCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("claimModuleCq")
  private ClaimModuleCq claimModuleCq = null;

  @JsonProperty("claimModuleVersionInfoCq")
  private ClaimModuleVersionInfoCq claimModuleVersionInfoCq = null;

  @JsonProperty("claimProductCqCollection")
  private List<ClaimProductCq> claimProductCqCollection = new ArrayList<ClaimProductCq>();


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public ClaimModuleCq getClaimModuleCq() {
    return claimModuleCq;
  }

  public void setClaimModuleCq(ClaimModuleCq claimModuleCq) {
    this.claimModuleCq = claimModuleCq;
  }

  public ClaimModuleVersionInfoCq getClaimModuleVersionInfoCq() {
    return claimModuleVersionInfoCq;
  }

  public void setClaimModuleVersionInfoCq(ClaimModuleVersionInfoCq claimModuleVersionInfoCq) {
    this.claimModuleVersionInfoCq = claimModuleVersionInfoCq;
  }
  public ClaimModuleVersionCq addClaimProductCqCollectionItem(ClaimProductCq claimProductCqCollectionItem) {
    this.claimProductCqCollection.add(claimProductCqCollectionItem);
    return this;
  }

  public List<ClaimProductCq> getClaimProductCqCollection() {
    return claimProductCqCollection;
  }

  public void setClaimProductCqCollection(List<ClaimProductCq> claimProductCqCollection) {
    this.claimProductCqCollection = claimProductCqCollection;
  }
}

