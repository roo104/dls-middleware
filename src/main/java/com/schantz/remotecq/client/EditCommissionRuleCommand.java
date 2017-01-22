package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditCommissionRuleCommand implements Serializable {
  @JsonProperty("commissionRuleEntryDeltaCqCollection")
  private List<CommissionRuleEntryDeltaCq> commissionRuleEntryDeltaCqCollection = new ArrayList<CommissionRuleEntryDeltaCq>();

  @JsonProperty("commissionRuleIdCq")
  private CommissionRuleIdCq commissionRuleIdCq = null;

  public EditCommissionRuleCommand addCommissionRuleEntryDeltaCqCollectionItem(CommissionRuleEntryDeltaCq commissionRuleEntryDeltaCqCollectionItem) {
    this.commissionRuleEntryDeltaCqCollection.add(commissionRuleEntryDeltaCqCollectionItem);
    return this;
  }

  public List<CommissionRuleEntryDeltaCq> getCommissionRuleEntryDeltaCqCollection() {
    return commissionRuleEntryDeltaCqCollection;
  }

  public void setCommissionRuleEntryDeltaCqCollection(List<CommissionRuleEntryDeltaCq> commissionRuleEntryDeltaCqCollection) {
    this.commissionRuleEntryDeltaCqCollection = commissionRuleEntryDeltaCqCollection;
  }

  public CommissionRuleIdCq getCommissionRuleIdCq() {
    return commissionRuleIdCq;
  }

  public void setCommissionRuleIdCq(CommissionRuleIdCq commissionRuleIdCq) {
    this.commissionRuleIdCq = commissionRuleIdCq;
  }
}

