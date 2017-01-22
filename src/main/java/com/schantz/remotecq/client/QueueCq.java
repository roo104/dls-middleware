package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class QueueCq implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("persistentQueueCount")
  private Long persistentQueueCount = null;

  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("queueIdCq")
  private QueueIdCq queueIdCq = null;

  @JsonProperty("queueExecutorStatsCq")
  private QueueExecutorStatsCq queueExecutorStatsCq = null;

  @JsonProperty("isPersistentQueuePaused")
  private Boolean isPersistentQueuePaused = false;

  public QueueCq addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Long getPersistentQueueCount() {
    return persistentQueueCount;
  }

  public void setPersistentQueueCount(Long persistentQueueCount) {
    this.persistentQueueCount = persistentQueueCount;
  }

  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public QueueIdCq getQueueIdCq() {
    return queueIdCq;
  }

  public void setQueueIdCq(QueueIdCq queueIdCq) {
    this.queueIdCq = queueIdCq;
  }

  public QueueExecutorStatsCq getQueueExecutorStatsCq() {
    return queueExecutorStatsCq;
  }

  public void setQueueExecutorStatsCq(QueueExecutorStatsCq queueExecutorStatsCq) {
    this.queueExecutorStatsCq = queueExecutorStatsCq;
  }

  public Boolean getIsPersistentQueuePaused() {
    return isPersistentQueuePaused;
  }

  public void setIsPersistentQueuePaused(Boolean isPersistentQueuePaused) {
    this.isPersistentQueuePaused = isPersistentQueuePaused;
  }
}

