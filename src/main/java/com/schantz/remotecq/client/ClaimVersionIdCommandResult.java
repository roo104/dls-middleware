package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimVersionIdCommandResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("statusMessages")
  private List<CommandStatusMessage> statusMessages = new ArrayList<CommandStatusMessage>();

  @JsonProperty("identifier")
  private ClaimVersionIdCq identifier = null;

  public ClaimVersionIdCommandResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ClaimVersionIdCommandResult addStatusMessagesItem(CommandStatusMessage statusMessagesItem) {
    this.statusMessages.add(statusMessagesItem);
    return this;
  }

  public List<CommandStatusMessage> getStatusMessages() {
    return statusMessages;
  }

  public void setStatusMessages(List<CommandStatusMessage> statusMessages) {
    this.statusMessages = statusMessages;
  }

  public ClaimVersionIdCq getIdentifier() {
    return identifier;
  }

  public void setIdentifier(ClaimVersionIdCq identifier) {
    this.identifier = identifier;
  }
}

