package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CreatePortfolioRuleFrameCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("specialRule")
  private Boolean specialRule = false;

  @JsonProperty("entityNameCq")
  private EntityNameCq entityNameCq = null;

  @JsonProperty("unitLinkedOwnerIdCq")
  private UnitLinkedOwnerIdCq unitLinkedOwnerIdCq = null;

  @JsonProperty("specialRuleCompany")
  private CompanyIdCq specialRuleCompany = null;

  @JsonProperty("createFrom")
  private PortfolioRuleFrameIdCq createFrom = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public EntityNameCq getEntityNameCq() {
    return entityNameCq;
  }

  public void setEntityNameCq(EntityNameCq entityNameCq) {
    this.entityNameCq = entityNameCq;
  }

  public UnitLinkedOwnerIdCq getUnitLinkedOwnerIdCq() {
    return unitLinkedOwnerIdCq;
  }

  public void setUnitLinkedOwnerIdCq(UnitLinkedOwnerIdCq unitLinkedOwnerIdCq) {
    this.unitLinkedOwnerIdCq = unitLinkedOwnerIdCq;
  }

  public CompanyIdCq getSpecialRuleCompany() {
    return specialRuleCompany;
  }

  public void setSpecialRuleCompany(CompanyIdCq specialRuleCompany) {
    this.specialRuleCompany = specialRuleCompany;
  }

  public PortfolioRuleFrameIdCq getCreateFrom() {
    return createFrom;
  }

  public void setCreateFrom(PortfolioRuleFrameIdCq createFrom) {
    this.createFrom = createFrom;
  }
}

