package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AccountSummaryGroupCq implements Serializable {
  @JsonProperty("groupType")
  private String groupType = null;

  @JsonProperty("totalEntry")
  private AccountSummaryEntryCq totalEntry = null;

  @JsonProperty("entryCollection")
  private List<AccountSummaryEntryCq> entryCollection = new ArrayList<AccountSummaryEntryCq>();


  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public AccountSummaryEntryCq getTotalEntry() {
    return totalEntry;
  }

  public void setTotalEntry(AccountSummaryEntryCq totalEntry) {
    this.totalEntry = totalEntry;
  }
  public AccountSummaryGroupCq addEntryCollectionItem(AccountSummaryEntryCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<AccountSummaryEntryCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<AccountSummaryEntryCq> entryCollection) {
    this.entryCollection = entryCollection;
  }
}

