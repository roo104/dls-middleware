package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateFundCommand implements Serializable {
  @JsonProperty("fundId")
  private String fundId = null;

  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("projectionGroup")
  private String projectionGroup = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("currencyCodeCq")
  private String currencyCodeCq = null;

  @JsonProperty("sectorCq")
  private String sectorCq = null;

  @JsonProperty("investmentAssetCq")
  private String investmentAssetCq = null;

  @JsonProperty("regionCq")
  private String regionCq = null;

  @JsonProperty("morningStarCq")
  private String morningStarCq = null;

  @JsonProperty("investmentRiskCq")
  private String investmentRiskCq = null;

  @JsonProperty("ownerId")
  private UnitLinkedOwnerIdCq ownerId = null;

  @JsonProperty("kickbackOptionCq")
  private String kickbackOptionCq = null;

  @JsonProperty("investmentRuleCq")
  private String investmentRuleCq = null;

  @JsonProperty("fundInternalChargeGroupCq")
  private String fundInternalChargeGroupCq = null;

  @JsonProperty("fundProjectionGroupCq")
  private String fundProjectionGroupCq = null;

  @JsonProperty("isinNumber")
  private String isinNumber = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("isActive")
  private Boolean isActive = false;


  public String getFundId() {
    return fundId;
  }

  public void setFundId(String fundId) {
    this.fundId = fundId;
  }

  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public String getProjectionGroup() {
    return projectionGroup;
  }

  public void setProjectionGroup(String projectionGroup) {
    this.projectionGroup = projectionGroup;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getCurrencyCodeCq() {
    return currencyCodeCq;
  }

  public void setCurrencyCodeCq(String currencyCodeCq) {
    this.currencyCodeCq = currencyCodeCq;
  }

  public String getSectorCq() {
    return sectorCq;
  }

  public void setSectorCq(String sectorCq) {
    this.sectorCq = sectorCq;
  }

  public String getInvestmentAssetCq() {
    return investmentAssetCq;
  }

  public void setInvestmentAssetCq(String investmentAssetCq) {
    this.investmentAssetCq = investmentAssetCq;
  }

  public String getRegionCq() {
    return regionCq;
  }

  public void setRegionCq(String regionCq) {
    this.regionCq = regionCq;
  }

  public String getMorningStarCq() {
    return morningStarCq;
  }

  public void setMorningStarCq(String morningStarCq) {
    this.morningStarCq = morningStarCq;
  }

  public String getInvestmentRiskCq() {
    return investmentRiskCq;
  }

  public void setInvestmentRiskCq(String investmentRiskCq) {
    this.investmentRiskCq = investmentRiskCq;
  }

  public UnitLinkedOwnerIdCq getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UnitLinkedOwnerIdCq ownerId) {
    this.ownerId = ownerId;
  }

  public String getKickbackOptionCq() {
    return kickbackOptionCq;
  }

  public void setKickbackOptionCq(String kickbackOptionCq) {
    this.kickbackOptionCq = kickbackOptionCq;
  }

  public String getInvestmentRuleCq() {
    return investmentRuleCq;
  }

  public void setInvestmentRuleCq(String investmentRuleCq) {
    this.investmentRuleCq = investmentRuleCq;
  }

  public String getFundInternalChargeGroupCq() {
    return fundInternalChargeGroupCq;
  }

  public void setFundInternalChargeGroupCq(String fundInternalChargeGroupCq) {
    this.fundInternalChargeGroupCq = fundInternalChargeGroupCq;
  }

  public String getFundProjectionGroupCq() {
    return fundProjectionGroupCq;
  }

  public void setFundProjectionGroupCq(String fundProjectionGroupCq) {
    this.fundProjectionGroupCq = fundProjectionGroupCq;
  }

  public String getIsinNumber() {
    return isinNumber;
  }

  public void setIsinNumber(String isinNumber) {
    this.isinNumber = isinNumber;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
}

