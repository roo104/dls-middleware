package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementVariantCq implements Serializable {
  @JsonProperty("variantId")
  private AgreementCoverVariantIdCq variantId = null;

  @JsonProperty("premiumTimeFrame")
  private TimeSpecFrameTripletCq premiumTimeFrame = null;

  @JsonProperty("benefitTimeFrame")
  private TimeSpecFrameTripletCq benefitTimeFrame = null;

  @JsonProperty("riskTimeFrame")
  private TimeSpecFrameTripletCq riskTimeFrame = null;

  @JsonProperty("allowedTaxCodeTripletCq")
  private AllowedTaxCodeTripletCq allowedTaxCodeTripletCq = null;

  @JsonProperty("portfolioRuleFrame")
  private AllowedPortfolioRuleFrameIdTripletCq portfolioRuleFrame = null;

  @JsonProperty("priority")
  private LongTripletCq priority = null;

  @JsonProperty("allowedRegulationCodeTripletCq")
  private AllowedRegulationCodeTripletCq allowedRegulationCodeTripletCq = null;

  @JsonProperty("createAge")
  private TimeFrameTripletCq createAge = null;

  @JsonProperty("contributionOrBenefitFrameTripletCq")
  private ContributionOrBenefitFrameTripletCq contributionOrBenefitFrameTripletCq = null;

  @JsonProperty("amountFrameTripletCq")
  private AmountFrameTripletCq amountFrameTripletCq = null;

  @JsonProperty("dimensionExpressionTripletCq")
  private DimensionExpressionTripletCq dimensionExpressionTripletCq = null;

  @JsonProperty("defaultVariant")
  private BooleanTripletCq defaultVariant = null;

  @JsonProperty("benefitTypeTripletCq")
  private BenefitTypeTripletCq benefitTypeTripletCq = null;

  @JsonProperty("benefitTriggerEvent")
  private AllowedBenefitTriggerEventTripletCq benefitTriggerEvent = null;

  @JsonProperty("allowedInsuranceTypeTripletCq")
  private AllowedInsuranceTypeTripletCq allowedInsuranceTypeTripletCq = null;

  @JsonProperty("agreementPaymentRestrictionCollection")
  private List<AgreementPaymentRestriction> agreementPaymentRestrictionCollection = new ArrayList<AgreementPaymentRestriction>();

  @JsonProperty("allowedCalculationFoundationDimensionTripletCq")
  private AllowedCalculationFoundationDimensionTripletCq allowedCalculationFoundationDimensionTripletCq = null;

  @JsonProperty("customerSelectablityRuleTripletCq")
  private CustomerSelectablityRuleTripletCq customerSelectablityRuleTripletCq = null;

  @JsonProperty("allowedAssetTypeTripletCq")
  private AllowedAssetTypeTripletCq allowedAssetTypeTripletCq = null;

  @JsonProperty("lifeCoverTypeTripletCq")
  private LifeCoverTypeTripletCq lifeCoverTypeTripletCq = null;

  @JsonProperty("priceGroupIdTripletCq")
  private PriceGroupIdTripletCq priceGroupIdTripletCq = null;

  @JsonProperty("solidaryPrice")
  private BooleanTripletCq solidaryPrice = null;

  @JsonProperty("riskBonusGroupIdTripletCq")
  private RiskBonusGroupIdTripletCq riskBonusGroupIdTripletCq = null;

  @JsonProperty("allowedCoverOption1TripletCq")
  private AllowedCoverOption1TripletCq allowedCoverOption1TripletCq = null;

  @JsonProperty("allowedCoverOption2TripletCq")
  private AllowedCoverOption2TripletCq allowedCoverOption2TripletCq = null;

  @JsonProperty("entityNameTripletCq")
  private EntityNameTripletCq entityNameTripletCq = null;

  @JsonProperty("legalTermIdTripletCq")
  private LegalTermIdTripletCq legalTermIdTripletCq = null;

  @JsonProperty("contributionOverflowCoverName")
  private StringTripletCq contributionOverflowCoverName = null;

  @JsonProperty("poolPremiumRights")
  private BooleanTripletCq poolPremiumRights = null;

  @JsonProperty("parameterSetId")
  private StringTripletCq parameterSetId = null;

  @JsonProperty("bonusSpec")
  private BonusSpecTripletCq bonusSpec = null;

  @JsonProperty("allowedSubTaxCodeTripletCq")
  private AllowedSubTaxCodeTripletCq allowedSubTaxCodeTripletCq = null;

  @JsonProperty("allowedClaimModulesTripletCq")
  private AllowedClaimModulesTripletCq allowedClaimModulesTripletCq = null;


  public AgreementCoverVariantIdCq getVariantId() {
    return variantId;
  }

  public void setVariantId(AgreementCoverVariantIdCq variantId) {
    this.variantId = variantId;
  }

  public TimeSpecFrameTripletCq getPremiumTimeFrame() {
    return premiumTimeFrame;
  }

  public void setPremiumTimeFrame(TimeSpecFrameTripletCq premiumTimeFrame) {
    this.premiumTimeFrame = premiumTimeFrame;
  }

  public TimeSpecFrameTripletCq getBenefitTimeFrame() {
    return benefitTimeFrame;
  }

  public void setBenefitTimeFrame(TimeSpecFrameTripletCq benefitTimeFrame) {
    this.benefitTimeFrame = benefitTimeFrame;
  }

  public TimeSpecFrameTripletCq getRiskTimeFrame() {
    return riskTimeFrame;
  }

  public void setRiskTimeFrame(TimeSpecFrameTripletCq riskTimeFrame) {
    this.riskTimeFrame = riskTimeFrame;
  }

  public AllowedTaxCodeTripletCq getAllowedTaxCodeTripletCq() {
    return allowedTaxCodeTripletCq;
  }

  public void setAllowedTaxCodeTripletCq(AllowedTaxCodeTripletCq allowedTaxCodeTripletCq) {
    this.allowedTaxCodeTripletCq = allowedTaxCodeTripletCq;
  }

  public AllowedPortfolioRuleFrameIdTripletCq getPortfolioRuleFrame() {
    return portfolioRuleFrame;
  }

  public void setPortfolioRuleFrame(AllowedPortfolioRuleFrameIdTripletCq portfolioRuleFrame) {
    this.portfolioRuleFrame = portfolioRuleFrame;
  }

  public LongTripletCq getPriority() {
    return priority;
  }

  public void setPriority(LongTripletCq priority) {
    this.priority = priority;
  }

  public AllowedRegulationCodeTripletCq getAllowedRegulationCodeTripletCq() {
    return allowedRegulationCodeTripletCq;
  }

  public void setAllowedRegulationCodeTripletCq(AllowedRegulationCodeTripletCq allowedRegulationCodeTripletCq) {
    this.allowedRegulationCodeTripletCq = allowedRegulationCodeTripletCq;
  }

  public TimeFrameTripletCq getCreateAge() {
    return createAge;
  }

  public void setCreateAge(TimeFrameTripletCq createAge) {
    this.createAge = createAge;
  }

  public ContributionOrBenefitFrameTripletCq getContributionOrBenefitFrameTripletCq() {
    return contributionOrBenefitFrameTripletCq;
  }

  public void setContributionOrBenefitFrameTripletCq(ContributionOrBenefitFrameTripletCq contributionOrBenefitFrameTripletCq) {
    this.contributionOrBenefitFrameTripletCq = contributionOrBenefitFrameTripletCq;
  }

  public AmountFrameTripletCq getAmountFrameTripletCq() {
    return amountFrameTripletCq;
  }

  public void setAmountFrameTripletCq(AmountFrameTripletCq amountFrameTripletCq) {
    this.amountFrameTripletCq = amountFrameTripletCq;
  }

  public DimensionExpressionTripletCq getDimensionExpressionTripletCq() {
    return dimensionExpressionTripletCq;
  }

  public void setDimensionExpressionTripletCq(DimensionExpressionTripletCq dimensionExpressionTripletCq) {
    this.dimensionExpressionTripletCq = dimensionExpressionTripletCq;
  }

  public BooleanTripletCq getDefaultVariant() {
    return defaultVariant;
  }

  public void setDefaultVariant(BooleanTripletCq defaultVariant) {
    this.defaultVariant = defaultVariant;
  }

  public BenefitTypeTripletCq getBenefitTypeTripletCq() {
    return benefitTypeTripletCq;
  }

  public void setBenefitTypeTripletCq(BenefitTypeTripletCq benefitTypeTripletCq) {
    this.benefitTypeTripletCq = benefitTypeTripletCq;
  }

  public AllowedBenefitTriggerEventTripletCq getBenefitTriggerEvent() {
    return benefitTriggerEvent;
  }

  public void setBenefitTriggerEvent(AllowedBenefitTriggerEventTripletCq benefitTriggerEvent) {
    this.benefitTriggerEvent = benefitTriggerEvent;
  }

  public AllowedInsuranceTypeTripletCq getAllowedInsuranceTypeTripletCq() {
    return allowedInsuranceTypeTripletCq;
  }

  public void setAllowedInsuranceTypeTripletCq(AllowedInsuranceTypeTripletCq allowedInsuranceTypeTripletCq) {
    this.allowedInsuranceTypeTripletCq = allowedInsuranceTypeTripletCq;
  }
  public AgreementVariantCq addAgreementPaymentRestrictionCollectionItem(AgreementPaymentRestriction agreementPaymentRestrictionCollectionItem) {
    this.agreementPaymentRestrictionCollection.add(agreementPaymentRestrictionCollectionItem);
    return this;
  }

  public List<AgreementPaymentRestriction> getAgreementPaymentRestrictionCollection() {
    return agreementPaymentRestrictionCollection;
  }

  public void setAgreementPaymentRestrictionCollection(List<AgreementPaymentRestriction> agreementPaymentRestrictionCollection) {
    this.agreementPaymentRestrictionCollection = agreementPaymentRestrictionCollection;
  }

  public AllowedCalculationFoundationDimensionTripletCq getAllowedCalculationFoundationDimensionTripletCq() {
    return allowedCalculationFoundationDimensionTripletCq;
  }

  public void setAllowedCalculationFoundationDimensionTripletCq(AllowedCalculationFoundationDimensionTripletCq allowedCalculationFoundationDimensionTripletCq) {
    this.allowedCalculationFoundationDimensionTripletCq = allowedCalculationFoundationDimensionTripletCq;
  }

  public CustomerSelectablityRuleTripletCq getCustomerSelectablityRuleTripletCq() {
    return customerSelectablityRuleTripletCq;
  }

  public void setCustomerSelectablityRuleTripletCq(CustomerSelectablityRuleTripletCq customerSelectablityRuleTripletCq) {
    this.customerSelectablityRuleTripletCq = customerSelectablityRuleTripletCq;
  }

  public AllowedAssetTypeTripletCq getAllowedAssetTypeTripletCq() {
    return allowedAssetTypeTripletCq;
  }

  public void setAllowedAssetTypeTripletCq(AllowedAssetTypeTripletCq allowedAssetTypeTripletCq) {
    this.allowedAssetTypeTripletCq = allowedAssetTypeTripletCq;
  }

  public LifeCoverTypeTripletCq getLifeCoverTypeTripletCq() {
    return lifeCoverTypeTripletCq;
  }

  public void setLifeCoverTypeTripletCq(LifeCoverTypeTripletCq lifeCoverTypeTripletCq) {
    this.lifeCoverTypeTripletCq = lifeCoverTypeTripletCq;
  }

  public PriceGroupIdTripletCq getPriceGroupIdTripletCq() {
    return priceGroupIdTripletCq;
  }

  public void setPriceGroupIdTripletCq(PriceGroupIdTripletCq priceGroupIdTripletCq) {
    this.priceGroupIdTripletCq = priceGroupIdTripletCq;
  }

  public BooleanTripletCq getSolidaryPrice() {
    return solidaryPrice;
  }

  public void setSolidaryPrice(BooleanTripletCq solidaryPrice) {
    this.solidaryPrice = solidaryPrice;
  }

  public RiskBonusGroupIdTripletCq getRiskBonusGroupIdTripletCq() {
    return riskBonusGroupIdTripletCq;
  }

  public void setRiskBonusGroupIdTripletCq(RiskBonusGroupIdTripletCq riskBonusGroupIdTripletCq) {
    this.riskBonusGroupIdTripletCq = riskBonusGroupIdTripletCq;
  }

  public AllowedCoverOption1TripletCq getAllowedCoverOption1TripletCq() {
    return allowedCoverOption1TripletCq;
  }

  public void setAllowedCoverOption1TripletCq(AllowedCoverOption1TripletCq allowedCoverOption1TripletCq) {
    this.allowedCoverOption1TripletCq = allowedCoverOption1TripletCq;
  }

  public AllowedCoverOption2TripletCq getAllowedCoverOption2TripletCq() {
    return allowedCoverOption2TripletCq;
  }

  public void setAllowedCoverOption2TripletCq(AllowedCoverOption2TripletCq allowedCoverOption2TripletCq) {
    this.allowedCoverOption2TripletCq = allowedCoverOption2TripletCq;
  }

  public EntityNameTripletCq getEntityNameTripletCq() {
    return entityNameTripletCq;
  }

  public void setEntityNameTripletCq(EntityNameTripletCq entityNameTripletCq) {
    this.entityNameTripletCq = entityNameTripletCq;
  }

  public LegalTermIdTripletCq getLegalTermIdTripletCq() {
    return legalTermIdTripletCq;
  }

  public void setLegalTermIdTripletCq(LegalTermIdTripletCq legalTermIdTripletCq) {
    this.legalTermIdTripletCq = legalTermIdTripletCq;
  }

  public StringTripletCq getContributionOverflowCoverName() {
    return contributionOverflowCoverName;
  }

  public void setContributionOverflowCoverName(StringTripletCq contributionOverflowCoverName) {
    this.contributionOverflowCoverName = contributionOverflowCoverName;
  }

  public BooleanTripletCq getPoolPremiumRights() {
    return poolPremiumRights;
  }

  public void setPoolPremiumRights(BooleanTripletCq poolPremiumRights) {
    this.poolPremiumRights = poolPremiumRights;
  }

  public StringTripletCq getParameterSetId() {
    return parameterSetId;
  }

  public void setParameterSetId(StringTripletCq parameterSetId) {
    this.parameterSetId = parameterSetId;
  }

  public BonusSpecTripletCq getBonusSpec() {
    return bonusSpec;
  }

  public void setBonusSpec(BonusSpecTripletCq bonusSpec) {
    this.bonusSpec = bonusSpec;
  }

  public AllowedSubTaxCodeTripletCq getAllowedSubTaxCodeTripletCq() {
    return allowedSubTaxCodeTripletCq;
  }

  public void setAllowedSubTaxCodeTripletCq(AllowedSubTaxCodeTripletCq allowedSubTaxCodeTripletCq) {
    this.allowedSubTaxCodeTripletCq = allowedSubTaxCodeTripletCq;
  }

  public AllowedClaimModulesTripletCq getAllowedClaimModulesTripletCq() {
    return allowedClaimModulesTripletCq;
  }

  public void setAllowedClaimModulesTripletCq(AllowedClaimModulesTripletCq allowedClaimModulesTripletCq) {
    this.allowedClaimModulesTripletCq = allowedClaimModulesTripletCq;
  }
}

