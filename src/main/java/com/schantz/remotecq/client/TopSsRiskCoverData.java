package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsRiskCoverData implements Serializable {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("benefit")
  private Double benefit = null;

  @JsonProperty("benefitEnd")
  private AgeDateCq benefitEnd = null;

  @JsonProperty("beneficiary")
  private String beneficiary = null;

  @JsonProperty("calculatedAt")
  private LocalDate calculatedAt = null;


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getBenefit() {
    return benefit;
  }

  public void setBenefit(Double benefit) {
    this.benefit = benefit;
  }

  public AgeDateCq getBenefitEnd() {
    return benefitEnd;
  }

  public void setBenefitEnd(AgeDateCq benefitEnd) {
    this.benefitEnd = benefitEnd;
  }

  public String getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(String beneficiary) {
    this.beneficiary = beneficiary;
  }

  public LocalDate getCalculatedAt() {
    return calculatedAt;
  }

  public void setCalculatedAt(LocalDate calculatedAt) {
    this.calculatedAt = calculatedAt;
  }
}

