package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CancelImpactAssessmentCommand implements Serializable {
  @JsonProperty("impactAssessmentIdCq")
  private ImpactAssessmentIdCq impactAssessmentIdCq = null;


  public ImpactAssessmentIdCq getImpactAssessmentIdCq() {
    return impactAssessmentIdCq;
  }

  public void setImpactAssessmentIdCq(ImpactAssessmentIdCq impactAssessmentIdCq) {
    this.impactAssessmentIdCq = impactAssessmentIdCq;
  }
}

