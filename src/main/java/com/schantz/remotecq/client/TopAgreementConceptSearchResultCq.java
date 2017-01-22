package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementConceptSearchResultCq implements Serializable {
  @JsonProperty("chosenHealthGroup")
  private HealthGroupIdResultEntryCq chosenHealthGroup = null;

  @JsonProperty("suggestedHealthGroup")
  private HealthGroupIdResultEntryCq suggestedHealthGroup = null;

  @JsonProperty("chosenAgreement")
  private AgreementIdResultEntryCq chosenAgreement = null;

  @JsonProperty("topAgreementChoiceReasonCq")
  private String topAgreementChoiceReasonCq = null;

  @JsonProperty("agreementSearchResultCollection")
  private List<AgreementIdResultEntryCq> agreementSearchResultCollection = new ArrayList<AgreementIdResultEntryCq>();

  @JsonProperty("suggestedAgreement")
  private AgreementIdResultEntryCq suggestedAgreement = null;

  @JsonProperty("healthGroupSearchResultCollection")
  private List<HealthGroupIdResultEntryCq> healthGroupSearchResultCollection = new ArrayList<HealthGroupIdResultEntryCq>();


  public HealthGroupIdResultEntryCq getChosenHealthGroup() {
    return chosenHealthGroup;
  }

  public void setChosenHealthGroup(HealthGroupIdResultEntryCq chosenHealthGroup) {
    this.chosenHealthGroup = chosenHealthGroup;
  }

  public HealthGroupIdResultEntryCq getSuggestedHealthGroup() {
    return suggestedHealthGroup;
  }

  public void setSuggestedHealthGroup(HealthGroupIdResultEntryCq suggestedHealthGroup) {
    this.suggestedHealthGroup = suggestedHealthGroup;
  }

  public AgreementIdResultEntryCq getChosenAgreement() {
    return chosenAgreement;
  }

  public void setChosenAgreement(AgreementIdResultEntryCq chosenAgreement) {
    this.chosenAgreement = chosenAgreement;
  }

  public String getTopAgreementChoiceReasonCq() {
    return topAgreementChoiceReasonCq;
  }

  public void setTopAgreementChoiceReasonCq(String topAgreementChoiceReasonCq) {
    this.topAgreementChoiceReasonCq = topAgreementChoiceReasonCq;
  }
  public TopAgreementConceptSearchResultCq addAgreementSearchResultCollectionItem(AgreementIdResultEntryCq agreementSearchResultCollectionItem) {
    this.agreementSearchResultCollection.add(agreementSearchResultCollectionItem);
    return this;
  }

  public List<AgreementIdResultEntryCq> getAgreementSearchResultCollection() {
    return agreementSearchResultCollection;
  }

  public void setAgreementSearchResultCollection(List<AgreementIdResultEntryCq> agreementSearchResultCollection) {
    this.agreementSearchResultCollection = agreementSearchResultCollection;
  }

  public AgreementIdResultEntryCq getSuggestedAgreement() {
    return suggestedAgreement;
  }

  public void setSuggestedAgreement(AgreementIdResultEntryCq suggestedAgreement) {
    this.suggestedAgreement = suggestedAgreement;
  }
  public TopAgreementConceptSearchResultCq addHealthGroupSearchResultCollectionItem(HealthGroupIdResultEntryCq healthGroupSearchResultCollectionItem) {
    this.healthGroupSearchResultCollection.add(healthGroupSearchResultCollectionItem);
    return this;
  }

  public List<HealthGroupIdResultEntryCq> getHealthGroupSearchResultCollection() {
    return healthGroupSearchResultCollection;
  }

  public void setHealthGroupSearchResultCollection(List<HealthGroupIdResultEntryCq> healthGroupSearchResultCollection) {
    this.healthGroupSearchResultCollection = healthGroupSearchResultCollection;
  }
}

