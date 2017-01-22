package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionOrBenefitParametersCq implements Serializable {
  @JsonProperty("contributionOrBenefitRule")
  private String contributionOrBenefitRule = null;

  @JsonProperty("contributionOrBenefitType")
  private String contributionOrBenefitType = null;

  @JsonProperty("amountParameters")
  private AmountParameterCq amountParameters = null;


  public String getContributionOrBenefitRule() {
    return contributionOrBenefitRule;
  }

  public void setContributionOrBenefitRule(String contributionOrBenefitRule) {
    this.contributionOrBenefitRule = contributionOrBenefitRule;
  }

  public String getContributionOrBenefitType() {
    return contributionOrBenefitType;
  }

  public void setContributionOrBenefitType(String contributionOrBenefitType) {
    this.contributionOrBenefitType = contributionOrBenefitType;
  }

  public AmountParameterCq getAmountParameters() {
    return amountParameters;
  }

  public void setAmountParameters(AmountParameterCq amountParameters) {
    this.amountParameters = amountParameters;
  }
}

