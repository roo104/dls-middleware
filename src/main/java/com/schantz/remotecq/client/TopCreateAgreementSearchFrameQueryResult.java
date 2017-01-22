package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateAgreementSearchFrameQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("isAgreementEnabled")
  private Boolean isAgreementEnabled = false;

  @JsonProperty("isParentAgreementEnabled")
  private Boolean isParentAgreementEnabled = false;

  @JsonProperty("isAvgSalaryEnabled")
  private Boolean isAvgSalaryEnabled = false;

  @JsonProperty("isNoEmployeesWithRiskWorkEnabled")
  private Boolean isNoEmployeesWithRiskWorkEnabled = false;

  @JsonProperty("isTotalMandatoryContributionEnabled")
  private Boolean isTotalMandatoryContributionEnabled = false;

  public TopCreateAgreementSearchFrameQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Boolean getIsAgreementEnabled() {
    return isAgreementEnabled;
  }

  public void setIsAgreementEnabled(Boolean isAgreementEnabled) {
    this.isAgreementEnabled = isAgreementEnabled;
  }

  public Boolean getIsParentAgreementEnabled() {
    return isParentAgreementEnabled;
  }

  public void setIsParentAgreementEnabled(Boolean isParentAgreementEnabled) {
    this.isParentAgreementEnabled = isParentAgreementEnabled;
  }

  public Boolean getIsAvgSalaryEnabled() {
    return isAvgSalaryEnabled;
  }

  public void setIsAvgSalaryEnabled(Boolean isAvgSalaryEnabled) {
    this.isAvgSalaryEnabled = isAvgSalaryEnabled;
  }

  public Boolean getIsNoEmployeesWithRiskWorkEnabled() {
    return isNoEmployeesWithRiskWorkEnabled;
  }

  public void setIsNoEmployeesWithRiskWorkEnabled(Boolean isNoEmployeesWithRiskWorkEnabled) {
    this.isNoEmployeesWithRiskWorkEnabled = isNoEmployeesWithRiskWorkEnabled;
  }

  public Boolean getIsTotalMandatoryContributionEnabled() {
    return isTotalMandatoryContributionEnabled;
  }

  public void setIsTotalMandatoryContributionEnabled(Boolean isTotalMandatoryContributionEnabled) {
    this.isTotalMandatoryContributionEnabled = isTotalMandatoryContributionEnabled;
  }
}

