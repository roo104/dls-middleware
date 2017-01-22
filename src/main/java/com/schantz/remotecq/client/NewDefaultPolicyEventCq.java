package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NewDefaultPolicyEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("premium")
  private Double premium = null;

  @JsonProperty("agreementSearchTypeCq")
  private String agreementSearchTypeCq = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("isCoverDriven")
  private Boolean isCoverDriven = false;

  @JsonProperty("isNoPremium")
  private Boolean isNoPremium = false;


  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public String getLifeEventIdCq() {
    return lifeEventIdCq;
  }

  public void setLifeEventIdCq(String lifeEventIdCq) {
    this.lifeEventIdCq = lifeEventIdCq;
  }

  public EventInclusionIdCq getInclusionId() {
    return inclusionId;
  }

  public void setInclusionId(EventInclusionIdCq inclusionId) {
    this.inclusionId = inclusionId;
  }
  public NewDefaultPolicyEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getPremium() {
    return premium;
  }

  public void setPremium(Double premium) {
    this.premium = premium;
  }

  public String getAgreementSearchTypeCq() {
    return agreementSearchTypeCq;
  }

  public void setAgreementSearchTypeCq(String agreementSearchTypeCq) {
    this.agreementSearchTypeCq = agreementSearchTypeCq;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }

  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public Boolean getIsCoverDriven() {
    return isCoverDriven;
  }

  public void setIsCoverDriven(Boolean isCoverDriven) {
    this.isCoverDriven = isCoverDriven;
  }

  public Boolean getIsNoPremium() {
    return isNoPremium;
  }

  public void setIsNoPremium(Boolean isNoPremium) {
    this.isNoPremium = isNoPremium;
  }
}

