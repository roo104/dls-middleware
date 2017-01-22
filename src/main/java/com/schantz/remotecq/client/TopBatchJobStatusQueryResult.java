package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopBatchJobStatusQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("exitCode")
  private Long exitCode = null;

  @JsonProperty("progressPercent")
  private Long progressPercent = null;

  @JsonProperty("topBatchJobStatusCq")
  private String topBatchJobStatusCq = null;

  public TopBatchJobStatusQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getExitCode() {
    return exitCode;
  }

  public void setExitCode(Long exitCode) {
    this.exitCode = exitCode;
  }

  public Long getProgressPercent() {
    return progressPercent;
  }

  public void setProgressPercent(Long progressPercent) {
    this.progressPercent = progressPercent;
  }

  public String getTopBatchJobStatusCq() {
    return topBatchJobStatusCq;
  }

  public void setTopBatchJobStatusCq(String topBatchJobStatusCq) {
    this.topBatchJobStatusCq = topBatchJobStatusCq;
  }
}

