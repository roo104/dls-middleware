package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AccountInformationLegalPartyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("dkAccountInformationCqCollection")
  private List<DkAccountInformationCq> dkAccountInformationCqCollection = new ArrayList<DkAccountInformationCq>();

  @JsonProperty("isStopPayment")
  private Boolean isStopPayment = false;

  public AccountInformationLegalPartyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public AccountInformationLegalPartyQueryResult addDkAccountInformationCqCollectionItem(DkAccountInformationCq dkAccountInformationCqCollectionItem) {
    this.dkAccountInformationCqCollection.add(dkAccountInformationCqCollectionItem);
    return this;
  }

  public List<DkAccountInformationCq> getDkAccountInformationCqCollection() {
    return dkAccountInformationCqCollection;
  }

  public void setDkAccountInformationCqCollection(List<DkAccountInformationCq> dkAccountInformationCqCollection) {
    this.dkAccountInformationCqCollection = dkAccountInformationCqCollection;
  }

  public Boolean getIsStopPayment() {
    return isStopPayment;
  }

  public void setIsStopPayment(Boolean isStopPayment) {
    this.isStopPayment = isStopPayment;
  }
}

