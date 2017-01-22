package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class QueueManagerDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("pollFrequence")
  private Long pollFrequence = null;

  @JsonProperty("isStopped")
  private Boolean isStopped = false;

  @JsonProperty("isPaused")
  private Boolean isPaused = false;

  public QueueManagerDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Long getPollFrequence() {
    return pollFrequence;
  }

  public void setPollFrequence(Long pollFrequence) {
    this.pollFrequence = pollFrequence;
  }

  public Boolean getIsStopped() {
    return isStopped;
  }

  public void setIsStopped(Boolean isStopped) {
    this.isStopped = isStopped;
  }

  public Boolean getIsPaused() {
    return isPaused;
  }

  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }
}

