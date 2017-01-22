package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditContributorReceivableCq implements Serializable {
  @JsonProperty("personName")
  private String personName = null;

  @JsonProperty("companyRegistration")
  private String companyRegistration = null;

  @JsonProperty("personRegistration")
  private String personRegistration = null;

  @JsonProperty("monthlySalary")
  private Double monthlySalary = null;

  @JsonProperty("employmentPct")
  private Double employmentPct = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("deliveryNumber")
  private String deliveryNumber = null;

  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("editPolicyReceivableCqCollection")
  private List<EditPolicyReceivableCq> editPolicyReceivableCqCollection = new ArrayList<EditPolicyReceivableCq>();

  @JsonProperty("replaceContributorReceivableIdCq")
  private ContributorReceivableIdCq replaceContributorReceivableIdCq = null;

  @JsonProperty("receivableOnHoldStatusCq")
  private String receivableOnHoldStatusCq = null;


  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public String getCompanyRegistration() {
    return companyRegistration;
  }

  public void setCompanyRegistration(String companyRegistration) {
    this.companyRegistration = companyRegistration;
  }

  public String getPersonRegistration() {
    return personRegistration;
  }

  public void setPersonRegistration(String personRegistration) {
    this.personRegistration = personRegistration;
  }

  public Double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(Double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public Double getEmploymentPct() {
    return employmentPct;
  }

  public void setEmploymentPct(Double employmentPct) {
    this.employmentPct = employmentPct;
  }

  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public String getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(String deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }
  public EditContributorReceivableCq addEditPolicyReceivableCqCollectionItem(EditPolicyReceivableCq editPolicyReceivableCqCollectionItem) {
    this.editPolicyReceivableCqCollection.add(editPolicyReceivableCqCollectionItem);
    return this;
  }

  public List<EditPolicyReceivableCq> getEditPolicyReceivableCqCollection() {
    return editPolicyReceivableCqCollection;
  }

  public void setEditPolicyReceivableCqCollection(List<EditPolicyReceivableCq> editPolicyReceivableCqCollection) {
    this.editPolicyReceivableCqCollection = editPolicyReceivableCqCollection;
  }

  public ContributorReceivableIdCq getReplaceContributorReceivableIdCq() {
    return replaceContributorReceivableIdCq;
  }

  public void setReplaceContributorReceivableIdCq(ContributorReceivableIdCq replaceContributorReceivableIdCq) {
    this.replaceContributorReceivableIdCq = replaceContributorReceivableIdCq;
  }

  public String getReceivableOnHoldStatusCq() {
    return receivableOnHoldStatusCq;
  }

  public void setReceivableOnHoldStatusCq(String receivableOnHoldStatusCq) {
    this.receivableOnHoldStatusCq = receivableOnHoldStatusCq;
  }
}

