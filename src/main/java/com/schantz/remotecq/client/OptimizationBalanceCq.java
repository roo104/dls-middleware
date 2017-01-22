package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class OptimizationBalanceCq implements Serializable {
  @JsonProperty("firstOrderBalance")
  private Double firstOrderBalance = null;

  @JsonProperty("secondOrderBalance")
  private Double secondOrderBalance = null;

  @JsonProperty("firstOrderBenefit")
  private Double firstOrderBenefit = null;

  @JsonProperty("premium")
  private Double premium = null;

  @JsonProperty("glDim1")
  private String glDim1 = null;

  @JsonProperty("glDim2")
  private String glDim2 = null;

  @JsonProperty("glDim3")
  private String glDim3 = null;

  @JsonProperty("glDim4")
  private String glDim4 = null;

  @JsonProperty("glDim5")
  private String glDim5 = null;

  @JsonProperty("glDim6")
  private String glDim6 = null;

  @JsonProperty("glDim7")
  private String glDim7 = null;

  @JsonProperty("glDim8")
  private String glDim8 = null;

  @JsonProperty("contributerShare1")
  private Double contributerShare1 = null;

  @JsonProperty("contributerShare2")
  private Double contributerShare2 = null;

  @JsonProperty("contributerShare3")
  private Double contributerShare3 = null;

  @JsonProperty("contributerShare4")
  private Double contributerShare4 = null;

  @JsonProperty("netPremium")
  private Double netPremium = null;

  @JsonProperty("calcFoundationId")
  private CalcFoundationIdCq calcFoundationId = null;

  @JsonProperty("contributerType1")
  private String contributerType1 = null;

  @JsonProperty("contributerType2")
  private String contributerType2 = null;

  @JsonProperty("contributerType3")
  private String contributerType3 = null;

  @JsonProperty("contributerType4")
  private String contributerType4 = null;


  public Double getFirstOrderBalance() {
    return firstOrderBalance;
  }

  public void setFirstOrderBalance(Double firstOrderBalance) {
    this.firstOrderBalance = firstOrderBalance;
  }

  public Double getSecondOrderBalance() {
    return secondOrderBalance;
  }

  public void setSecondOrderBalance(Double secondOrderBalance) {
    this.secondOrderBalance = secondOrderBalance;
  }

  public Double getFirstOrderBenefit() {
    return firstOrderBenefit;
  }

  public void setFirstOrderBenefit(Double firstOrderBenefit) {
    this.firstOrderBenefit = firstOrderBenefit;
  }

  public Double getPremium() {
    return premium;
  }

  public void setPremium(Double premium) {
    this.premium = premium;
  }

  public String getGlDim1() {
    return glDim1;
  }

  public void setGlDim1(String glDim1) {
    this.glDim1 = glDim1;
  }

  public String getGlDim2() {
    return glDim2;
  }

  public void setGlDim2(String glDim2) {
    this.glDim2 = glDim2;
  }

  public String getGlDim3() {
    return glDim3;
  }

  public void setGlDim3(String glDim3) {
    this.glDim3 = glDim3;
  }

  public String getGlDim4() {
    return glDim4;
  }

  public void setGlDim4(String glDim4) {
    this.glDim4 = glDim4;
  }

  public String getGlDim5() {
    return glDim5;
  }

  public void setGlDim5(String glDim5) {
    this.glDim5 = glDim5;
  }

  public String getGlDim6() {
    return glDim6;
  }

  public void setGlDim6(String glDim6) {
    this.glDim6 = glDim6;
  }

  public String getGlDim7() {
    return glDim7;
  }

  public void setGlDim7(String glDim7) {
    this.glDim7 = glDim7;
  }

  public String getGlDim8() {
    return glDim8;
  }

  public void setGlDim8(String glDim8) {
    this.glDim8 = glDim8;
  }

  public Double getContributerShare1() {
    return contributerShare1;
  }

  public void setContributerShare1(Double contributerShare1) {
    this.contributerShare1 = contributerShare1;
  }

  public Double getContributerShare2() {
    return contributerShare2;
  }

  public void setContributerShare2(Double contributerShare2) {
    this.contributerShare2 = contributerShare2;
  }

  public Double getContributerShare3() {
    return contributerShare3;
  }

  public void setContributerShare3(Double contributerShare3) {
    this.contributerShare3 = contributerShare3;
  }

  public Double getContributerShare4() {
    return contributerShare4;
  }

  public void setContributerShare4(Double contributerShare4) {
    this.contributerShare4 = contributerShare4;
  }

  public Double getNetPremium() {
    return netPremium;
  }

  public void setNetPremium(Double netPremium) {
    this.netPremium = netPremium;
  }

  public CalcFoundationIdCq getCalcFoundationId() {
    return calcFoundationId;
  }

  public void setCalcFoundationId(CalcFoundationIdCq calcFoundationId) {
    this.calcFoundationId = calcFoundationId;
  }

  public String getContributerType1() {
    return contributerType1;
  }

  public void setContributerType1(String contributerType1) {
    this.contributerType1 = contributerType1;
  }

  public String getContributerType2() {
    return contributerType2;
  }

  public void setContributerType2(String contributerType2) {
    this.contributerType2 = contributerType2;
  }

  public String getContributerType3() {
    return contributerType3;
  }

  public void setContributerType3(String contributerType3) {
    this.contributerType3 = contributerType3;
  }

  public String getContributerType4() {
    return contributerType4;
  }

  public void setContributerType4(String contributerType4) {
    this.contributerType4 = contributerType4;
  }
}

