package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyReceivableIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("contributorReceivableIdCq")
  private ContributorReceivableIdCq contributorReceivableIdCq = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public ContributorReceivableIdCq getContributorReceivableIdCq() {
    return contributorReceivableIdCq;
  }

  public void setContributorReceivableIdCq(ContributorReceivableIdCq contributorReceivableIdCq) {
    this.contributorReceivableIdCq = contributorReceivableIdCq;
  }
}

