package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopBatchJobStopCommand implements Serializable {
  @JsonProperty("topBatchJobIdCq")
  private TopBatchJobIdCq topBatchJobIdCq = null;


  public TopBatchJobIdCq getTopBatchJobIdCq() {
    return topBatchJobIdCq;
  }

  public void setTopBatchJobIdCq(TopBatchJobIdCq topBatchJobIdCq) {
    this.topBatchJobIdCq = topBatchJobIdCq;
  }
}

