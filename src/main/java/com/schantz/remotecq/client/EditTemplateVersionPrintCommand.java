package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditTemplateVersionPrintCommand implements Serializable {
  @JsonProperty("data")
  private byte[] data = null;

  @JsonProperty("versionDescription")
  private String versionDescription = null;

  @JsonProperty("changeDescription")
  private String changeDescription = null;

  @JsonProperty("versionId")
  private String versionId = null;

  @JsonProperty("saveOriginalOnEdit")
  private Boolean saveOriginalOnEdit = false;

  @JsonProperty("editRequired")
  private Boolean editRequired = false;

  @JsonProperty("editAllowed")
  private Boolean editAllowed = false;

  @JsonProperty("defaultSelected")
  private Boolean defaultSelected = false;

  @JsonProperty("printTemplateGroupingIdCq")
  private PrintTemplateGroupingIdCq printTemplateGroupingIdCq = null;

  @JsonProperty("generalPrintContextTypeCqCollection")
  private List<String> generalPrintContextTypeCqCollection = new ArrayList<String>();

  @JsonProperty("generalPrintContentTypeCqCollection")
  private List<String> generalPrintContentTypeCqCollection = new ArrayList<String>();

  @JsonProperty("editMe")
  private PrintTemplateVersionIdCq editMe = null;

  @JsonProperty("printTemplateIdCq")
  private PrintTemplateIdCq printTemplateIdCq = null;

  @JsonProperty("printDataProviderIdCqCollection")
  private List<PrintDataProviderIdCq> printDataProviderIdCqCollection = new ArrayList<PrintDataProviderIdCq>();

  @JsonProperty("printTemplateArgumentCqCollection")
  private List<PrintTemplateArgumentCq> printTemplateArgumentCqCollection = new ArrayList<PrintTemplateArgumentCq>();

  @JsonProperty("masterTemplate")
  private PrintTemplateIdCq masterTemplate = null;

  @JsonProperty("templateChildCollection")
  private List<EditPrintTemplateChild> templateChildCollection = new ArrayList<EditPrintTemplateChild>();

  @JsonProperty("outputChannelsCollection")
  private List<String> outputChannelsCollection = new ArrayList<String>();


  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
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

  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
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

  public Boolean getDefaultSelected() {
    return defaultSelected;
  }

  public void setDefaultSelected(Boolean defaultSelected) {
    this.defaultSelected = defaultSelected;
  }

  public PrintTemplateGroupingIdCq getPrintTemplateGroupingIdCq() {
    return printTemplateGroupingIdCq;
  }

  public void setPrintTemplateGroupingIdCq(PrintTemplateGroupingIdCq printTemplateGroupingIdCq) {
    this.printTemplateGroupingIdCq = printTemplateGroupingIdCq;
  }
  public EditTemplateVersionPrintCommand addGeneralPrintContextTypeCqCollectionItem(String generalPrintContextTypeCqCollectionItem) {
    this.generalPrintContextTypeCqCollection.add(generalPrintContextTypeCqCollectionItem);
    return this;
  }

  public List<String> getGeneralPrintContextTypeCqCollection() {
    return generalPrintContextTypeCqCollection;
  }

  public void setGeneralPrintContextTypeCqCollection(List<String> generalPrintContextTypeCqCollection) {
    this.generalPrintContextTypeCqCollection = generalPrintContextTypeCqCollection;
  }
  public EditTemplateVersionPrintCommand addGeneralPrintContentTypeCqCollectionItem(String generalPrintContentTypeCqCollectionItem) {
    this.generalPrintContentTypeCqCollection.add(generalPrintContentTypeCqCollectionItem);
    return this;
  }

  public List<String> getGeneralPrintContentTypeCqCollection() {
    return generalPrintContentTypeCqCollection;
  }

  public void setGeneralPrintContentTypeCqCollection(List<String> generalPrintContentTypeCqCollection) {
    this.generalPrintContentTypeCqCollection = generalPrintContentTypeCqCollection;
  }

  public PrintTemplateVersionIdCq getEditMe() {
    return editMe;
  }

  public void setEditMe(PrintTemplateVersionIdCq editMe) {
    this.editMe = editMe;
  }

  public PrintTemplateIdCq getPrintTemplateIdCq() {
    return printTemplateIdCq;
  }

  public void setPrintTemplateIdCq(PrintTemplateIdCq printTemplateIdCq) {
    this.printTemplateIdCq = printTemplateIdCq;
  }
  public EditTemplateVersionPrintCommand addPrintDataProviderIdCqCollectionItem(PrintDataProviderIdCq printDataProviderIdCqCollectionItem) {
    this.printDataProviderIdCqCollection.add(printDataProviderIdCqCollectionItem);
    return this;
  }

  public List<PrintDataProviderIdCq> getPrintDataProviderIdCqCollection() {
    return printDataProviderIdCqCollection;
  }

  public void setPrintDataProviderIdCqCollection(List<PrintDataProviderIdCq> printDataProviderIdCqCollection) {
    this.printDataProviderIdCqCollection = printDataProviderIdCqCollection;
  }
  public EditTemplateVersionPrintCommand addPrintTemplateArgumentCqCollectionItem(PrintTemplateArgumentCq printTemplateArgumentCqCollectionItem) {
    this.printTemplateArgumentCqCollection.add(printTemplateArgumentCqCollectionItem);
    return this;
  }

  public List<PrintTemplateArgumentCq> getPrintTemplateArgumentCqCollection() {
    return printTemplateArgumentCqCollection;
  }

  public void setPrintTemplateArgumentCqCollection(List<PrintTemplateArgumentCq> printTemplateArgumentCqCollection) {
    this.printTemplateArgumentCqCollection = printTemplateArgumentCqCollection;
  }

  public PrintTemplateIdCq getMasterTemplate() {
    return masterTemplate;
  }

  public void setMasterTemplate(PrintTemplateIdCq masterTemplate) {
    this.masterTemplate = masterTemplate;
  }
  public EditTemplateVersionPrintCommand addTemplateChildCollectionItem(EditPrintTemplateChild templateChildCollectionItem) {
    this.templateChildCollection.add(templateChildCollectionItem);
    return this;
  }

  public List<EditPrintTemplateChild> getTemplateChildCollection() {
    return templateChildCollection;
  }

  public void setTemplateChildCollection(List<EditPrintTemplateChild> templateChildCollection) {
    this.templateChildCollection = templateChildCollection;
  }
  public EditTemplateVersionPrintCommand addOutputChannelsCollectionItem(String outputChannelsCollectionItem) {
    this.outputChannelsCollection.add(outputChannelsCollectionItem);
    return this;
  }

  public List<String> getOutputChannelsCollection() {
    return outputChannelsCollection;
  }

  public void setOutputChannelsCollection(List<String> outputChannelsCollection) {
    this.outputChannelsCollection = outputChannelsCollection;
  }
}

