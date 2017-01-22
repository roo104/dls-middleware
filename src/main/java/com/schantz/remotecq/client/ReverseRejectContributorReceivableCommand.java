package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ReverseRejectContributorReceivableCommand implements Serializable {
  @JsonProperty("contributorReceivableIdCq")
  private ContributorReceivableIdCq contributorReceivableIdCq = null;


  public ContributorReceivableIdCq getContributorReceivableIdCq() {
    return contributorReceivableIdCq;
  }

  public void setContributorReceivableIdCq(ContributorReceivableIdCq contributorReceivableIdCq) {
    this.contributorReceivableIdCq = contributorReceivableIdCq;
  }
}

