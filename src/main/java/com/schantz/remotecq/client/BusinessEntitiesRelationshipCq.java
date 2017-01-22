package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BusinessEntitiesRelationshipCq implements Serializable {
  @JsonProperty("companyIdCqCollection")
  private List<CompanyIdCq> companyIdCqCollection = new ArrayList<CompanyIdCq>();

  @JsonProperty("priceGroupIdCqCollection")
  private List<PriceGroupIdCq> priceGroupIdCqCollection = new ArrayList<PriceGroupIdCq>();

  @JsonProperty("claimIdCqCollection")
  private List<ClaimIdCq> claimIdCqCollection = new ArrayList<ClaimIdCq>();

  @JsonProperty("lifeCaseIdCqCollection")
  private List<LifeCaseIdCq> lifeCaseIdCqCollection = new ArrayList<LifeCaseIdCq>();

  @JsonProperty("agreementIdCqCollection")
  private List<AgreementIdCq> agreementIdCqCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("policyIdCqCollection")
  private List<PolicyIdCq> policyIdCqCollection = new ArrayList<PolicyIdCq>();

  @JsonProperty("personIdCqCollection")
  private List<PersonIdCq> personIdCqCollection = new ArrayList<PersonIdCq>();

  public BusinessEntitiesRelationshipCq addCompanyIdCqCollectionItem(CompanyIdCq companyIdCqCollectionItem) {
    this.companyIdCqCollection.add(companyIdCqCollectionItem);
    return this;
  }

  public List<CompanyIdCq> getCompanyIdCqCollection() {
    return companyIdCqCollection;
  }

  public void setCompanyIdCqCollection(List<CompanyIdCq> companyIdCqCollection) {
    this.companyIdCqCollection = companyIdCqCollection;
  }
  public BusinessEntitiesRelationshipCq addPriceGroupIdCqCollectionItem(PriceGroupIdCq priceGroupIdCqCollectionItem) {
    this.priceGroupIdCqCollection.add(priceGroupIdCqCollectionItem);
    return this;
  }

  public List<PriceGroupIdCq> getPriceGroupIdCqCollection() {
    return priceGroupIdCqCollection;
  }

  public void setPriceGroupIdCqCollection(List<PriceGroupIdCq> priceGroupIdCqCollection) {
    this.priceGroupIdCqCollection = priceGroupIdCqCollection;
  }
  public BusinessEntitiesRelationshipCq addClaimIdCqCollectionItem(ClaimIdCq claimIdCqCollectionItem) {
    this.claimIdCqCollection.add(claimIdCqCollectionItem);
    return this;
  }

  public List<ClaimIdCq> getClaimIdCqCollection() {
    return claimIdCqCollection;
  }

  public void setClaimIdCqCollection(List<ClaimIdCq> claimIdCqCollection) {
    this.claimIdCqCollection = claimIdCqCollection;
  }
  public BusinessEntitiesRelationshipCq addLifeCaseIdCqCollectionItem(LifeCaseIdCq lifeCaseIdCqCollectionItem) {
    this.lifeCaseIdCqCollection.add(lifeCaseIdCqCollectionItem);
    return this;
  }

  public List<LifeCaseIdCq> getLifeCaseIdCqCollection() {
    return lifeCaseIdCqCollection;
  }

  public void setLifeCaseIdCqCollection(List<LifeCaseIdCq> lifeCaseIdCqCollection) {
    this.lifeCaseIdCqCollection = lifeCaseIdCqCollection;
  }
  public BusinessEntitiesRelationshipCq addAgreementIdCqCollectionItem(AgreementIdCq agreementIdCqCollectionItem) {
    this.agreementIdCqCollection.add(agreementIdCqCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getAgreementIdCqCollection() {
    return agreementIdCqCollection;
  }

  public void setAgreementIdCqCollection(List<AgreementIdCq> agreementIdCqCollection) {
    this.agreementIdCqCollection = agreementIdCqCollection;
  }
  public BusinessEntitiesRelationshipCq addPolicyIdCqCollectionItem(PolicyIdCq policyIdCqCollectionItem) {
    this.policyIdCqCollection.add(policyIdCqCollectionItem);
    return this;
  }

  public List<PolicyIdCq> getPolicyIdCqCollection() {
    return policyIdCqCollection;
  }

  public void setPolicyIdCqCollection(List<PolicyIdCq> policyIdCqCollection) {
    this.policyIdCqCollection = policyIdCqCollection;
  }
  public BusinessEntitiesRelationshipCq addPersonIdCqCollectionItem(PersonIdCq personIdCqCollectionItem) {
    this.personIdCqCollection.add(personIdCqCollectionItem);
    return this;
  }

  public List<PersonIdCq> getPersonIdCqCollection() {
    return personIdCqCollection;
  }

  public void setPersonIdCqCollection(List<PersonIdCq> personIdCqCollection) {
    this.personIdCqCollection = personIdCqCollection;
  }
}

