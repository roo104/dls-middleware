package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PublishMessageCommand implements Serializable {
  @JsonProperty("queueIdCq")
  private QueueIdCq queueIdCq = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("queueMessageCq")
  private QueueMessageCq queueMessageCq = null;


  public QueueIdCq getQueueIdCq() {
    return queueIdCq;
  }

  public void setQueueIdCq(QueueIdCq queueIdCq) {
    this.queueIdCq = queueIdCq;
  }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public QueueMessageCq getQueueMessageCq() {
    return queueMessageCq;
  }

  public void setQueueMessageCq(QueueMessageCq queueMessageCq) {
    this.queueMessageCq = queueMessageCq;
  }
}

