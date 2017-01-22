package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementDimensionCq implements Serializable {
  @JsonProperty("dimensionId")
  private String dimensionId = null;

  @JsonProperty("dimValuesCollection")
  private List<AgreementDimensionValueCq> dimValuesCollection = new ArrayList<AgreementDimensionValueCq>();

  @JsonProperty("dimensionName")
  private EntityNameCq dimensionName = null;


  public String getDimensionId() {
    return dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
  }
  public AgreementDimensionCq addDimValuesCollectionItem(AgreementDimensionValueCq dimValuesCollectionItem) {
    this.dimValuesCollection.add(dimValuesCollectionItem);
    return this;
  }

  public List<AgreementDimensionValueCq> getDimValuesCollection() {
    return dimValuesCollection;
  }

  public void setDimValuesCollection(List<AgreementDimensionValueCq> dimValuesCollection) {
    this.dimValuesCollection = dimValuesCollection;
  }

  public EntityNameCq getDimensionName() {
    return dimensionName;
  }

  public void setDimensionName(EntityNameCq dimensionName) {
    this.dimensionName = dimensionName;
  }
}

