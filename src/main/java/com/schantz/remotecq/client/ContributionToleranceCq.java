package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionToleranceCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("positiveTolerance")
  private Double positiveTolerance = null;

  @JsonProperty("negativeTolerance")
  private Double negativeTolerance = null;

  @JsonProperty("positiveTolerancePct")
  private Double positiveTolerancePct = null;

  @JsonProperty("negativeTolerancePct")
  private Double negativeTolerancePct = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("contributionToleranceConsequenceEventCq")
  private ContributionToleranceConsequenceEventCq contributionToleranceConsequenceEventCq = null;

  @JsonProperty("contributionTolerenceActionCq")
  private String contributionTolerenceActionCq = null;


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

  public Double getPositiveTolerance() {
    return positiveTolerance;
  }

  public void setPositiveTolerance(Double positiveTolerance) {
    this.positiveTolerance = positiveTolerance;
  }

  public Double getNegativeTolerance() {
    return negativeTolerance;
  }

  public void setNegativeTolerance(Double negativeTolerance) {
    this.negativeTolerance = negativeTolerance;
  }

  public Double getPositiveTolerancePct() {
    return positiveTolerancePct;
  }

  public void setPositiveTolerancePct(Double positiveTolerancePct) {
    this.positiveTolerancePct = positiveTolerancePct;
  }

  public Double getNegativeTolerancePct() {
    return negativeTolerancePct;
  }

  public void setNegativeTolerancePct(Double negativeTolerancePct) {
    this.negativeTolerancePct = negativeTolerancePct;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public ContributionToleranceConsequenceEventCq getContributionToleranceConsequenceEventCq() {
    return contributionToleranceConsequenceEventCq;
  }

  public void setContributionToleranceConsequenceEventCq(ContributionToleranceConsequenceEventCq contributionToleranceConsequenceEventCq) {
    this.contributionToleranceConsequenceEventCq = contributionToleranceConsequenceEventCq;
  }

  public String getContributionTolerenceActionCq() {
    return contributionTolerenceActionCq;
  }

  public void setContributionTolerenceActionCq(String contributionTolerenceActionCq) {
    this.contributionTolerenceActionCq = contributionTolerenceActionCq;
  }
}

