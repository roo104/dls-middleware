package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementPackageCq implements Serializable {
  @JsonProperty("packageId")
  private AgreementPackageIdCq packageId = null;

  @JsonProperty("complexId")
  private String complexId = null;

  @JsonProperty("agreementCoverCqCollection")
  private List<AgreementCoverCq> agreementCoverCqCollection = new ArrayList<AgreementCoverCq>();

  @JsonProperty("allowedInsuranceTypeTripletCq")
  private AllowedInsuranceTypeTripletCq allowedInsuranceTypeTripletCq = null;

  @JsonProperty("portfolioRuleFrame")
  private AllowedPortfolioRuleFrameIdTripletCq portfolioRuleFrame = null;

  @JsonProperty("customerSelectablityRuleTripletCq")
  private CustomerSelectablityRuleTripletCq customerSelectablityRuleTripletCq = null;

  @JsonProperty("visibilityRuleCollection")
  private List<VisibilitySelectionFrameTripletCq> visibilityRuleCollection = new ArrayList<VisibilitySelectionFrameTripletCq>();

  @JsonProperty("priority")
  private LongTripletCq priority = null;

  @JsonProperty("contributionFrameCollection")
  private List<PackageContributionFrameTripletCq> contributionFrameCollection = new ArrayList<PackageContributionFrameTripletCq>();

  @JsonProperty("allowedContributionRule")
  private AllowedPackageContributionRuleTripletCq allowedContributionRule = null;

  @JsonProperty("entityNameTripletCq")
  private EntityNameTripletCq entityNameTripletCq = null;

  @JsonProperty("systemControlled")
  private BooleanTripletCq systemControlled = null;

  @JsonProperty("bonusSpec")
  private BonusSpecTripletCq bonusSpec = null;

  @JsonProperty("policyOption1TripletCq")
  private PolicyOption1TripletCq policyOption1TripletCq = null;

  @JsonProperty("allowedPolicyOption1TripletCq")
  private AllowedPolicyOption1TripletCq allowedPolicyOption1TripletCq = null;

  @JsonProperty("policyOption2TripletCq")
  private PolicyOption2TripletCq policyOption2TripletCq = null;

  @JsonProperty("allowedPolicyOption2TripletCq")
  private AllowedPolicyOption2TripletCq allowedPolicyOption2TripletCq = null;

  @JsonProperty("policyOption3TripletCq")
  private PolicyOption3TripletCq policyOption3TripletCq = null;

  @JsonProperty("allowedPolicyOption3TripletCq")
  private AllowedPolicyOption3TripletCq allowedPolicyOption3TripletCq = null;

  @JsonProperty("unitLinkOwner")
  private BooleanTripletCq unitLinkOwner = null;

  @JsonProperty("packageTypeTripletCq")
  private PackageTypeTripletCq packageTypeTripletCq = null;

  @JsonProperty("packageOption1TripletCq")
  private PackageOption1TripletCq packageOption1TripletCq = null;

  @JsonProperty("packageOption2TripletCq")
  private PackageOption2TripletCq packageOption2TripletCq = null;

  @JsonProperty("legalTermIdTripletCq")
  private LegalTermIdTripletCq legalTermIdTripletCq = null;


  public AgreementPackageIdCq getPackageId() {
    return packageId;
  }

  public void setPackageId(AgreementPackageIdCq packageId) {
    this.packageId = packageId;
  }

  public String getComplexId() {
    return complexId;
  }

  public void setComplexId(String complexId) {
    this.complexId = complexId;
  }
  public AgreementPackageCq addAgreementCoverCqCollectionItem(AgreementCoverCq agreementCoverCqCollectionItem) {
    this.agreementCoverCqCollection.add(agreementCoverCqCollectionItem);
    return this;
  }

  public List<AgreementCoverCq> getAgreementCoverCqCollection() {
    return agreementCoverCqCollection;
  }

  public void setAgreementCoverCqCollection(List<AgreementCoverCq> agreementCoverCqCollection) {
    this.agreementCoverCqCollection = agreementCoverCqCollection;
  }

  public AllowedInsuranceTypeTripletCq getAllowedInsuranceTypeTripletCq() {
    return allowedInsuranceTypeTripletCq;
  }

  public void setAllowedInsuranceTypeTripletCq(AllowedInsuranceTypeTripletCq allowedInsuranceTypeTripletCq) {
    this.allowedInsuranceTypeTripletCq = allowedInsuranceTypeTripletCq;
  }

  public AllowedPortfolioRuleFrameIdTripletCq getPortfolioRuleFrame() {
    return portfolioRuleFrame;
  }

  public void setPortfolioRuleFrame(AllowedPortfolioRuleFrameIdTripletCq portfolioRuleFrame) {
    this.portfolioRuleFrame = portfolioRuleFrame;
  }

  public CustomerSelectablityRuleTripletCq getCustomerSelectablityRuleTripletCq() {
    return customerSelectablityRuleTripletCq;
  }

  public void setCustomerSelectablityRuleTripletCq(CustomerSelectablityRuleTripletCq customerSelectablityRuleTripletCq) {
    this.customerSelectablityRuleTripletCq = customerSelectablityRuleTripletCq;
  }
  public AgreementPackageCq addVisibilityRuleCollectionItem(VisibilitySelectionFrameTripletCq visibilityRuleCollectionItem) {
    this.visibilityRuleCollection.add(visibilityRuleCollectionItem);
    return this;
  }

  public List<VisibilitySelectionFrameTripletCq> getVisibilityRuleCollection() {
    return visibilityRuleCollection;
  }

  public void setVisibilityRuleCollection(List<VisibilitySelectionFrameTripletCq> visibilityRuleCollection) {
    this.visibilityRuleCollection = visibilityRuleCollection;
  }

  public LongTripletCq getPriority() {
    return priority;
  }

  public void setPriority(LongTripletCq priority) {
    this.priority = priority;
  }
  public AgreementPackageCq addContributionFrameCollectionItem(PackageContributionFrameTripletCq contributionFrameCollectionItem) {
    this.contributionFrameCollection.add(contributionFrameCollectionItem);
    return this;
  }

  public List<PackageContributionFrameTripletCq> getContributionFrameCollection() {
    return contributionFrameCollection;
  }

  public void setContributionFrameCollection(List<PackageContributionFrameTripletCq> contributionFrameCollection) {
    this.contributionFrameCollection = contributionFrameCollection;
  }

  public AllowedPackageContributionRuleTripletCq getAllowedContributionRule() {
    return allowedContributionRule;
  }

  public void setAllowedContributionRule(AllowedPackageContributionRuleTripletCq allowedContributionRule) {
    this.allowedContributionRule = allowedContributionRule;
  }

  public EntityNameTripletCq getEntityNameTripletCq() {
    return entityNameTripletCq;
  }

  public void setEntityNameTripletCq(EntityNameTripletCq entityNameTripletCq) {
    this.entityNameTripletCq = entityNameTripletCq;
  }

  public BooleanTripletCq getSystemControlled() {
    return systemControlled;
  }

  public void setSystemControlled(BooleanTripletCq systemControlled) {
    this.systemControlled = systemControlled;
  }

  public BonusSpecTripletCq getBonusSpec() {
    return bonusSpec;
  }

  public void setBonusSpec(BonusSpecTripletCq bonusSpec) {
    this.bonusSpec = bonusSpec;
  }

  public PolicyOption1TripletCq getPolicyOption1TripletCq() {
    return policyOption1TripletCq;
  }

  public void setPolicyOption1TripletCq(PolicyOption1TripletCq policyOption1TripletCq) {
    this.policyOption1TripletCq = policyOption1TripletCq;
  }

  public AllowedPolicyOption1TripletCq getAllowedPolicyOption1TripletCq() {
    return allowedPolicyOption1TripletCq;
  }

  public void setAllowedPolicyOption1TripletCq(AllowedPolicyOption1TripletCq allowedPolicyOption1TripletCq) {
    this.allowedPolicyOption1TripletCq = allowedPolicyOption1TripletCq;
  }

  public PolicyOption2TripletCq getPolicyOption2TripletCq() {
    return policyOption2TripletCq;
  }

  public void setPolicyOption2TripletCq(PolicyOption2TripletCq policyOption2TripletCq) {
    this.policyOption2TripletCq = policyOption2TripletCq;
  }

  public AllowedPolicyOption2TripletCq getAllowedPolicyOption2TripletCq() {
    return allowedPolicyOption2TripletCq;
  }

  public void setAllowedPolicyOption2TripletCq(AllowedPolicyOption2TripletCq allowedPolicyOption2TripletCq) {
    this.allowedPolicyOption2TripletCq = allowedPolicyOption2TripletCq;
  }

  public PolicyOption3TripletCq getPolicyOption3TripletCq() {
    return policyOption3TripletCq;
  }

  public void setPolicyOption3TripletCq(PolicyOption3TripletCq policyOption3TripletCq) {
    this.policyOption3TripletCq = policyOption3TripletCq;
  }

  public AllowedPolicyOption3TripletCq getAllowedPolicyOption3TripletCq() {
    return allowedPolicyOption3TripletCq;
  }

  public void setAllowedPolicyOption3TripletCq(AllowedPolicyOption3TripletCq allowedPolicyOption3TripletCq) {
    this.allowedPolicyOption3TripletCq = allowedPolicyOption3TripletCq;
  }

  public BooleanTripletCq getUnitLinkOwner() {
    return unitLinkOwner;
  }

  public void setUnitLinkOwner(BooleanTripletCq unitLinkOwner) {
    this.unitLinkOwner = unitLinkOwner;
  }

  public PackageTypeTripletCq getPackageTypeTripletCq() {
    return packageTypeTripletCq;
  }

  public void setPackageTypeTripletCq(PackageTypeTripletCq packageTypeTripletCq) {
    this.packageTypeTripletCq = packageTypeTripletCq;
  }

  public PackageOption1TripletCq getPackageOption1TripletCq() {
    return packageOption1TripletCq;
  }

  public void setPackageOption1TripletCq(PackageOption1TripletCq packageOption1TripletCq) {
    this.packageOption1TripletCq = packageOption1TripletCq;
  }

  public PackageOption2TripletCq getPackageOption2TripletCq() {
    return packageOption2TripletCq;
  }

  public void setPackageOption2TripletCq(PackageOption2TripletCq packageOption2TripletCq) {
    this.packageOption2TripletCq = packageOption2TripletCq;
  }

  public LegalTermIdTripletCq getLegalTermIdTripletCq() {
    return legalTermIdTripletCq;
  }

  public void setLegalTermIdTripletCq(LegalTermIdTripletCq legalTermIdTripletCq) {
    this.legalTermIdTripletCq = legalTermIdTripletCq;
  }
}

