package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class QueueOperationCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("orderNumber")
  private Long orderNumber = null;

  @JsonProperty("queueIdCq")
  private QueueIdCq queueIdCq = null;

  @JsonProperty("queueOperationTypeCq")
  private String queueOperationTypeCq = null;


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }

  public QueueIdCq getQueueIdCq() {
    return queueIdCq;
  }

  public void setQueueIdCq(QueueIdCq queueIdCq) {
    this.queueIdCq = queueIdCq;
  }

  public String getQueueOperationTypeCq() {
    return queueOperationTypeCq;
  }

  public void setQueueOperationTypeCq(String queueOperationTypeCq) {
    this.queueOperationTypeCq = queueOperationTypeCq;
  }
}

