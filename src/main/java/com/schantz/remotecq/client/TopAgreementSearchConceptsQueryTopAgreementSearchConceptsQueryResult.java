package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementSearchConceptsQueryTopAgreementSearchConceptsQueryResult implements Serializable {
  @JsonProperty("parameters")
  private TopCVRAgreementSearchDataCq parameters = null;


  public TopCVRAgreementSearchDataCq getParameters() {
    return parameters;
  }

  public void setParameters(TopCVRAgreementSearchDataCq parameters) {
    this.parameters = parameters;
  }
}

