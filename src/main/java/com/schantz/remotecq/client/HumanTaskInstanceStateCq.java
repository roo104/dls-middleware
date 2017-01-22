package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HumanTaskInstanceStateCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("htmlDescription")
  private String htmlDescription = null;

  @JsonProperty("htmlDescriptionArgumentsCollection")
  private List<CqMessageKey> htmlDescriptionArgumentsCollection = new ArrayList<CqMessageKey>();

  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;

  @JsonProperty("currentState")
  private ProcessInstanceStateStatusChangeCq currentState = null;

  @JsonProperty("stateHistoryCollection")
  private List<ProcessInstanceStateStatusChangeCq> stateHistoryCollection = new ArrayList<ProcessInstanceStateStatusChangeCq>();

  @JsonProperty("configurationFieldCqCollection")
  private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();

  @JsonProperty("attachmentsCollection")
  private List<DocumentInfoCq> attachmentsCollection = new ArrayList<DocumentInfoCq>();

  @JsonProperty("processInstanceStateLogCqCollection")
  private List<ProcessInstanceStateLogCq> processInstanceStateLogCqCollection = new ArrayList<ProcessInstanceStateLogCq>();

  @JsonProperty("timeoutAt")
  private OffsetDateTime timeoutAt = null;

  @JsonProperty("solvableAt")
  private OffsetDateTime solvableAt = null;

  @JsonProperty("dueDate")
  private LocalDate dueDate = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("taskSeverityCq")
  private String taskSeverityCq = null;

  @JsonProperty("userCommentCqCollection")
  private List<UserCommentCq> userCommentCqCollection = new ArrayList<UserCommentCq>();

  @JsonProperty("taskAssignmentCq")
  private TaskAssignmentCq taskAssignmentCq = null;

  @JsonProperty("taskLabelCqCollection")
  private List<TaskLabelCq> taskLabelCqCollection = new ArrayList<TaskLabelCq>();

  @JsonProperty("claimedByUser")
  private UserIdCq claimedByUser = null;

  @JsonProperty("isSkippable")
  private Boolean isSkippable = false;

  @JsonProperty("isCompletable")
  private Boolean isCompletable = false;

  @JsonProperty("isDone")
  private Boolean isDone = false;


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

  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }
  public HumanTaskInstanceStateCq addHtmlDescriptionArgumentsCollectionItem(CqMessageKey htmlDescriptionArgumentsCollectionItem) {
    this.htmlDescriptionArgumentsCollection.add(htmlDescriptionArgumentsCollectionItem);
    return this;
  }

  public List<CqMessageKey> getHtmlDescriptionArgumentsCollection() {
    return htmlDescriptionArgumentsCollection;
  }

  public void setHtmlDescriptionArgumentsCollection(List<CqMessageKey> htmlDescriptionArgumentsCollection) {
    this.htmlDescriptionArgumentsCollection = htmlDescriptionArgumentsCollection;
  }

  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }

  public ProcessInstanceStateStatusChangeCq getCurrentState() {
    return currentState;
  }

  public void setCurrentState(ProcessInstanceStateStatusChangeCq currentState) {
    this.currentState = currentState;
  }
  public HumanTaskInstanceStateCq addStateHistoryCollectionItem(ProcessInstanceStateStatusChangeCq stateHistoryCollectionItem) {
    this.stateHistoryCollection.add(stateHistoryCollectionItem);
    return this;
  }

  public List<ProcessInstanceStateStatusChangeCq> getStateHistoryCollection() {
    return stateHistoryCollection;
  }

  public void setStateHistoryCollection(List<ProcessInstanceStateStatusChangeCq> stateHistoryCollection) {
    this.stateHistoryCollection = stateHistoryCollection;
  }
  public HumanTaskInstanceStateCq addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
    this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
    return this;
  }

  public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
    return configurationFieldCqCollection;
  }

  public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
    this.configurationFieldCqCollection = configurationFieldCqCollection;
  }
  public HumanTaskInstanceStateCq addAttachmentsCollectionItem(DocumentInfoCq attachmentsCollectionItem) {
    this.attachmentsCollection.add(attachmentsCollectionItem);
    return this;
  }

  public List<DocumentInfoCq> getAttachmentsCollection() {
    return attachmentsCollection;
  }

  public void setAttachmentsCollection(List<DocumentInfoCq> attachmentsCollection) {
    this.attachmentsCollection = attachmentsCollection;
  }
  public HumanTaskInstanceStateCq addProcessInstanceStateLogCqCollectionItem(ProcessInstanceStateLogCq processInstanceStateLogCqCollectionItem) {
    this.processInstanceStateLogCqCollection.add(processInstanceStateLogCqCollectionItem);
    return this;
  }

  public List<ProcessInstanceStateLogCq> getProcessInstanceStateLogCqCollection() {
    return processInstanceStateLogCqCollection;
  }

  public void setProcessInstanceStateLogCqCollection(List<ProcessInstanceStateLogCq> processInstanceStateLogCqCollection) {
    this.processInstanceStateLogCqCollection = processInstanceStateLogCqCollection;
  }

  public OffsetDateTime getTimeoutAt() {
    return timeoutAt;
  }

  public void setTimeoutAt(OffsetDateTime timeoutAt) {
    this.timeoutAt = timeoutAt;
  }

  public OffsetDateTime getSolvableAt() {
    return solvableAt;
  }

  public void setSolvableAt(OffsetDateTime solvableAt) {
    this.solvableAt = solvableAt;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getTaskSeverityCq() {
    return taskSeverityCq;
  }

  public void setTaskSeverityCq(String taskSeverityCq) {
    this.taskSeverityCq = taskSeverityCq;
  }
  public HumanTaskInstanceStateCq addUserCommentCqCollectionItem(UserCommentCq userCommentCqCollectionItem) {
    this.userCommentCqCollection.add(userCommentCqCollectionItem);
    return this;
  }

  public List<UserCommentCq> getUserCommentCqCollection() {
    return userCommentCqCollection;
  }

  public void setUserCommentCqCollection(List<UserCommentCq> userCommentCqCollection) {
    this.userCommentCqCollection = userCommentCqCollection;
  }

  public TaskAssignmentCq getTaskAssignmentCq() {
    return taskAssignmentCq;
  }

  public void setTaskAssignmentCq(TaskAssignmentCq taskAssignmentCq) {
    this.taskAssignmentCq = taskAssignmentCq;
  }
  public HumanTaskInstanceStateCq addTaskLabelCqCollectionItem(TaskLabelCq taskLabelCqCollectionItem) {
    this.taskLabelCqCollection.add(taskLabelCqCollectionItem);
    return this;
  }

  public List<TaskLabelCq> getTaskLabelCqCollection() {
    return taskLabelCqCollection;
  }

  public void setTaskLabelCqCollection(List<TaskLabelCq> taskLabelCqCollection) {
    this.taskLabelCqCollection = taskLabelCqCollection;
  }

  public UserIdCq getClaimedByUser() {
    return claimedByUser;
  }

  public void setClaimedByUser(UserIdCq claimedByUser) {
    this.claimedByUser = claimedByUser;
  }

  public Boolean getIsSkippable() {
    return isSkippable;
  }

  public void setIsSkippable(Boolean isSkippable) {
    this.isSkippable = isSkippable;
  }

  public Boolean getIsCompletable() {
    return isCompletable;
  }

  public void setIsCompletable(Boolean isCompletable) {
    this.isCompletable = isCompletable;
  }

  public Boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }
}

