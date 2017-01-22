package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionPaymentQueryCommissionPaymentQueryResult implements Serializable {
  @JsonProperty("commissionPaymentidCqCollection")
  private List<CommissionPaymentidCq> commissionPaymentidCqCollection = new ArrayList<CommissionPaymentidCq>();

  public CommissionPaymentQueryCommissionPaymentQueryResult addCommissionPaymentidCqCollectionItem(CommissionPaymentidCq commissionPaymentidCqCollectionItem) {
    this.commissionPaymentidCqCollection.add(commissionPaymentidCqCollectionItem);
    return this;
  }

  public List<CommissionPaymentidCq> getCommissionPaymentidCqCollection() {
    return commissionPaymentidCqCollection;
  }

  public void setCommissionPaymentidCqCollection(List<CommissionPaymentidCq> commissionPaymentidCqCollection) {
    this.commissionPaymentidCqCollection = commissionPaymentidCqCollection;
  }
}

