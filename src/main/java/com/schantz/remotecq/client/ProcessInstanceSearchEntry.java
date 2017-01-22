package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessInstanceSearchEntry implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("completeTime")
  private OffsetDateTime completeTime = null;

  @JsonProperty("processInstanceStatusCq")
  private String processInstanceStatusCq = null;

  @JsonProperty("businessEntitiesRelationshipCq")
  private BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq = null;

  @JsonProperty("processInstanceStateCqCollection")
  private List<ProcessInstanceStateCq> processInstanceStateCqCollection = new ArrayList<ProcessInstanceStateCq>();

  @JsonProperty("processInstanceIdCq")
  private ProcessInstanceIdCq processInstanceIdCq = null;


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

  public OffsetDateTime getCompleteTime() {
    return completeTime;
  }

  public void setCompleteTime(OffsetDateTime completeTime) {
    this.completeTime = completeTime;
  }

  public String getProcessInstanceStatusCq() {
    return processInstanceStatusCq;
  }

  public void setProcessInstanceStatusCq(String processInstanceStatusCq) {
    this.processInstanceStatusCq = processInstanceStatusCq;
  }

  public BusinessEntitiesRelationshipCq getBusinessEntitiesRelationshipCq() {
    return businessEntitiesRelationshipCq;
  }

  public void setBusinessEntitiesRelationshipCq(BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq) {
    this.businessEntitiesRelationshipCq = businessEntitiesRelationshipCq;
  }
  public ProcessInstanceSearchEntry addProcessInstanceStateCqCollectionItem(ProcessInstanceStateCq processInstanceStateCqCollectionItem) {
    this.processInstanceStateCqCollection.add(processInstanceStateCqCollectionItem);
    return this;
  }

  public List<ProcessInstanceStateCq> getProcessInstanceStateCqCollection() {
    return processInstanceStateCqCollection;
  }

  public void setProcessInstanceStateCqCollection(List<ProcessInstanceStateCq> processInstanceStateCqCollection) {
    this.processInstanceStateCqCollection = processInstanceStateCqCollection;
  }

  public ProcessInstanceIdCq getProcessInstanceIdCq() {
    return processInstanceIdCq;
  }

  public void setProcessInstanceIdCq(ProcessInstanceIdCq processInstanceIdCq) {
    this.processInstanceIdCq = processInstanceIdCq;
  }
}

