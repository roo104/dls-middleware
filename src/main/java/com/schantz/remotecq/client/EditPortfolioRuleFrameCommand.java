package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EditPortfolioRuleFrameCommand implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("cancelled")
  private Boolean cancelled = false;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("specialRule")
  private Boolean specialRule = false;

  @JsonProperty("unitLinkedOwnerIdCq")
  private UnitLinkedOwnerIdCq unitLinkedOwnerIdCq = null;

  @JsonProperty("portfolioRuleFrameIdCq")
  private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;

  @JsonProperty("entityNameCq")
  private EntityNameCq entityNameCq = null;

  @JsonProperty("specialRuleCompany")
  private CompanyIdCq specialRuleCompany = null;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public Boolean getCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getSpecialRule() {
    return specialRule;
  }

  public void setSpecialRule(Boolean specialRule) {
    this.specialRule = specialRule;
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

  public EntityNameCq getEntityNameCq() {
    return entityNameCq;
  }

  public void setEntityNameCq(EntityNameCq entityNameCq) {
    this.entityNameCq = entityNameCq;
  }

  public CompanyIdCq getSpecialRuleCompany() {
    return specialRuleCompany;
  }

  public void setSpecialRuleCompany(CompanyIdCq specialRuleCompany) {
    this.specialRuleCompany = specialRuleCompany;
  }
}

