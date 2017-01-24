package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementTypeConfigurationCq implements Serializable {
	@JsonProperty("configurationFor")
	private String configurationFor = null;
	
	@JsonProperty("allowedSubTypesCollection")
	private List<String> allowedSubTypesCollection = new ArrayList<String>();
	
	@JsonProperty("allowedRolesCollection")
	private List<String> allowedRolesCollection = new ArrayList<String>();
	
	@JsonProperty("allowedChangeTypesCollection")
	private List<String> allowedChangeTypesCollection = new ArrayList<String>();
	
	@JsonProperty("allowedPricePrivilegeTypesCollection")
	private List<String> allowedPricePrivilegeTypesCollection = new ArrayList<String>();
	
	@JsonProperty("privilegeTypeCqCollection")
	private List<String> privilegeTypeCqCollection = new ArrayList<String>();
	
	@JsonProperty("agreementEditPerspectiveCqCollection")
	private List<AgreementEditPerspectiveCq> agreementEditPerspectiveCqCollection = new ArrayList<AgreementEditPerspectiveCq>();
	
	@JsonProperty("allowedGlobalAmountParametersCollection")
	private List<ParameterSeriesIdCq> allowedGlobalAmountParametersCollection = new ArrayList<ParameterSeriesIdCq>();
	
	@JsonProperty("allowedScopePartCollection")
	private List<ScopePartCq> allowedScopePartCollection = new ArrayList<ScopePartCq>();
	
	@JsonProperty("allowedGlobalPctParametersCollection")
	private List<ParameterSeriesIdCq> allowedGlobalPctParametersCollection = new ArrayList<ParameterSeriesIdCq>();
	
	@JsonProperty("allowedGeneralCostCollection")
	private List<String> allowedGeneralCostCollection = new ArrayList<String>();
	
	@JsonProperty("allowedScopedCostCollection")
	private List<String> allowedScopedCostCollection = new ArrayList<String>();
	
	@JsonProperty("isSameCompanyAsParentRequired")
	private Boolean isSameCompanyAsParentRequired = false;
	
	@JsonProperty("isInUse")
	private Boolean isInUse = false;
	
	@JsonProperty("isCreationOutsideProductWorkbench")
	private Boolean isCreationOutsideProductWorkbench = false;
	
	@JsonProperty("isPoliciesAllowed")
	private Boolean isPoliciesAllowed = false;
	
	@JsonProperty("isCompanyRequired")
	private Boolean isCompanyRequired = false;
	
	@JsonProperty("isTerminationAllowed")
	private Boolean isTerminationAllowed = false;
	
	@JsonProperty("isCopyAllowed")
	private Boolean isCopyAllowed = false;
	
	
	public String getConfigurationFor() {
		return configurationFor;
	}
	
	public void setConfigurationFor(String configurationFor) {
		this.configurationFor = configurationFor;
	}
	
	public AgreementTypeConfigurationCq addAllowedSubTypesCollectionItem(String allowedSubTypesCollectionItem) {
		this.allowedSubTypesCollection.add(allowedSubTypesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedSubTypesCollection() {
		return allowedSubTypesCollection;
	}
	
	public void setAllowedSubTypesCollection(List<String> allowedSubTypesCollection) {
		this.allowedSubTypesCollection = allowedSubTypesCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedRolesCollectionItem(String allowedRolesCollectionItem) {
		this.allowedRolesCollection.add(allowedRolesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedRolesCollection() {
		return allowedRolesCollection;
	}
	
	public void setAllowedRolesCollection(List<String> allowedRolesCollection) {
		this.allowedRolesCollection = allowedRolesCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedChangeTypesCollectionItem(String allowedChangeTypesCollectionItem) {
		this.allowedChangeTypesCollection.add(allowedChangeTypesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedChangeTypesCollection() {
		return allowedChangeTypesCollection;
	}
	
	public void setAllowedChangeTypesCollection(List<String> allowedChangeTypesCollection) {
		this.allowedChangeTypesCollection = allowedChangeTypesCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedPricePrivilegeTypesCollectionItem(String allowedPricePrivilegeTypesCollectionItem) {
		this.allowedPricePrivilegeTypesCollection.add(allowedPricePrivilegeTypesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedPricePrivilegeTypesCollection() {
		return allowedPricePrivilegeTypesCollection;
	}
	
	public void setAllowedPricePrivilegeTypesCollection(List<String> allowedPricePrivilegeTypesCollection) {
		this.allowedPricePrivilegeTypesCollection = allowedPricePrivilegeTypesCollection;
	}
	
	public AgreementTypeConfigurationCq addPrivilegeTypeCqCollectionItem(String privilegeTypeCqCollectionItem) {
		this.privilegeTypeCqCollection.add(privilegeTypeCqCollectionItem);
		return this;
	}
	
	public List<String> getPrivilegeTypeCqCollection() {
		return privilegeTypeCqCollection;
	}
	
	public void setPrivilegeTypeCqCollection(List<String> privilegeTypeCqCollection) {
		this.privilegeTypeCqCollection = privilegeTypeCqCollection;
	}
	
	public AgreementTypeConfigurationCq addAgreementEditPerspectiveCqCollectionItem(AgreementEditPerspectiveCq agreementEditPerspectiveCqCollectionItem) {
		this.agreementEditPerspectiveCqCollection.add(agreementEditPerspectiveCqCollectionItem);
		return this;
	}
	
	public List<AgreementEditPerspectiveCq> getAgreementEditPerspectiveCqCollection() {
		return agreementEditPerspectiveCqCollection;
	}
	
	public void setAgreementEditPerspectiveCqCollection(List<AgreementEditPerspectiveCq> agreementEditPerspectiveCqCollection) {
		this.agreementEditPerspectiveCqCollection = agreementEditPerspectiveCqCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedGlobalAmountParametersCollectionItem(ParameterSeriesIdCq allowedGlobalAmountParametersCollectionItem) {
		this.allowedGlobalAmountParametersCollection.add(allowedGlobalAmountParametersCollectionItem);
		return this;
	}
	
	public List<ParameterSeriesIdCq> getAllowedGlobalAmountParametersCollection() {
		return allowedGlobalAmountParametersCollection;
	}
	
	public void setAllowedGlobalAmountParametersCollection(List<ParameterSeriesIdCq> allowedGlobalAmountParametersCollection) {
		this.allowedGlobalAmountParametersCollection = allowedGlobalAmountParametersCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedScopePartCollectionItem(ScopePartCq allowedScopePartCollectionItem) {
		this.allowedScopePartCollection.add(allowedScopePartCollectionItem);
		return this;
	}
	
	public List<ScopePartCq> getAllowedScopePartCollection() {
		return allowedScopePartCollection;
	}
	
	public void setAllowedScopePartCollection(List<ScopePartCq> allowedScopePartCollection) {
		this.allowedScopePartCollection = allowedScopePartCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedGlobalPctParametersCollectionItem(ParameterSeriesIdCq allowedGlobalPctParametersCollectionItem) {
		this.allowedGlobalPctParametersCollection.add(allowedGlobalPctParametersCollectionItem);
		return this;
	}
	
	public List<ParameterSeriesIdCq> getAllowedGlobalPctParametersCollection() {
		return allowedGlobalPctParametersCollection;
	}
	
	public void setAllowedGlobalPctParametersCollection(List<ParameterSeriesIdCq> allowedGlobalPctParametersCollection) {
		this.allowedGlobalPctParametersCollection = allowedGlobalPctParametersCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedGeneralCostCollectionItem(String allowedGeneralCostCollectionItem) {
		this.allowedGeneralCostCollection.add(allowedGeneralCostCollectionItem);
		return this;
	}
	
	public List<String> getAllowedGeneralCostCollection() {
		return allowedGeneralCostCollection;
	}
	
	public void setAllowedGeneralCostCollection(List<String> allowedGeneralCostCollection) {
		this.allowedGeneralCostCollection = allowedGeneralCostCollection;
	}
	
	public AgreementTypeConfigurationCq addAllowedScopedCostCollectionItem(String allowedScopedCostCollectionItem) {
		this.allowedScopedCostCollection.add(allowedScopedCostCollectionItem);
		return this;
	}
	
	public List<String> getAllowedScopedCostCollection() {
		return allowedScopedCostCollection;
	}
	
	public void setAllowedScopedCostCollection(List<String> allowedScopedCostCollection) {
		this.allowedScopedCostCollection = allowedScopedCostCollection;
	}
	
	public Boolean getIsSameCompanyAsParentRequired() {
		return isSameCompanyAsParentRequired;
	}
	
	public void setIsSameCompanyAsParentRequired(Boolean isSameCompanyAsParentRequired) {
		this.isSameCompanyAsParentRequired = isSameCompanyAsParentRequired;
	}
	
	public Boolean getIsInUse() {
		return isInUse;
	}
	
	public void setIsInUse(Boolean isInUse) {
		this.isInUse = isInUse;
	}
	
	public Boolean getIsCreationOutsideProductWorkbench() {
		return isCreationOutsideProductWorkbench;
	}
	
	public void setIsCreationOutsideProductWorkbench(Boolean isCreationOutsideProductWorkbench) {
		this.isCreationOutsideProductWorkbench = isCreationOutsideProductWorkbench;
	}
	
	public Boolean getIsPoliciesAllowed() {
		return isPoliciesAllowed;
	}
	
	public void setIsPoliciesAllowed(Boolean isPoliciesAllowed) {
		this.isPoliciesAllowed = isPoliciesAllowed;
	}
	
	public Boolean getIsCompanyRequired() {
		return isCompanyRequired;
	}
	
	public void setIsCompanyRequired(Boolean isCompanyRequired) {
		this.isCompanyRequired = isCompanyRequired;
	}
	
	public Boolean getIsTerminationAllowed() {
		return isTerminationAllowed;
	}
	
	public void setIsTerminationAllowed(Boolean isTerminationAllowed) {
		this.isTerminationAllowed = isTerminationAllowed;
	}
	
	public Boolean getIsCopyAllowed() {
		return isCopyAllowed;
	}
	
	public void setIsCopyAllowed(Boolean isCopyAllowed) {
		this.isCopyAllowed = isCopyAllowed;
	}
}

