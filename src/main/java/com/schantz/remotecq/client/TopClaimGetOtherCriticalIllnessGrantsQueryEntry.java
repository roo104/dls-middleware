package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopClaimGetOtherCriticalIllnessGrantsQueryEntry implements Serializable {
  @JsonProperty("diagnosis")
  private String diagnosis = null;

  @JsonProperty("diagnosisDate")
  private LocalDate diagnosisDate = null;

  @JsonProperty("lifeCaseIdCq")
  private LifeCaseIdCq lifeCaseIdCq = null;


  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public LocalDate getDiagnosisDate() {
    return diagnosisDate;
  }

  public void setDiagnosisDate(LocalDate diagnosisDate) {
    this.diagnosisDate = diagnosisDate;
  }

  public LifeCaseIdCq getLifeCaseIdCq() {
    return lifeCaseIdCq;
  }

  public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
    this.lifeCaseIdCq = lifeCaseIdCq;
  }
}

