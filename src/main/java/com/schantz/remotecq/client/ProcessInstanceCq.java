package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessInstanceCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("processInstanceStatusCq")
  private String processInstanceStatusCq = null;

  @JsonProperty("processInstanceIdCq")
  private ProcessInstanceIdCq processInstanceIdCq = null;

  @JsonProperty("processInstanceStateCqCollection")
  private List<ProcessInstanceStateCq> processInstanceStateCqCollection = new ArrayList<ProcessInstanceStateCq>();

  @JsonProperty("businessEntitiesRelationshipCq")
  private BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq = null;

  @JsonProperty("attachmentsCollection")
  private List<DocumentInfoCq> attachmentsCollection = new ArrayList<DocumentInfoCq>();

  @JsonProperty("startedByParent")
  private ProcessInstanceStateCq startedByParent = null;

  @JsonProperty("isDone")
  private Boolean isDone = false;

  @JsonProperty("isManuallyStarted")
  private Boolean isManuallyStarted = false;


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

  public String getProcessInstanceStatusCq() {
    return processInstanceStatusCq;
  }

  public void setProcessInstanceStatusCq(String processInstanceStatusCq) {
    this.processInstanceStatusCq = processInstanceStatusCq;
  }

  public ProcessInstanceIdCq getProcessInstanceIdCq() {
    return processInstanceIdCq;
  }

  public void setProcessInstanceIdCq(ProcessInstanceIdCq processInstanceIdCq) {
    this.processInstanceIdCq = processInstanceIdCq;
  }
  public ProcessInstanceCq addProcessInstanceStateCqCollectionItem(ProcessInstanceStateCq processInstanceStateCqCollectionItem) {
    this.processInstanceStateCqCollection.add(processInstanceStateCqCollectionItem);
    return this;
  }

  public List<ProcessInstanceStateCq> getProcessInstanceStateCqCollection() {
    return processInstanceStateCqCollection;
  }

  public void setProcessInstanceStateCqCollection(List<ProcessInstanceStateCq> processInstanceStateCqCollection) {
    this.processInstanceStateCqCollection = processInstanceStateCqCollection;
  }

  public BusinessEntitiesRelationshipCq getBusinessEntitiesRelationshipCq() {
    return businessEntitiesRelationshipCq;
  }

  public void setBusinessEntitiesRelationshipCq(BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq) {
    this.businessEntitiesRelationshipCq = businessEntitiesRelationshipCq;
  }
  public ProcessInstanceCq addAttachmentsCollectionItem(DocumentInfoCq attachmentsCollectionItem) {
    this.attachmentsCollection.add(attachmentsCollectionItem);
    return this;
  }

  public List<DocumentInfoCq> getAttachmentsCollection() {
    return attachmentsCollection;
  }

  public void setAttachmentsCollection(List<DocumentInfoCq> attachmentsCollection) {
    this.attachmentsCollection = attachmentsCollection;
  }

  public ProcessInstanceStateCq getStartedByParent() {
    return startedByParent;
  }

  public void setStartedByParent(ProcessInstanceStateCq startedByParent) {
    this.startedByParent = startedByParent;
  }

  public Boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }

  public Boolean getIsManuallyStarted() {
    return isManuallyStarted;
  }

  public void setIsManuallyStarted(Boolean isManuallyStarted) {
    this.isManuallyStarted = isManuallyStarted;
  }
}

