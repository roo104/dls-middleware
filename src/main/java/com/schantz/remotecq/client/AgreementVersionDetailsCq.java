package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementVersionDetailsCq implements Serializable {
	@JsonProperty("valid")
	private Boolean valid = false;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	@JsonProperty("createAge")
	private TimeFrameTripletCq createAge = null;
	
	@JsonProperty("childCollection")
	private List<AgreementVersionIdCq> childCollection = new ArrayList<AgreementVersionIdCq>();
	
	@JsonProperty("pensionAge")
	private TimeFrameTripletCq pensionAge = null;
	
	@JsonProperty("childExpiry")
	private TimeFrameTripletCq childExpiry = null;
	
	@JsonProperty("agreementStateCq")
	private String agreementStateCq = null;
	
	@JsonProperty("agreementTypeCq")
	private String agreementTypeCq = null;
	
	@JsonProperty("contributionFrameTripletCqCollection")
	private List<ContributionFrameTripletCq> contributionFrameTripletCqCollection = new ArrayList<ContributionFrameTripletCq>();
	
	@JsonProperty("currentVersionHistoryCollection")
	private List<ExtendedVersionDetailsCq> currentVersionHistoryCollection = new ArrayList<ExtendedVersionDetailsCq>();
	
	@JsonProperty("parentCollection")
	private List<AgreementVersionIdCq> parentCollection = new ArrayList<AgreementVersionIdCq>();
	
	@JsonProperty("agreementPackageCqCollection")
	private List<AgreementPackageCq> agreementPackageCqCollection = new ArrayList<AgreementPackageCq>();
	
	@JsonProperty("currentVersion")
	private ExtendedVersionDetailsCq currentVersion = null;
	
	@JsonProperty("aggregateCurrentActiveVersion")
	private ExtendedVersionDetailsCq aggregateCurrentActiveVersion = null;
	
	@JsonProperty("agreementValidationMessageCqCollection")
	private List<AgreementValidationMessageCq> agreementValidationMessageCqCollection = new ArrayList<AgreementValidationMessageCq>();
	
	@JsonProperty("certainAnnuity")
	private TimeFrameTripletCq certainAnnuity = null;
	
	@JsonProperty("magicConstantTripletCqCollection")
	private List<MagicConstantTripletCq> magicConstantTripletCqCollection = new ArrayList<MagicConstantTripletCq>();
	
	@JsonProperty("costGroup")
	private AllowedCostGroupTripletCq costGroup = null;
	
	@JsonProperty("allowedPremiumFrequencyTripletCq")
	private AllowedPremiumFrequencyTripletCq allowedPremiumFrequencyTripletCq = null;
	
	@JsonProperty("defaultSalaryInArrears")
	private BooleanTripletCq defaultSalaryInArrears = null;
	
	@JsonProperty("allowedHealthGroupsTripletCq")
	private AllowedHealthGroupsTripletCq allowedHealthGroupsTripletCq = null;
	
	@JsonProperty("contributionToleranceFrameTripletCq")
	private ContributionToleranceFrameTripletCq contributionToleranceFrameTripletCq = null;
	
	@JsonProperty("premiumHolidayFrameTripletCqCollection")
	private List<PremiumHolidayFrameTripletCq> premiumHolidayFrameTripletCqCollection = new ArrayList<PremiumHolidayFrameTripletCq>();
	
	@JsonProperty("policiesOnAgreementSelectionFrameTripletCq")
	private PoliciesOnAgreementSelectionFrameTripletCq policiesOnAgreementSelectionFrameTripletCq = null;
	
	@JsonProperty("priceGroupIdTripletCq")
	private PriceGroupIdTripletCq priceGroupIdTripletCq = null;
	
	@JsonProperty("pricePrivilegeTripletCqCollection")
	private List<PricePrivilegeTripletCq> pricePrivilegeTripletCqCollection = new ArrayList<PricePrivilegeTripletCq>();
	
	@JsonProperty("terminationDateTriplet")
	private DateTripletCq terminationDateTriplet = null;
	
	@JsonProperty("agreementRuleTripletCqCollection")
	private List<AgreementRuleTripletCq> agreementRuleTripletCqCollection = new ArrayList<AgreementRuleTripletCq>();
	
	@JsonProperty("primaryBillingMonthTriplet")
	private LongTripletCq primaryBillingMonthTriplet = null;
	
	@JsonProperty("riskBonusGroupIdTripletCq")
	private RiskBonusGroupIdTripletCq riskBonusGroupIdTripletCq = null;
	
	@JsonProperty("laborUnionHealthGroupIdCq")
	private HealthGroupIdCq laborUnionHealthGroupIdCq = null;
	
	@JsonProperty("paidUpFrameTripletCq")
	private PaidUpFrameTripletCq paidUpFrameTripletCq = null;
	
	@JsonProperty("agreementCostCollection")
	private List<AgreementCostTripletCq> agreementCostCollection = new ArrayList<AgreementCostTripletCq>();
	
	@JsonProperty("costType")
	private AllowedAgreementCostTypeTripletCq costType = null;
	
	@JsonProperty("allowedCommissionRoleTypeTripletCq")
	private AllowedCommissionRoleTypeTripletCq allowedCommissionRoleTypeTripletCq = null;
	
	@JsonProperty("parameterSetId")
	private StringTripletCq parameterSetId = null;
	
	@JsonProperty("bonusSpec")
	private BonusSpecTripletCq bonusSpec = null;
	
	@JsonProperty("triggeredBonusSpec")
	private BonusSpecTripletCq triggeredBonusSpec = null;
	
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
	
	@JsonProperty("legalTermIdTripletCq")
	private LegalTermIdTripletCq legalTermIdTripletCq = null;
	
	@JsonProperty("externalCostCollection")
	private List<AgreementCostTripletCq> externalCostCollection = new ArrayList<AgreementCostTripletCq>();
	
	@JsonProperty("globalCostId")
	private StringTripletCq globalCostId = null;
	
	@JsonProperty("defaultDimensionValuesTripletCq")
	private DefaultDimensionValuesTripletCq defaultDimensionValuesTripletCq = null;
	
	@JsonProperty("advancePolicyTriggersTripletCq")
	private AdvancePolicyTriggersTripletCq advancePolicyTriggersTripletCq = null;
	
	@JsonProperty("removedPackagesCollection")
	private List<AgreementPackageIdCq> removedPackagesCollection = new ArrayList<AgreementPackageIdCq>();
	
	@JsonProperty("externalReceiverTripletCq")
	private ExternalReceiverTripletCq externalReceiverTripletCq = null;
	
	@JsonProperty("allowedInsuranceTypeTripletCq")
	private AllowedInsuranceTypeTripletCq allowedInsuranceTypeTripletCq = null;
	
	@JsonProperty("externalCostType")
	private AllowedAgreementCostTypeTripletCq externalCostType = null;
	
	@JsonProperty("healthTableDiscountGroupSelectionCq")
	private HealthTableDiscountGroupSelectionCq healthTableDiscountGroupSelectionCq = null;
	
	
	public Boolean getValid() {
		return valid;
	}
	
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
	
	public TimeFrameTripletCq getCreateAge() {
		return createAge;
	}
	
	public void setCreateAge(TimeFrameTripletCq createAge) {
		this.createAge = createAge;
	}
	
	public AgreementVersionDetailsCq addChildCollectionItem(AgreementVersionIdCq childCollectionItem) {
		this.childCollection.add(childCollectionItem);
		return this;
	}
	
	public List<AgreementVersionIdCq> getChildCollection() {
		return childCollection;
	}
	
	public void setChildCollection(List<AgreementVersionIdCq> childCollection) {
		this.childCollection = childCollection;
	}
	
	public TimeFrameTripletCq getPensionAge() {
		return pensionAge;
	}
	
	public void setPensionAge(TimeFrameTripletCq pensionAge) {
		this.pensionAge = pensionAge;
	}
	
	public TimeFrameTripletCq getChildExpiry() {
		return childExpiry;
	}
	
	public void setChildExpiry(TimeFrameTripletCq childExpiry) {
		this.childExpiry = childExpiry;
	}
	
	public String getAgreementStateCq() {
		return agreementStateCq;
	}
	
	public void setAgreementStateCq(String agreementStateCq) {
		this.agreementStateCq = agreementStateCq;
	}
	
	public String getAgreementTypeCq() {
		return agreementTypeCq;
	}
	
	public void setAgreementTypeCq(String agreementTypeCq) {
		this.agreementTypeCq = agreementTypeCq;
	}
	
	public AgreementVersionDetailsCq addContributionFrameTripletCqCollectionItem(ContributionFrameTripletCq contributionFrameTripletCqCollectionItem) {
		this.contributionFrameTripletCqCollection.add(contributionFrameTripletCqCollectionItem);
		return this;
	}
	
	public List<ContributionFrameTripletCq> getContributionFrameTripletCqCollection() {
		return contributionFrameTripletCqCollection;
	}
	
	public void setContributionFrameTripletCqCollection(List<ContributionFrameTripletCq> contributionFrameTripletCqCollection) {
		this.contributionFrameTripletCqCollection = contributionFrameTripletCqCollection;
	}
	
	public AgreementVersionDetailsCq addCurrentVersionHistoryCollectionItem(ExtendedVersionDetailsCq currentVersionHistoryCollectionItem) {
		this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
		return this;
	}
	
	public List<ExtendedVersionDetailsCq> getCurrentVersionHistoryCollection() {
		return currentVersionHistoryCollection;
	}
	
	public void setCurrentVersionHistoryCollection(List<ExtendedVersionDetailsCq> currentVersionHistoryCollection) {
		this.currentVersionHistoryCollection = currentVersionHistoryCollection;
	}
	
	public AgreementVersionDetailsCq addParentCollectionItem(AgreementVersionIdCq parentCollectionItem) {
		this.parentCollection.add(parentCollectionItem);
		return this;
	}
	
	public List<AgreementVersionIdCq> getParentCollection() {
		return parentCollection;
	}
	
	public void setParentCollection(List<AgreementVersionIdCq> parentCollection) {
		this.parentCollection = parentCollection;
	}
	
	public AgreementVersionDetailsCq addAgreementPackageCqCollectionItem(AgreementPackageCq agreementPackageCqCollectionItem) {
		this.agreementPackageCqCollection.add(agreementPackageCqCollectionItem);
		return this;
	}
	
	public List<AgreementPackageCq> getAgreementPackageCqCollection() {
		return agreementPackageCqCollection;
	}
	
	public void setAgreementPackageCqCollection(List<AgreementPackageCq> agreementPackageCqCollection) {
		this.agreementPackageCqCollection = agreementPackageCqCollection;
	}
	
	public ExtendedVersionDetailsCq getCurrentVersion() {
		return currentVersion;
	}
	
	public void setCurrentVersion(ExtendedVersionDetailsCq currentVersion) {
		this.currentVersion = currentVersion;
	}
	
	public ExtendedVersionDetailsCq getAggregateCurrentActiveVersion() {
		return aggregateCurrentActiveVersion;
	}
	
	public void setAggregateCurrentActiveVersion(ExtendedVersionDetailsCq aggregateCurrentActiveVersion) {
		this.aggregateCurrentActiveVersion = aggregateCurrentActiveVersion;
	}
	
	public AgreementVersionDetailsCq addAgreementValidationMessageCqCollectionItem(AgreementValidationMessageCq agreementValidationMessageCqCollectionItem) {
		this.agreementValidationMessageCqCollection.add(agreementValidationMessageCqCollectionItem);
		return this;
	}
	
	public List<AgreementValidationMessageCq> getAgreementValidationMessageCqCollection() {
		return agreementValidationMessageCqCollection;
	}
	
	public void setAgreementValidationMessageCqCollection(List<AgreementValidationMessageCq> agreementValidationMessageCqCollection) {
		this.agreementValidationMessageCqCollection = agreementValidationMessageCqCollection;
	}
	
	public TimeFrameTripletCq getCertainAnnuity() {
		return certainAnnuity;
	}
	
	public void setCertainAnnuity(TimeFrameTripletCq certainAnnuity) {
		this.certainAnnuity = certainAnnuity;
	}
	
	public AgreementVersionDetailsCq addMagicConstantTripletCqCollectionItem(MagicConstantTripletCq magicConstantTripletCqCollectionItem) {
		this.magicConstantTripletCqCollection.add(magicConstantTripletCqCollectionItem);
		return this;
	}
	
	public List<MagicConstantTripletCq> getMagicConstantTripletCqCollection() {
		return magicConstantTripletCqCollection;
	}
	
	public void setMagicConstantTripletCqCollection(List<MagicConstantTripletCq> magicConstantTripletCqCollection) {
		this.magicConstantTripletCqCollection = magicConstantTripletCqCollection;
	}
	
	public AllowedCostGroupTripletCq getCostGroup() {
		return costGroup;
	}
	
	public void setCostGroup(AllowedCostGroupTripletCq costGroup) {
		this.costGroup = costGroup;
	}
	
	public AllowedPremiumFrequencyTripletCq getAllowedPremiumFrequencyTripletCq() {
		return allowedPremiumFrequencyTripletCq;
	}
	
	public void setAllowedPremiumFrequencyTripletCq(AllowedPremiumFrequencyTripletCq allowedPremiumFrequencyTripletCq) {
		this.allowedPremiumFrequencyTripletCq = allowedPremiumFrequencyTripletCq;
	}
	
	public BooleanTripletCq getDefaultSalaryInArrears() {
		return defaultSalaryInArrears;
	}
	
	public void setDefaultSalaryInArrears(BooleanTripletCq defaultSalaryInArrears) {
		this.defaultSalaryInArrears = defaultSalaryInArrears;
	}
	
	public AllowedHealthGroupsTripletCq getAllowedHealthGroupsTripletCq() {
		return allowedHealthGroupsTripletCq;
	}
	
	public void setAllowedHealthGroupsTripletCq(AllowedHealthGroupsTripletCq allowedHealthGroupsTripletCq) {
		this.allowedHealthGroupsTripletCq = allowedHealthGroupsTripletCq;
	}
	
	public ContributionToleranceFrameTripletCq getContributionToleranceFrameTripletCq() {
		return contributionToleranceFrameTripletCq;
	}
	
	public void setContributionToleranceFrameTripletCq(ContributionToleranceFrameTripletCq contributionToleranceFrameTripletCq) {
		this.contributionToleranceFrameTripletCq = contributionToleranceFrameTripletCq;
	}
	
	public AgreementVersionDetailsCq addPremiumHolidayFrameTripletCqCollectionItem(PremiumHolidayFrameTripletCq premiumHolidayFrameTripletCqCollectionItem) {
		this.premiumHolidayFrameTripletCqCollection.add(premiumHolidayFrameTripletCqCollectionItem);
		return this;
	}
	
	public List<PremiumHolidayFrameTripletCq> getPremiumHolidayFrameTripletCqCollection() {
		return premiumHolidayFrameTripletCqCollection;
	}
	
	public void setPremiumHolidayFrameTripletCqCollection(List<PremiumHolidayFrameTripletCq> premiumHolidayFrameTripletCqCollection) {
		this.premiumHolidayFrameTripletCqCollection = premiumHolidayFrameTripletCqCollection;
	}
	
	public PoliciesOnAgreementSelectionFrameTripletCq getPoliciesOnAgreementSelectionFrameTripletCq() {
		return policiesOnAgreementSelectionFrameTripletCq;
	}
	
	public void setPoliciesOnAgreementSelectionFrameTripletCq(PoliciesOnAgreementSelectionFrameTripletCq policiesOnAgreementSelectionFrameTripletCq) {
		this.policiesOnAgreementSelectionFrameTripletCq = policiesOnAgreementSelectionFrameTripletCq;
	}
	
	public PriceGroupIdTripletCq getPriceGroupIdTripletCq() {
		return priceGroupIdTripletCq;
	}
	
	public void setPriceGroupIdTripletCq(PriceGroupIdTripletCq priceGroupIdTripletCq) {
		this.priceGroupIdTripletCq = priceGroupIdTripletCq;
	}
	
	public AgreementVersionDetailsCq addPricePrivilegeTripletCqCollectionItem(PricePrivilegeTripletCq pricePrivilegeTripletCqCollectionItem) {
		this.pricePrivilegeTripletCqCollection.add(pricePrivilegeTripletCqCollectionItem);
		return this;
	}
	
	public List<PricePrivilegeTripletCq> getPricePrivilegeTripletCqCollection() {
		return pricePrivilegeTripletCqCollection;
	}
	
	public void setPricePrivilegeTripletCqCollection(List<PricePrivilegeTripletCq> pricePrivilegeTripletCqCollection) {
		this.pricePrivilegeTripletCqCollection = pricePrivilegeTripletCqCollection;
	}
	
	public DateTripletCq getTerminationDateTriplet() {
		return terminationDateTriplet;
	}
	
	public void setTerminationDateTriplet(DateTripletCq terminationDateTriplet) {
		this.terminationDateTriplet = terminationDateTriplet;
	}
	
	public AgreementVersionDetailsCq addAgreementRuleTripletCqCollectionItem(AgreementRuleTripletCq agreementRuleTripletCqCollectionItem) {
		this.agreementRuleTripletCqCollection.add(agreementRuleTripletCqCollectionItem);
		return this;
	}
	
	public List<AgreementRuleTripletCq> getAgreementRuleTripletCqCollection() {
		return agreementRuleTripletCqCollection;
	}
	
	public void setAgreementRuleTripletCqCollection(List<AgreementRuleTripletCq> agreementRuleTripletCqCollection) {
		this.agreementRuleTripletCqCollection = agreementRuleTripletCqCollection;
	}
	
	public LongTripletCq getPrimaryBillingMonthTriplet() {
		return primaryBillingMonthTriplet;
	}
	
	public void setPrimaryBillingMonthTriplet(LongTripletCq primaryBillingMonthTriplet) {
		this.primaryBillingMonthTriplet = primaryBillingMonthTriplet;
	}
	
	public RiskBonusGroupIdTripletCq getRiskBonusGroupIdTripletCq() {
		return riskBonusGroupIdTripletCq;
	}
	
	public void setRiskBonusGroupIdTripletCq(RiskBonusGroupIdTripletCq riskBonusGroupIdTripletCq) {
		this.riskBonusGroupIdTripletCq = riskBonusGroupIdTripletCq;
	}
	
	public HealthGroupIdCq getLaborUnionHealthGroupIdCq() {
		return laborUnionHealthGroupIdCq;
	}
	
	public void setLaborUnionHealthGroupIdCq(HealthGroupIdCq laborUnionHealthGroupIdCq) {
		this.laborUnionHealthGroupIdCq = laborUnionHealthGroupIdCq;
	}
	
	public PaidUpFrameTripletCq getPaidUpFrameTripletCq() {
		return paidUpFrameTripletCq;
	}
	
	public void setPaidUpFrameTripletCq(PaidUpFrameTripletCq paidUpFrameTripletCq) {
		this.paidUpFrameTripletCq = paidUpFrameTripletCq;
	}
	
	public AgreementVersionDetailsCq addAgreementCostCollectionItem(AgreementCostTripletCq agreementCostCollectionItem) {
		this.agreementCostCollection.add(agreementCostCollectionItem);
		return this;
	}
	
	public List<AgreementCostTripletCq> getAgreementCostCollection() {
		return agreementCostCollection;
	}
	
	public void setAgreementCostCollection(List<AgreementCostTripletCq> agreementCostCollection) {
		this.agreementCostCollection = agreementCostCollection;
	}
	
	public AllowedAgreementCostTypeTripletCq getCostType() {
		return costType;
	}
	
	public void setCostType(AllowedAgreementCostTypeTripletCq costType) {
		this.costType = costType;
	}
	
	public AllowedCommissionRoleTypeTripletCq getAllowedCommissionRoleTypeTripletCq() {
		return allowedCommissionRoleTypeTripletCq;
	}
	
	public void setAllowedCommissionRoleTypeTripletCq(AllowedCommissionRoleTypeTripletCq allowedCommissionRoleTypeTripletCq) {
		this.allowedCommissionRoleTypeTripletCq = allowedCommissionRoleTypeTripletCq;
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
	
	public BonusSpecTripletCq getTriggeredBonusSpec() {
		return triggeredBonusSpec;
	}
	
	public void setTriggeredBonusSpec(BonusSpecTripletCq triggeredBonusSpec) {
		this.triggeredBonusSpec = triggeredBonusSpec;
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
	
	public LegalTermIdTripletCq getLegalTermIdTripletCq() {
		return legalTermIdTripletCq;
	}
	
	public void setLegalTermIdTripletCq(LegalTermIdTripletCq legalTermIdTripletCq) {
		this.legalTermIdTripletCq = legalTermIdTripletCq;
	}
	
	public AgreementVersionDetailsCq addExternalCostCollectionItem(AgreementCostTripletCq externalCostCollectionItem) {
		this.externalCostCollection.add(externalCostCollectionItem);
		return this;
	}
	
	public List<AgreementCostTripletCq> getExternalCostCollection() {
		return externalCostCollection;
	}
	
	public void setExternalCostCollection(List<AgreementCostTripletCq> externalCostCollection) {
		this.externalCostCollection = externalCostCollection;
	}
	
	public StringTripletCq getGlobalCostId() {
		return globalCostId;
	}
	
	public void setGlobalCostId(StringTripletCq globalCostId) {
		this.globalCostId = globalCostId;
	}
	
	public DefaultDimensionValuesTripletCq getDefaultDimensionValuesTripletCq() {
		return defaultDimensionValuesTripletCq;
	}
	
	public void setDefaultDimensionValuesTripletCq(DefaultDimensionValuesTripletCq defaultDimensionValuesTripletCq) {
		this.defaultDimensionValuesTripletCq = defaultDimensionValuesTripletCq;
	}
	
	public AdvancePolicyTriggersTripletCq getAdvancePolicyTriggersTripletCq() {
		return advancePolicyTriggersTripletCq;
	}
	
	public void setAdvancePolicyTriggersTripletCq(AdvancePolicyTriggersTripletCq advancePolicyTriggersTripletCq) {
		this.advancePolicyTriggersTripletCq = advancePolicyTriggersTripletCq;
	}
	
	public AgreementVersionDetailsCq addRemovedPackagesCollectionItem(AgreementPackageIdCq removedPackagesCollectionItem) {
		this.removedPackagesCollection.add(removedPackagesCollectionItem);
		return this;
	}
	
	public List<AgreementPackageIdCq> getRemovedPackagesCollection() {
		return removedPackagesCollection;
	}
	
	public void setRemovedPackagesCollection(List<AgreementPackageIdCq> removedPackagesCollection) {
		this.removedPackagesCollection = removedPackagesCollection;
	}
	
	public ExternalReceiverTripletCq getExternalReceiverTripletCq() {
		return externalReceiverTripletCq;
	}
	
	public void setExternalReceiverTripletCq(ExternalReceiverTripletCq externalReceiverTripletCq) {
		this.externalReceiverTripletCq = externalReceiverTripletCq;
	}
	
	public AllowedInsuranceTypeTripletCq getAllowedInsuranceTypeTripletCq() {
		return allowedInsuranceTypeTripletCq;
	}
	
	public void setAllowedInsuranceTypeTripletCq(AllowedInsuranceTypeTripletCq allowedInsuranceTypeTripletCq) {
		this.allowedInsuranceTypeTripletCq = allowedInsuranceTypeTripletCq;
	}
	
	public AllowedAgreementCostTypeTripletCq getExternalCostType() {
		return externalCostType;
	}
	
	public void setExternalCostType(AllowedAgreementCostTypeTripletCq externalCostType) {
		this.externalCostType = externalCostType;
	}
	
	public HealthTableDiscountGroupSelectionCq getHealthTableDiscountGroupSelectionCq() {
		return healthTableDiscountGroupSelectionCq;
	}
	
	public void setHealthTableDiscountGroupSelectionCq(HealthTableDiscountGroupSelectionCq healthTableDiscountGroupSelectionCq) {
		this.healthTableDiscountGroupSelectionCq = healthTableDiscountGroupSelectionCq;
	}
}

