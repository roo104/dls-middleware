package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BulkAddOnHoldCommand implements Serializable {
  @JsonProperty("policyIdsCollection")
  private List<String> policyIdsCollection = new ArrayList<String>();

  @JsonProperty("onHoldTypeCq")
  private String onHoldTypeCq = null;

  @JsonProperty("onHoldLevelCq")
  private OnHoldLevelCq onHoldLevelCq = null;

  @JsonProperty("onHoldReasonTypeCq")
  private String onHoldReasonTypeCq = null;

  public BulkAddOnHoldCommand addPolicyIdsCollectionItem(String policyIdsCollectionItem) {
    this.policyIdsCollection.add(policyIdsCollectionItem);
    return this;
  }

  public List<String> getPolicyIdsCollection() {
    return policyIdsCollection;
  }

  public void setPolicyIdsCollection(List<String> policyIdsCollection) {
    this.policyIdsCollection = policyIdsCollection;
  }

  public String getOnHoldTypeCq() {
    return onHoldTypeCq;
  }

  public void setOnHoldTypeCq(String onHoldTypeCq) {
    this.onHoldTypeCq = onHoldTypeCq;
  }

  public OnHoldLevelCq getOnHoldLevelCq() {
    return onHoldLevelCq;
  }

  public void setOnHoldLevelCq(OnHoldLevelCq onHoldLevelCq) {
    this.onHoldLevelCq = onHoldLevelCq;
  }

  public String getOnHoldReasonTypeCq() {
    return onHoldReasonTypeCq;
  }

  public void setOnHoldReasonTypeCq(String onHoldReasonTypeCq) {
    this.onHoldReasonTypeCq = onHoldReasonTypeCq;
  }
}

