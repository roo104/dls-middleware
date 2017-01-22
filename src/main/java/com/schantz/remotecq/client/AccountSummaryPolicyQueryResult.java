package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AccountSummaryPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("dueDateCollection")
  private List<LocalDate> dueDateCollection = new ArrayList<LocalDate>();

  @JsonProperty("accountSummaryGroupCqCollection")
  private List<AccountSummaryGroupCq> accountSummaryGroupCqCollection = new ArrayList<AccountSummaryGroupCq>();

  public AccountSummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public AccountSummaryPolicyQueryResult addDueDateCollectionItem(LocalDate dueDateCollectionItem) {
    this.dueDateCollection.add(dueDateCollectionItem);
    return this;
  }

  public List<LocalDate> getDueDateCollection() {
    return dueDateCollection;
  }

  public void setDueDateCollection(List<LocalDate> dueDateCollection) {
    this.dueDateCollection = dueDateCollection;
  }
  public AccountSummaryPolicyQueryResult addAccountSummaryGroupCqCollectionItem(AccountSummaryGroupCq accountSummaryGroupCqCollectionItem) {
    this.accountSummaryGroupCqCollection.add(accountSummaryGroupCqCollectionItem);
    return this;
  }

  public List<AccountSummaryGroupCq> getAccountSummaryGroupCqCollection() {
    return accountSummaryGroupCqCollection;
  }

  public void setAccountSummaryGroupCqCollection(List<AccountSummaryGroupCq> accountSummaryGroupCqCollection) {
    this.accountSummaryGroupCqCollection = accountSummaryGroupCqCollection;
  }
}

