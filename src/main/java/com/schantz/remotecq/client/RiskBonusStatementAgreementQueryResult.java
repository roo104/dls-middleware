package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusStatementAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("yearlyStatementCqCollection")
  private List<YearlyStatementCq> yearlyStatementCqCollection = new ArrayList<YearlyStatementCq>();

  public RiskBonusStatementAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RiskBonusStatementAgreementQueryResult addYearlyStatementCqCollectionItem(YearlyStatementCq yearlyStatementCqCollectionItem) {
    this.yearlyStatementCqCollection.add(yearlyStatementCqCollectionItem);
    return this;
  }

  public List<YearlyStatementCq> getYearlyStatementCqCollection() {
    return yearlyStatementCqCollection;
  }

  public void setYearlyStatementCqCollection(List<YearlyStatementCq> yearlyStatementCqCollection) {
    this.yearlyStatementCqCollection = yearlyStatementCqCollection;
  }
}

