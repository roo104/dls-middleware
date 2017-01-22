package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRuleCq implements Serializable {
  @JsonProperty("commissionRuleEntryCqCollection")
  private List<CommissionRuleEntryCq> commissionRuleEntryCqCollection = new ArrayList<CommissionRuleEntryCq>();

  @JsonProperty("commissionTypeCq")
  private String commissionTypeCq = null;

  @JsonProperty("commissionRuleIdCq")
  private CommissionRuleIdCq commissionRuleIdCq = null;

  public CommissionRuleCq addCommissionRuleEntryCqCollectionItem(CommissionRuleEntryCq commissionRuleEntryCqCollectionItem) {
    this.commissionRuleEntryCqCollection.add(commissionRuleEntryCqCollectionItem);
    return this;
  }

  public List<CommissionRuleEntryCq> getCommissionRuleEntryCqCollection() {
    return commissionRuleEntryCqCollection;
  }

  public void setCommissionRuleEntryCqCollection(List<CommissionRuleEntryCq> commissionRuleEntryCqCollection) {
    this.commissionRuleEntryCqCollection = commissionRuleEntryCqCollection;
  }

  public String getCommissionTypeCq() {
    return commissionTypeCq;
  }

  public void setCommissionTypeCq(String commissionTypeCq) {
    this.commissionTypeCq = commissionTypeCq;
  }

  public CommissionRuleIdCq getCommissionRuleIdCq() {
    return commissionRuleIdCq;
  }

  public void setCommissionRuleIdCq(CommissionRuleIdCq commissionRuleIdCq) {
    this.commissionRuleIdCq = commissionRuleIdCq;
  }
}

