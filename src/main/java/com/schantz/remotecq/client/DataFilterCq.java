package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DataFilterCq implements Serializable {
  @JsonProperty("benefitEndMin")
  private Long benefitEndMin = null;

  @JsonProperty("benefitEndMax")
  private Long benefitEndMax = null;


  public Long getBenefitEndMin() {
    return benefitEndMin;
  }

  public void setBenefitEndMin(Long benefitEndMin) {
    this.benefitEndMin = benefitEndMin;
  }

  public Long getBenefitEndMax() {
    return benefitEndMax;
  }

  public void setBenefitEndMax(Long benefitEndMax) {
    this.benefitEndMax = benefitEndMax;
  }
}

