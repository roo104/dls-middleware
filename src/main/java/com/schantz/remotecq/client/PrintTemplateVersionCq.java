package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateVersionCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("versionDescription")
  private String versionDescription = null;

  @JsonProperty("changeDescription")
  private String changeDescription = null;

  @JsonProperty("subId")
  private String subId = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("draft")
  private Boolean draft = false;

  @JsonProperty("cancelled")
  private Boolean cancelled = false;

  @JsonProperty("saveOriginalOnEdit")
  private Boolean saveOriginalOnEdit = false;

  @JsonProperty("editRequired")
  private Boolean editRequired = false;

  @JsonProperty("editAllowed")
  private Boolean editAllowed = false;

  @JsonProperty("templateGrouping")
  private String templateGrouping = null;

  @JsonProperty("argumentCount")
  private Long argumentCount = null;

  @JsonProperty("desiredMasterTemplateId")
  private String desiredMasterTemplateId = null;

  @JsonProperty("defaultSelected")
  private Boolean defaultSelected = false;

  @JsonProperty("hasTemplateData")
  private Boolean hasTemplateData = false;

  @JsonProperty("masterTemplate")
  private PrintTemplateIdCq masterTemplate = null;

  @JsonProperty("printDataProviderCqCollection")
  private List<PrintDataProviderCq> printDataProviderCqCollection = new ArrayList<PrintDataProviderCq>();

  @JsonProperty("printTemplateVersionIdCq")
  private PrintTemplateVersionIdCq printTemplateVersionIdCq = null;

  @JsonProperty("contentTypeCollection")
  private List<String> contentTypeCollection = new ArrayList<String>();

  @JsonProperty("printTemplateArgumentCqCollection")
  private List<PrintTemplateArgumentCq> printTemplateArgumentCqCollection = new ArrayList<PrintTemplateArgumentCq>();

  @JsonProperty("childTemplatesCollection")
  private List<PrintTemplateVersionChildCq> childTemplatesCollection = new ArrayList<PrintTemplateVersionChildCq>();

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  @JsonProperty("canUpdateCollection")
  private List<String> canUpdateCollection = new ArrayList<String>();

  @JsonProperty("generalPrintContextTypeCqCollection")
  private List<String> generalPrintContextTypeCqCollection = new ArrayList<String>();

  @JsonProperty("printTemplateGroupingIdCq")
  private PrintTemplateGroupingIdCq printTemplateGroupingIdCq = null;

  @JsonProperty("outputChannelsCollection")
  private List<String> outputChannelsCollection = new ArrayList<String>();

  @JsonProperty("printTemplateEdition")
  private PrintTemplateEdition printTemplateEdition = null;


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

  public String getVersionDescription() {
    return versionDescription;
  }

  public void setVersionDescription(String versionDescription) {
    this.versionDescription = versionDescription;
  }

  public String getChangeDescription() {
    return changeDescription;
  }

  public void setChangeDescription(String changeDescription) {
    this.changeDescription = changeDescription;
  }

  public String getSubId() {
    return subId;
  }

  public void setSubId(String subId) {
    this.subId = subId;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public Boolean getCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public Boolean getSaveOriginalOnEdit() {
    return saveOriginalOnEdit;
  }

  public void setSaveOriginalOnEdit(Boolean saveOriginalOnEdit) {
    this.saveOriginalOnEdit = saveOriginalOnEdit;
  }

  public Boolean getEditRequired() {
    return editRequired;
  }

  public void setEditRequired(Boolean editRequired) {
    this.editRequired = editRequired;
  }

  public Boolean getEditAllowed() {
    return editAllowed;
  }

  public void setEditAllowed(Boolean editAllowed) {
    this.editAllowed = editAllowed;
  }

  public String getTemplateGrouping() {
    return templateGrouping;
  }

  public void setTemplateGrouping(String templateGrouping) {
    this.templateGrouping = templateGrouping;
  }

  public Long getArgumentCount() {
    return argumentCount;
  }

  public void setArgumentCount(Long argumentCount) {
    this.argumentCount = argumentCount;
  }

  public String getDesiredMasterTemplateId() {
    return desiredMasterTemplateId;
  }

  public void setDesiredMasterTemplateId(String desiredMasterTemplateId) {
    this.desiredMasterTemplateId = desiredMasterTemplateId;
  }

  public Boolean getDefaultSelected() {
    return defaultSelected;
  }

  public void setDefaultSelected(Boolean defaultSelected) {
    this.defaultSelected = defaultSelected;
  }

  public Boolean getHasTemplateData() {
    return hasTemplateData;
  }

  public void setHasTemplateData(Boolean hasTemplateData) {
    this.hasTemplateData = hasTemplateData;
  }

  public PrintTemplateIdCq getMasterTemplate() {
    return masterTemplate;
  }

  public void setMasterTemplate(PrintTemplateIdCq masterTemplate) {
    this.masterTemplate = masterTemplate;
  }
  public PrintTemplateVersionCq addPrintDataProviderCqCollectionItem(PrintDataProviderCq printDataProviderCqCollectionItem) {
    this.printDataProviderCqCollection.add(printDataProviderCqCollectionItem);
    return this;
  }

  public List<PrintDataProviderCq> getPrintDataProviderCqCollection() {
    return printDataProviderCqCollection;
  }

  public void setPrintDataProviderCqCollection(List<PrintDataProviderCq> printDataProviderCqCollection) {
    this.printDataProviderCqCollection = printDataProviderCqCollection;
  }

  public PrintTemplateVersionIdCq getPrintTemplateVersionIdCq() {
    return printTemplateVersionIdCq;
  }

  public void setPrintTemplateVersionIdCq(PrintTemplateVersionIdCq printTemplateVersionIdCq) {
    this.printTemplateVersionIdCq = printTemplateVersionIdCq;
  }
  public PrintTemplateVersionCq addContentTypeCollectionItem(String contentTypeCollectionItem) {
    this.contentTypeCollection.add(contentTypeCollectionItem);
    return this;
  }

  public List<String> getContentTypeCollection() {
    return contentTypeCollection;
  }

  public void setContentTypeCollection(List<String> contentTypeCollection) {
    this.contentTypeCollection = contentTypeCollection;
  }
  public PrintTemplateVersionCq addPrintTemplateArgumentCqCollectionItem(PrintTemplateArgumentCq printTemplateArgumentCqCollectionItem) {
    this.printTemplateArgumentCqCollection.add(printTemplateArgumentCqCollectionItem);
    return this;
  }

  public List<PrintTemplateArgumentCq> getPrintTemplateArgumentCqCollection() {
    return printTemplateArgumentCqCollection;
  }

  public void setPrintTemplateArgumentCqCollection(List<PrintTemplateArgumentCq> printTemplateArgumentCqCollection) {
    this.printTemplateArgumentCqCollection = printTemplateArgumentCqCollection;
  }
  public PrintTemplateVersionCq addChildTemplatesCollectionItem(PrintTemplateVersionChildCq childTemplatesCollectionItem) {
    this.childTemplatesCollection.add(childTemplatesCollectionItem);
    return this;
  }

  public List<PrintTemplateVersionChildCq> getChildTemplatesCollection() {
    return childTemplatesCollection;
  }

  public void setChildTemplatesCollection(List<PrintTemplateVersionChildCq> childTemplatesCollection) {
    this.childTemplatesCollection = childTemplatesCollection;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }
  public PrintTemplateVersionCq addCanUpdateCollectionItem(String canUpdateCollectionItem) {
    this.canUpdateCollection.add(canUpdateCollectionItem);
    return this;
  }

  public List<String> getCanUpdateCollection() {
    return canUpdateCollection;
  }

  public void setCanUpdateCollection(List<String> canUpdateCollection) {
    this.canUpdateCollection = canUpdateCollection;
  }
  public PrintTemplateVersionCq addGeneralPrintContextTypeCqCollectionItem(String generalPrintContextTypeCqCollectionItem) {
    this.generalPrintContextTypeCqCollection.add(generalPrintContextTypeCqCollectionItem);
    return this;
  }

  public List<String> getGeneralPrintContextTypeCqCollection() {
    return generalPrintContextTypeCqCollection;
  }

  public void setGeneralPrintContextTypeCqCollection(List<String> generalPrintContextTypeCqCollection) {
    this.generalPrintContextTypeCqCollection = generalPrintContextTypeCqCollection;
  }

  public PrintTemplateGroupingIdCq getPrintTemplateGroupingIdCq() {
    return printTemplateGroupingIdCq;
  }

  public void setPrintTemplateGroupingIdCq(PrintTemplateGroupingIdCq printTemplateGroupingIdCq) {
    this.printTemplateGroupingIdCq = printTemplateGroupingIdCq;
  }
  public PrintTemplateVersionCq addOutputChannelsCollectionItem(String outputChannelsCollectionItem) {
    this.outputChannelsCollection.add(outputChannelsCollectionItem);
    return this;
  }

  public List<String> getOutputChannelsCollection() {
    return outputChannelsCollection;
  }

  public void setOutputChannelsCollection(List<String> outputChannelsCollection) {
    this.outputChannelsCollection = outputChannelsCollection;
  }

  public PrintTemplateEdition getPrintTemplateEdition() {
    return printTemplateEdition;
  }

  public void setPrintTemplateEdition(PrintTemplateEdition printTemplateEdition) {
    this.printTemplateEdition = printTemplateEdition;
  }
}

