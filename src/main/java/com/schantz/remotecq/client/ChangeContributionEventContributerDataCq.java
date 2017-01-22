package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeContributionEventContributerDataCq implements Serializable {
  @JsonProperty("selectedAbs")
  private Double selectedAbs = null;

  @JsonProperty("selectedPct")
  private Double selectedPct = null;

  @JsonProperty("useLifeProductDefault")
  private Boolean useLifeProductDefault = false;

  @JsonProperty("selectedNamedStep")
  private String selectedNamedStep = null;

  @JsonProperty("coverDriven")
  private Boolean coverDriven = false;

  @JsonProperty("contributerTypeCq")
  private String contributerTypeCq = null;


  public Double getSelectedAbs() {
    return selectedAbs;
  }

  public void setSelectedAbs(Double selectedAbs) {
    this.selectedAbs = selectedAbs;
  }

  public Double getSelectedPct() {
    return selectedPct;
  }

  public void setSelectedPct(Double selectedPct) {
    this.selectedPct = selectedPct;
  }

  public Boolean getUseLifeProductDefault() {
    return useLifeProductDefault;
  }

  public void setUseLifeProductDefault(Boolean useLifeProductDefault) {
    this.useLifeProductDefault = useLifeProductDefault;
  }

  public String getSelectedNamedStep() {
    return selectedNamedStep;
  }

  public void setSelectedNamedStep(String selectedNamedStep) {
    this.selectedNamedStep = selectedNamedStep;
  }

  public Boolean getCoverDriven() {
    return coverDriven;
  }

  public void setCoverDriven(Boolean coverDriven) {
    this.coverDriven = coverDriven;
  }

  public String getContributerTypeCq() {
    return contributerTypeCq;
  }

  public void setContributerTypeCq(String contributerTypeCq) {
    this.contributerTypeCq = contributerTypeCq;
  }
}

