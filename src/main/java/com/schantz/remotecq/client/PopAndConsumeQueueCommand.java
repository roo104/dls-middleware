package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PopAndConsumeQueueCommand implements Serializable {
  @JsonProperty("queueIdCq")
  private QueueIdCq queueIdCq = null;

  @JsonProperty("maxPopCount")
  private Long maxPopCount = null;


  public QueueIdCq getQueueIdCq() {
    return queueIdCq;
  }

  public void setQueueIdCq(QueueIdCq queueIdCq) {
    this.queueIdCq = queueIdCq;
  }

  public Long getMaxPopCount() {
    return maxPopCount;
  }

  public void setMaxPopCount(Long maxPopCount) {
    this.maxPopCount = maxPopCount;
  }
}

