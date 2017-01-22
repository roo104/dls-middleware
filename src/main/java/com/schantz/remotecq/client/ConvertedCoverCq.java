package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ConvertedCoverCq implements Serializable {
  @JsonProperty("coverInstanceId")
  private String coverInstanceId = null;

  @JsonProperty("packageInstanceId")
  private String packageInstanceId = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("life2")
  private PersonCq life2 = null;

  @JsonProperty("bonusSpecCq")
  private BonusSpecCq bonusSpecCq = null;

  @JsonProperty("life1")
  private PersonCq life1 = null;

  @JsonProperty("calcFoundationCollection")
  private List<CalcFoundationCq> calcFoundationCollection = new ArrayList<CalcFoundationCq>();

  @JsonProperty("contributionOrBenefitParametersCq")
  private ContributionOrBenefitParametersCq contributionOrBenefitParametersCq = null;

  @JsonProperty("selectedAssetType")
  private String selectedAssetType = null;

  @JsonProperty("premiumTimeSpec")
  private TimeSpecParameterCq premiumTimeSpec = null;

  @JsonProperty("riskTimeSpec")
  private TimeSpecParameterCq riskTimeSpec = null;

  @JsonProperty("benefitTimeSpec")
  private TimeSpecParameterCq benefitTimeSpec = null;

  @JsonProperty("selectedTaxCode")
  private String selectedTaxCode = null;

  @JsonProperty("lifeCoverState")
  private String lifeCoverState = null;

  @JsonProperty("agreementCoverVariantId")
  private AgreementCoverVariantIdCq agreementCoverVariantId = null;


  public String getCoverInstanceId() {
    return coverInstanceId;
  }

  public void setCoverInstanceId(String coverInstanceId) {
    this.coverInstanceId = coverInstanceId;
  }

  public String getPackageInstanceId() {
    return packageInstanceId;
  }

  public void setPackageInstanceId(String packageInstanceId) {
    this.packageInstanceId = packageInstanceId;
  }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public PersonCq getLife2() {
    return life2;
  }

  public void setLife2(PersonCq life2) {
    this.life2 = life2;
  }

  public BonusSpecCq getBonusSpecCq() {
    return bonusSpecCq;
  }

  public void setBonusSpecCq(BonusSpecCq bonusSpecCq) {
    this.bonusSpecCq = bonusSpecCq;
  }

  public PersonCq getLife1() {
    return life1;
  }

  public void setLife1(PersonCq life1) {
    this.life1 = life1;
  }
  public ConvertedCoverCq addCalcFoundationCollectionItem(CalcFoundationCq calcFoundationCollectionItem) {
    this.calcFoundationCollection.add(calcFoundationCollectionItem);
    return this;
  }

  public List<CalcFoundationCq> getCalcFoundationCollection() {
    return calcFoundationCollection;
  }

  public void setCalcFoundationCollection(List<CalcFoundationCq> calcFoundationCollection) {
    this.calcFoundationCollection = calcFoundationCollection;
  }

  public ContributionOrBenefitParametersCq getContributionOrBenefitParametersCq() {
    return contributionOrBenefitParametersCq;
  }

  public void setContributionOrBenefitParametersCq(ContributionOrBenefitParametersCq contributionOrBenefitParametersCq) {
    this.contributionOrBenefitParametersCq = contributionOrBenefitParametersCq;
  }

  public String getSelectedAssetType() {
    return selectedAssetType;
  }

  public void setSelectedAssetType(String selectedAssetType) {
    this.selectedAssetType = selectedAssetType;
  }

  public TimeSpecParameterCq getPremiumTimeSpec() {
    return premiumTimeSpec;
  }

  public void setPremiumTimeSpec(TimeSpecParameterCq premiumTimeSpec) {
    this.premiumTimeSpec = premiumTimeSpec;
  }

  public TimeSpecParameterCq getRiskTimeSpec() {
    return riskTimeSpec;
  }

  public void setRiskTimeSpec(TimeSpecParameterCq riskTimeSpec) {
    this.riskTimeSpec = riskTimeSpec;
  }

  public TimeSpecParameterCq getBenefitTimeSpec() {
    return benefitTimeSpec;
  }

  public void setBenefitTimeSpec(TimeSpecParameterCq benefitTimeSpec) {
    this.benefitTimeSpec = benefitTimeSpec;
  }

  public String getSelectedTaxCode() {
    return selectedTaxCode;
  }

  public void setSelectedTaxCode(String selectedTaxCode) {
    this.selectedTaxCode = selectedTaxCode;
  }

  public String getLifeCoverState() {
    return lifeCoverState;
  }

  public void setLifeCoverState(String lifeCoverState) {
    this.lifeCoverState = lifeCoverState;
  }

  public AgreementCoverVariantIdCq getAgreementCoverVariantId() {
    return agreementCoverVariantId;
  }

  public void setAgreementCoverVariantId(AgreementCoverVariantIdCq agreementCoverVariantId) {
    this.agreementCoverVariantId = agreementCoverVariantId;
  }
}

