package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LifeCaseCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("caseName")
  private String caseName = null;

  @JsonProperty("caseFrontSide")
  private String caseFrontSide = null;

  @JsonProperty("lifeCaseIdCq")
  private LifeCaseIdCq lifeCaseIdCq = null;

  @JsonProperty("processInstanceCqCollection")
  private List<ProcessInstanceCq> processInstanceCqCollection = new ArrayList<ProcessInstanceCq>();

  @JsonProperty("lifeCaseTypeCq")
  private String lifeCaseTypeCq = null;

  @JsonProperty("businessEntitiesRelationshipCq")
  private BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq = null;

  @JsonProperty("caseEventCollection")
  private List<LceCq> caseEventCollection = new ArrayList<LceCq>();

  @JsonProperty("noticeCqCollection")
  private List<NoticeCq> noticeCqCollection = new ArrayList<NoticeCq>();

  @JsonProperty("lifeCaseStateCq")
  private String lifeCaseStateCq = null;

  @JsonProperty("documentInfoCqCollection")
  private List<DocumentInfoCq> documentInfoCqCollection = new ArrayList<DocumentInfoCq>();

  @JsonProperty("quoteCqCollection")
  private List<QuoteCq> quoteCqCollection = new ArrayList<QuoteCq>();

  @JsonProperty("eventCqCollection")
  private List<EventCq> eventCqCollection = new ArrayList<EventCq>();

  @JsonProperty("caseOwner")
  private UserIdCq caseOwner = null;

  @JsonProperty("userCommentCqCollection")
  private List<UserCommentCq> userCommentCqCollection = new ArrayList<UserCommentCq>();

  @JsonProperty("configurationFieldCqCollection")
  private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();


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

  public String getCaseName() {
    return caseName;
  }

  public void setCaseName(String caseName) {
    this.caseName = caseName;
  }

  public String getCaseFrontSide() {
    return caseFrontSide;
  }

  public void setCaseFrontSide(String caseFrontSide) {
    this.caseFrontSide = caseFrontSide;
  }

  public LifeCaseIdCq getLifeCaseIdCq() {
    return lifeCaseIdCq;
  }

  public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
    this.lifeCaseIdCq = lifeCaseIdCq;
  }
  public LifeCaseCq addProcessInstanceCqCollectionItem(ProcessInstanceCq processInstanceCqCollectionItem) {
    this.processInstanceCqCollection.add(processInstanceCqCollectionItem);
    return this;
  }

  public List<ProcessInstanceCq> getProcessInstanceCqCollection() {
    return processInstanceCqCollection;
  }

  public void setProcessInstanceCqCollection(List<ProcessInstanceCq> processInstanceCqCollection) {
    this.processInstanceCqCollection = processInstanceCqCollection;
  }

  public String getLifeCaseTypeCq() {
    return lifeCaseTypeCq;
  }

  public void setLifeCaseTypeCq(String lifeCaseTypeCq) {
    this.lifeCaseTypeCq = lifeCaseTypeCq;
  }

  public BusinessEntitiesRelationshipCq getBusinessEntitiesRelationshipCq() {
    return businessEntitiesRelationshipCq;
  }

  public void setBusinessEntitiesRelationshipCq(BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq) {
    this.businessEntitiesRelationshipCq = businessEntitiesRelationshipCq;
  }
  public LifeCaseCq addCaseEventCollectionItem(LceCq caseEventCollectionItem) {
    this.caseEventCollection.add(caseEventCollectionItem);
    return this;
  }

  public List<LceCq> getCaseEventCollection() {
    return caseEventCollection;
  }

  public void setCaseEventCollection(List<LceCq> caseEventCollection) {
    this.caseEventCollection = caseEventCollection;
  }
  public LifeCaseCq addNoticeCqCollectionItem(NoticeCq noticeCqCollectionItem) {
    this.noticeCqCollection.add(noticeCqCollectionItem);
    return this;
  }

  public List<NoticeCq> getNoticeCqCollection() {
    return noticeCqCollection;
  }

  public void setNoticeCqCollection(List<NoticeCq> noticeCqCollection) {
    this.noticeCqCollection = noticeCqCollection;
  }

  public String getLifeCaseStateCq() {
    return lifeCaseStateCq;
  }

  public void setLifeCaseStateCq(String lifeCaseStateCq) {
    this.lifeCaseStateCq = lifeCaseStateCq;
  }
  public LifeCaseCq addDocumentInfoCqCollectionItem(DocumentInfoCq documentInfoCqCollectionItem) {
    this.documentInfoCqCollection.add(documentInfoCqCollectionItem);
    return this;
  }

  public List<DocumentInfoCq> getDocumentInfoCqCollection() {
    return documentInfoCqCollection;
  }

  public void setDocumentInfoCqCollection(List<DocumentInfoCq> documentInfoCqCollection) {
    this.documentInfoCqCollection = documentInfoCqCollection;
  }
  public LifeCaseCq addQuoteCqCollectionItem(QuoteCq quoteCqCollectionItem) {
    this.quoteCqCollection.add(quoteCqCollectionItem);
    return this;
  }

  public List<QuoteCq> getQuoteCqCollection() {
    return quoteCqCollection;
  }

  public void setQuoteCqCollection(List<QuoteCq> quoteCqCollection) {
    this.quoteCqCollection = quoteCqCollection;
  }
  public LifeCaseCq addEventCqCollectionItem(EventCq eventCqCollectionItem) {
    this.eventCqCollection.add(eventCqCollectionItem);
    return this;
  }

  public List<EventCq> getEventCqCollection() {
    return eventCqCollection;
  }

  public void setEventCqCollection(List<EventCq> eventCqCollection) {
    this.eventCqCollection = eventCqCollection;
  }

  public UserIdCq getCaseOwner() {
    return caseOwner;
  }

  public void setCaseOwner(UserIdCq caseOwner) {
    this.caseOwner = caseOwner;
  }
  public LifeCaseCq addUserCommentCqCollectionItem(UserCommentCq userCommentCqCollectionItem) {
    this.userCommentCqCollection.add(userCommentCqCollectionItem);
    return this;
  }

  public List<UserCommentCq> getUserCommentCqCollection() {
    return userCommentCqCollection;
  }

  public void setUserCommentCqCollection(List<UserCommentCq> userCommentCqCollection) {
    this.userCommentCqCollection = userCommentCqCollection;
  }
  public LifeCaseCq addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
    this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
    return this;
  }

  public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
    return configurationFieldCqCollection;
  }

  public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
    this.configurationFieldCqCollection = configurationFieldCqCollection;
  }
}

