package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class QueueMessageDetailsQueryQueueMessageDetailsQueryResult implements Serializable {
  @JsonProperty("queueMessageIdCq")
  private QueueMessageIdCq queueMessageIdCq = null;


  public QueueMessageIdCq getQueueMessageIdCq() {
    return queueMessageIdCq;
  }

  public void setQueueMessageIdCq(QueueMessageIdCq queueMessageIdCq) {
    this.queueMessageIdCq = queueMessageIdCq;
  }
}

