package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopMovePackageReserveEventDataCq implements Serializable {
  @JsonProperty("topMoveReserveSpecCqCollection")
  private List<TopMoveReserveSpecCq> topMoveReserveSpecCqCollection = new ArrayList<TopMoveReserveSpecCq>();

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("isClosePackage")
  private Boolean isClosePackage = false;

  public TopMovePackageReserveEventDataCq addTopMoveReserveSpecCqCollectionItem(TopMoveReserveSpecCq topMoveReserveSpecCqCollectionItem) {
    this.topMoveReserveSpecCqCollection.add(topMoveReserveSpecCqCollectionItem);
    return this;
  }

  public List<TopMoveReserveSpecCq> getTopMoveReserveSpecCqCollection() {
    return topMoveReserveSpecCqCollection;
  }

  public void setTopMoveReserveSpecCqCollection(List<TopMoveReserveSpecCq> topMoveReserveSpecCqCollection) {
    this.topMoveReserveSpecCqCollection = topMoveReserveSpecCqCollection;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }

  public Boolean getIsClosePackage() {
    return isClosePackage;
  }

  public void setIsClosePackage(Boolean isClosePackage) {
    this.isClosePackage = isClosePackage;
  }
}

