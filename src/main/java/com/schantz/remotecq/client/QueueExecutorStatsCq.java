package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class QueueExecutorStatsCq implements Serializable {
  @JsonProperty("activeCount")
  private Long activeCount = null;

  @JsonProperty("completedTaskCount")
  private Long completedTaskCount = null;

  @JsonProperty("corePoolSize")
  private Long corePoolSize = null;

  @JsonProperty("keepAliveTime")
  private Long keepAliveTime = null;

  @JsonProperty("largestPoolSize")
  private Long largestPoolSize = null;

  @JsonProperty("maximumPoolSize")
  private Long maximumPoolSize = null;

  @JsonProperty("poolSize")
  private Long poolSize = null;

  @JsonProperty("taskCount")
  private Long taskCount = null;

  @JsonProperty("isTerminated")
  private Boolean isTerminated = false;

  @JsonProperty("isTerminating")
  private Boolean isTerminating = false;

  @JsonProperty("isShutdown")
  private Boolean isShutdown = false;


  public Long getActiveCount() {
    return activeCount;
  }

  public void setActiveCount(Long activeCount) {
    this.activeCount = activeCount;
  }

  public Long getCompletedTaskCount() {
    return completedTaskCount;
  }

  public void setCompletedTaskCount(Long completedTaskCount) {
    this.completedTaskCount = completedTaskCount;
  }

  public Long getCorePoolSize() {
    return corePoolSize;
  }

  public void setCorePoolSize(Long corePoolSize) {
    this.corePoolSize = corePoolSize;
  }

  public Long getKeepAliveTime() {
    return keepAliveTime;
  }

  public void setKeepAliveTime(Long keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  public Long getLargestPoolSize() {
    return largestPoolSize;
  }

  public void setLargestPoolSize(Long largestPoolSize) {
    this.largestPoolSize = largestPoolSize;
  }

  public Long getMaximumPoolSize() {
    return maximumPoolSize;
  }

  public void setMaximumPoolSize(Long maximumPoolSize) {
    this.maximumPoolSize = maximumPoolSize;
  }

  public Long getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(Long poolSize) {
    this.poolSize = poolSize;
  }

  public Long getTaskCount() {
    return taskCount;
  }

  public void setTaskCount(Long taskCount) {
    this.taskCount = taskCount;
  }

  public Boolean getIsTerminated() {
    return isTerminated;
  }

  public void setIsTerminated(Boolean isTerminated) {
    this.isTerminated = isTerminated;
  }

  public Boolean getIsTerminating() {
    return isTerminating;
  }

  public void setIsTerminating(Boolean isTerminating) {
    this.isTerminating = isTerminating;
  }

  public Boolean getIsShutdown() {
    return isShutdown;
  }

  public void setIsShutdown(Boolean isShutdown) {
    this.isShutdown = isShutdown;
  }
}

