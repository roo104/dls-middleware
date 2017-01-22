package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioRuleFrameInfoCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("cancelled")
  private Boolean cancelled = false;

  @JsonProperty("unitLinkedOwnerIdCq")
  private UnitLinkedOwnerIdCq unitLinkedOwnerIdCq = null;

  @JsonProperty("portfolioRuleFrameIdCq")
  private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;

  @JsonProperty("portfolioSpecialRuleCq")
  private PortfolioSpecialRuleCq portfolioSpecialRuleCq = null;

  @JsonProperty("isDraft")
  private Boolean isDraft = false;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public Boolean getCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public UnitLinkedOwnerIdCq getUnitLinkedOwnerIdCq() {
    return unitLinkedOwnerIdCq;
  }

  public void setUnitLinkedOwnerIdCq(UnitLinkedOwnerIdCq unitLinkedOwnerIdCq) {
    this.unitLinkedOwnerIdCq = unitLinkedOwnerIdCq;
  }

  public PortfolioRuleFrameIdCq getPortfolioRuleFrameIdCq() {
    return portfolioRuleFrameIdCq;
  }

  public void setPortfolioRuleFrameIdCq(PortfolioRuleFrameIdCq portfolioRuleFrameIdCq) {
    this.portfolioRuleFrameIdCq = portfolioRuleFrameIdCq;
  }

  public PortfolioSpecialRuleCq getPortfolioSpecialRuleCq() {
    return portfolioSpecialRuleCq;
  }

  public void setPortfolioSpecialRuleCq(PortfolioSpecialRuleCq portfolioSpecialRuleCq) {
    this.portfolioSpecialRuleCq = portfolioSpecialRuleCq;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }
}

