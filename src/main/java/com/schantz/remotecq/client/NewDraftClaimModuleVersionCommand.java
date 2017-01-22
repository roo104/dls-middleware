package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewDraftClaimModuleVersionCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("maximumAmountYearly")
  private Double maximumAmountYearly = null;

  @JsonProperty("maximumAmountDuration")
  private Double maximumAmountDuration = null;

  @JsonProperty("cloneSource")
  private ClaimModuleVersionIdCq cloneSource = null;

  @JsonProperty("isCreateAsCancelled")
  private Boolean isCreateAsCancelled = false;

  @JsonProperty("isAttachableToAgreement")
  private Boolean isAttachableToAgreement = false;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getMaximumAmountYearly() {
    return maximumAmountYearly;
  }

  public void setMaximumAmountYearly(Double maximumAmountYearly) {
    this.maximumAmountYearly = maximumAmountYearly;
  }

  public Double getMaximumAmountDuration() {
    return maximumAmountDuration;
  }

  public void setMaximumAmountDuration(Double maximumAmountDuration) {
    this.maximumAmountDuration = maximumAmountDuration;
  }

  public ClaimModuleVersionIdCq getCloneSource() {
    return cloneSource;
  }

  public void setCloneSource(ClaimModuleVersionIdCq cloneSource) {
    this.cloneSource = cloneSource;
  }

  public Boolean getIsCreateAsCancelled() {
    return isCreateAsCancelled;
  }

  public void setIsCreateAsCancelled(Boolean isCreateAsCancelled) {
    this.isCreateAsCancelled = isCreateAsCancelled;
  }

  public Boolean getIsAttachableToAgreement() {
    return isAttachableToAgreement;
  }

  public void setIsAttachableToAgreement(Boolean isAttachableToAgreement) {
    this.isAttachableToAgreement = isAttachableToAgreement;
  }
}

