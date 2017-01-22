package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AccountLegalPartyPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("legalPartyIdCollection")
  private List<LegalPartyIdCq> legalPartyIdCollection = new ArrayList<LegalPartyIdCq>();

  public AccountLegalPartyPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public AccountLegalPartyPolicyQueryResult addLegalPartyIdCollectionItem(LegalPartyIdCq legalPartyIdCollectionItem) {
    this.legalPartyIdCollection.add(legalPartyIdCollectionItem);
    return this;
  }

  public List<LegalPartyIdCq> getLegalPartyIdCollection() {
    return legalPartyIdCollection;
  }

  public void setLegalPartyIdCollection(List<LegalPartyIdCq> legalPartyIdCollection) {
    this.legalPartyIdCollection = legalPartyIdCollection;
  }
}

