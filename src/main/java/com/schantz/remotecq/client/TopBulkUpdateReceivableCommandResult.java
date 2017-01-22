package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkUpdateReceivableCommandResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("statusMessages")
  private List<CommandStatusMessage> statusMessages = new ArrayList<CommandStatusMessage>();

  @JsonProperty("topBulkUpdateReceivableResultCollection")
  private List<TopBulkUpdateReceivableResult> topBulkUpdateReceivableResultCollection = new ArrayList<TopBulkUpdateReceivableResult>();

  public TopBulkUpdateReceivableCommandResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopBulkUpdateReceivableCommandResult addStatusMessagesItem(CommandStatusMessage statusMessagesItem) {
    this.statusMessages.add(statusMessagesItem);
    return this;
  }

  public List<CommandStatusMessage> getStatusMessages() {
    return statusMessages;
  }

  public void setStatusMessages(List<CommandStatusMessage> statusMessages) {
    this.statusMessages = statusMessages;
  }
  public TopBulkUpdateReceivableCommandResult addTopBulkUpdateReceivableResultCollectionItem(TopBulkUpdateReceivableResult topBulkUpdateReceivableResultCollectionItem) {
    this.topBulkUpdateReceivableResultCollection.add(topBulkUpdateReceivableResultCollectionItem);
    return this;
  }

  public List<TopBulkUpdateReceivableResult> getTopBulkUpdateReceivableResultCollection() {
    return topBulkUpdateReceivableResultCollection;
  }

  public void setTopBulkUpdateReceivableResultCollection(List<TopBulkUpdateReceivableResult> topBulkUpdateReceivableResultCollection) {
    this.topBulkUpdateReceivableResultCollection = topBulkUpdateReceivableResultCollection;
  }
}

