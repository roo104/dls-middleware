package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateAgreementCommand implements Serializable {
  @JsonProperty("commandData")
  private TopCVRAgreementCommandData commandData = null;

  @JsonProperty("topCVRAgreementSearchDataCq")
  private TopCVRAgreementSearchDataCq topCVRAgreementSearchDataCq = null;

  @JsonProperty("topAgreementSearchConceptsQueryResult")
  private TopAgreementSearchConceptsQueryResult topAgreementSearchConceptsQueryResult = null;


  public TopCVRAgreementCommandData getCommandData() {
    return commandData;
  }

  public void setCommandData(TopCVRAgreementCommandData commandData) {
    this.commandData = commandData;
  }

  public TopCVRAgreementSearchDataCq getTopCVRAgreementSearchDataCq() {
    return topCVRAgreementSearchDataCq;
  }

  public void setTopCVRAgreementSearchDataCq(TopCVRAgreementSearchDataCq topCVRAgreementSearchDataCq) {
    this.topCVRAgreementSearchDataCq = topCVRAgreementSearchDataCq;
  }

  public TopAgreementSearchConceptsQueryResult getTopAgreementSearchConceptsQueryResult() {
    return topAgreementSearchConceptsQueryResult;
  }

  public void setTopAgreementSearchConceptsQueryResult(TopAgreementSearchConceptsQueryResult topAgreementSearchConceptsQueryResult) {
    this.topAgreementSearchConceptsQueryResult = topAgreementSearchConceptsQueryResult;
  }
}

