package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementValidationMessagePlacementCq implements Serializable {
  @JsonProperty("regardingCover")
  private AgreementCoverIdCq regardingCover = null;

  @JsonProperty("regardingVariant")
  private AgreementCoverVariantIdCq regardingVariant = null;

  @JsonProperty("regardingPackage")
  private AgreementPackageIdCq regardingPackage = null;

  @JsonProperty("regardingGrouping")
  private CqMessageKey regardingGrouping = null;

  @JsonProperty("regardingData")
  private CqMessageKey regardingData = null;

  @JsonProperty("failedInRuleSet")
  private CqMessageKey failedInRuleSet = null;

  @JsonProperty("regardingField")
  private CqMessageKey regardingField = null;

  @JsonProperty("regardingScope")
  private ScopeIdCq regardingScope = null;


  public AgreementCoverIdCq getRegardingCover() {
    return regardingCover;
  }

  public void setRegardingCover(AgreementCoverIdCq regardingCover) {
    this.regardingCover = regardingCover;
  }

  public AgreementCoverVariantIdCq getRegardingVariant() {
    return regardingVariant;
  }

  public void setRegardingVariant(AgreementCoverVariantIdCq regardingVariant) {
    this.regardingVariant = regardingVariant;
  }

  public AgreementPackageIdCq getRegardingPackage() {
    return regardingPackage;
  }

  public void setRegardingPackage(AgreementPackageIdCq regardingPackage) {
    this.regardingPackage = regardingPackage;
  }

  public CqMessageKey getRegardingGrouping() {
    return regardingGrouping;
  }

  public void setRegardingGrouping(CqMessageKey regardingGrouping) {
    this.regardingGrouping = regardingGrouping;
  }

  public CqMessageKey getRegardingData() {
    return regardingData;
  }

  public void setRegardingData(CqMessageKey regardingData) {
    this.regardingData = regardingData;
  }

  public CqMessageKey getFailedInRuleSet() {
    return failedInRuleSet;
  }

  public void setFailedInRuleSet(CqMessageKey failedInRuleSet) {
    this.failedInRuleSet = failedInRuleSet;
  }

  public CqMessageKey getRegardingField() {
    return regardingField;
  }

  public void setRegardingField(CqMessageKey regardingField) {
    this.regardingField = regardingField;
  }

  public ScopeIdCq getRegardingScope() {
    return regardingScope;
  }

  public void setRegardingScope(ScopeIdCq regardingScope) {
    this.regardingScope = regardingScope;
  }
}

