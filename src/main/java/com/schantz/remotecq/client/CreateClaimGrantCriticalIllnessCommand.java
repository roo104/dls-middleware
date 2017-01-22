package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CreateClaimGrantCriticalIllnessCommand implements Serializable {
  @JsonProperty("occurrenceDate")
  private LocalDate occurrenceDate = null;

  @JsonProperty("reportedDate")
  private LocalDate reportedDate = null;

  @JsonProperty("claimVersionCq")
  private ClaimVersionCq claimVersionCq = null;

  @JsonProperty("claimCriticalIllnessTypeCq")
  private ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq = null;


  public LocalDate getOccurrenceDate() {
    return occurrenceDate;
  }

  public void setOccurrenceDate(LocalDate occurrenceDate) {
    this.occurrenceDate = occurrenceDate;
  }

  public LocalDate getReportedDate() {
    return reportedDate;
  }

  public void setReportedDate(LocalDate reportedDate) {
    this.reportedDate = reportedDate;
  }

  public ClaimVersionCq getClaimVersionCq() {
    return claimVersionCq;
  }

  public void setClaimVersionCq(ClaimVersionCq claimVersionCq) {
    this.claimVersionCq = claimVersionCq;
  }

  public ClaimCriticalIllnessTypeCq getClaimCriticalIllnessTypeCq() {
    return claimCriticalIllnessTypeCq;
  }

  public void setClaimCriticalIllnessTypeCq(ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq) {
    this.claimCriticalIllnessTypeCq = claimCriticalIllnessTypeCq;
  }
}

