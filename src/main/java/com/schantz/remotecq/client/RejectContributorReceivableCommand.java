package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RejectContributorReceivableCommand implements Serializable {
  @JsonProperty("contributorReceivableIdCq")
  private ContributorReceivableIdCq contributorReceivableIdCq = null;

  @JsonProperty("payablesChannelCq")
  private PayablesChannelCq payablesChannelCq = null;


  public ContributorReceivableIdCq getContributorReceivableIdCq() {
    return contributorReceivableIdCq;
  }

  public void setContributorReceivableIdCq(ContributorReceivableIdCq contributorReceivableIdCq) {
    this.contributorReceivableIdCq = contributorReceivableIdCq;
  }

  public PayablesChannelCq getPayablesChannelCq() {
    return payablesChannelCq;
  }

  public void setPayablesChannelCq(PayablesChannelCq payablesChannelCq) {
    this.payablesChannelCq = payablesChannelCq;
  }
}

