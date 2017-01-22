package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BeneficiaryStateQuoteQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("changeBeneficiaryEventSpecCqCollection")
  private List<ChangeBeneficiaryEventSpecCq> changeBeneficiaryEventSpecCqCollection = new ArrayList<ChangeBeneficiaryEventSpecCq>();

  public BeneficiaryStateQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public BeneficiaryStateQuoteQueryResult addChangeBeneficiaryEventSpecCqCollectionItem(ChangeBeneficiaryEventSpecCq changeBeneficiaryEventSpecCqCollectionItem) {
    this.changeBeneficiaryEventSpecCqCollection.add(changeBeneficiaryEventSpecCqCollectionItem);
    return this;
  }

  public List<ChangeBeneficiaryEventSpecCq> getChangeBeneficiaryEventSpecCqCollection() {
    return changeBeneficiaryEventSpecCqCollection;
  }

  public void setChangeBeneficiaryEventSpecCqCollection(List<ChangeBeneficiaryEventSpecCq> changeBeneficiaryEventSpecCqCollection) {
    this.changeBeneficiaryEventSpecCqCollection = changeBeneficiaryEventSpecCqCollection;
  }
}

