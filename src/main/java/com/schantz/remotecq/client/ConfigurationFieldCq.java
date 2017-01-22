package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ConfigurationFieldCq implements Serializable {
  @JsonProperty("orderIndex")
  private Long orderIndex = null;

  @JsonProperty("fieldLabelKey")
  private CqMessageKey fieldLabelKey = null;

  @JsonProperty("fieldLabelText")
  private String fieldLabelText = null;

  @JsonProperty("configurationFieldTypeCq")
  private ConfigurationFieldTypeCq configurationFieldTypeCq = null;

  @JsonProperty("fieldFeatureCqCollection")
  private List<FieldFeatureCq> fieldFeatureCqCollection = new ArrayList<FieldFeatureCq>();

  @JsonProperty("isEditable")
  private Boolean isEditable = false;


  public Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public CqMessageKey getFieldLabelKey() {
    return fieldLabelKey;
  }

  public void setFieldLabelKey(CqMessageKey fieldLabelKey) {
    this.fieldLabelKey = fieldLabelKey;
  }

  public String getFieldLabelText() {
    return fieldLabelText;
  }

  public void setFieldLabelText(String fieldLabelText) {
    this.fieldLabelText = fieldLabelText;
  }

  public ConfigurationFieldTypeCq getConfigurationFieldTypeCq() {
    return configurationFieldTypeCq;
  }

  public void setConfigurationFieldTypeCq(ConfigurationFieldTypeCq configurationFieldTypeCq) {
    this.configurationFieldTypeCq = configurationFieldTypeCq;
  }
  public ConfigurationFieldCq addFieldFeatureCqCollectionItem(FieldFeatureCq fieldFeatureCqCollectionItem) {
    this.fieldFeatureCqCollection.add(fieldFeatureCqCollectionItem);
    return this;
  }

  public List<FieldFeatureCq> getFieldFeatureCqCollection() {
    return fieldFeatureCqCollection;
  }

  public void setFieldFeatureCqCollection(List<FieldFeatureCq> fieldFeatureCqCollection) {
    this.fieldFeatureCqCollection = fieldFeatureCqCollection;
  }

  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }
}

