package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopReceivableBulkUpdateBatchQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("totalCount")
  private Long totalCount = null;

  @JsonProperty("updatedCount")
  private Long updatedCount = null;

  @JsonProperty("failedCount")
  private Long failedCount = null;

  @JsonProperty("ignoredCount")
  private Long ignoredCount = null;

  public TopReceivableBulkUpdateBatchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public Long getUpdatedCount() {
    return updatedCount;
  }

  public void setUpdatedCount(Long updatedCount) {
    this.updatedCount = updatedCount;
  }

  public Long getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Long failedCount) {
    this.failedCount = failedCount;
  }

  public Long getIgnoredCount() {
    return ignoredCount;
  }

  public void setIgnoredCount(Long ignoredCount) {
    this.ignoredCount = ignoredCount;
  }
}

