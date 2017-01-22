package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AvailableAgreementRulesQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("agreementRuleDataCqCollection")
  private List<AgreementRuleDataCq> agreementRuleDataCqCollection = new ArrayList<AgreementRuleDataCq>();

  public AvailableAgreementRulesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public AvailableAgreementRulesQueryResult addAgreementRuleDataCqCollectionItem(AgreementRuleDataCq agreementRuleDataCqCollectionItem) {
    this.agreementRuleDataCqCollection.add(agreementRuleDataCqCollectionItem);
    return this;
  }

  public List<AgreementRuleDataCq> getAgreementRuleDataCqCollection() {
    return agreementRuleDataCqCollection;
  }

  public void setAgreementRuleDataCqCollection(List<AgreementRuleDataCq> agreementRuleDataCqCollection) {
    this.agreementRuleDataCqCollection = agreementRuleDataCqCollection;
  }
}

