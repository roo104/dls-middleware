package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupConfigurationQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("lifeCoverTypeIdCqCollection")
  private List<LifeCoverTypeIdCq> lifeCoverTypeIdCqCollection = new ArrayList<LifeCoverTypeIdCq>();

  @JsonProperty("conditionContextTypeEnumCqCollection")
  private List<String> conditionContextTypeEnumCqCollection = new ArrayList<String>();

  @JsonProperty("ruleConditionTypeEnumCqCollection")
  private List<String> ruleConditionTypeEnumCqCollection = new ArrayList<String>();

  @JsonProperty("healthEvaluationRuleActionTypeCqCollection")
  private List<String> healthEvaluationRuleActionTypeCqCollection = new ArrayList<String>();

  @JsonProperty("amountFrameTypeCqCollection")
  private List<String> amountFrameTypeCqCollection = new ArrayList<String>();

  @JsonProperty("benefitTriggerEventCqCollection")
  private List<String> benefitTriggerEventCqCollection = new ArrayList<String>();

  @JsonProperty("healthGroupRuleConditionFilterTypeCqCollection")
  private List<String> healthGroupRuleConditionFilterTypeCqCollection = new ArrayList<String>();

  @JsonProperty("periodLengthCqCollection")
  private List<String> periodLengthCqCollection = new ArrayList<String>();

  @JsonProperty("healthEvaluationRuleCheckCqCollection")
  private List<String> healthEvaluationRuleCheckCqCollection = new ArrayList<String>();

  @JsonProperty("healthEvaluationRuleAmountTypeCqCollection")
  private List<String> healthEvaluationRuleAmountTypeCqCollection = new ArrayList<String>();

  @JsonProperty("healthGroupRuleConsequenceTypeEnumCqCollection")
  private List<String> healthGroupRuleConsequenceTypeEnumCqCollection = new ArrayList<String>();

  @JsonProperty("healthFormCqCollection")
  private List<HealthFormCq> healthFormCqCollection = new ArrayList<HealthFormCq>();

  public HealthGroupConfigurationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public HealthGroupConfigurationQueryResult addLifeCoverTypeIdCqCollectionItem(LifeCoverTypeIdCq lifeCoverTypeIdCqCollectionItem) {
    this.lifeCoverTypeIdCqCollection.add(lifeCoverTypeIdCqCollectionItem);
    return this;
  }

  public List<LifeCoverTypeIdCq> getLifeCoverTypeIdCqCollection() {
    return lifeCoverTypeIdCqCollection;
  }

  public void setLifeCoverTypeIdCqCollection(List<LifeCoverTypeIdCq> lifeCoverTypeIdCqCollection) {
    this.lifeCoverTypeIdCqCollection = lifeCoverTypeIdCqCollection;
  }
  public HealthGroupConfigurationQueryResult addConditionContextTypeEnumCqCollectionItem(String conditionContextTypeEnumCqCollectionItem) {
    this.conditionContextTypeEnumCqCollection.add(conditionContextTypeEnumCqCollectionItem);
    return this;
  }

  public List<String> getConditionContextTypeEnumCqCollection() {
    return conditionContextTypeEnumCqCollection;
  }

  public void setConditionContextTypeEnumCqCollection(List<String> conditionContextTypeEnumCqCollection) {
    this.conditionContextTypeEnumCqCollection = conditionContextTypeEnumCqCollection;
  }
  public HealthGroupConfigurationQueryResult addRuleConditionTypeEnumCqCollectionItem(String ruleConditionTypeEnumCqCollectionItem) {
    this.ruleConditionTypeEnumCqCollection.add(ruleConditionTypeEnumCqCollectionItem);
    return this;
  }

  public List<String> getRuleConditionTypeEnumCqCollection() {
    return ruleConditionTypeEnumCqCollection;
  }

  public void setRuleConditionTypeEnumCqCollection(List<String> ruleConditionTypeEnumCqCollection) {
    this.ruleConditionTypeEnumCqCollection = ruleConditionTypeEnumCqCollection;
  }
  public HealthGroupConfigurationQueryResult addHealthEvaluationRuleActionTypeCqCollectionItem(String healthEvaluationRuleActionTypeCqCollectionItem) {
    this.healthEvaluationRuleActionTypeCqCollection.add(healthEvaluationRuleActionTypeCqCollectionItem);
    return this;
  }

  public List<String> getHealthEvaluationRuleActionTypeCqCollection() {
    return healthEvaluationRuleActionTypeCqCollection;
  }

  public void setHealthEvaluationRuleActionTypeCqCollection(List<String> healthEvaluationRuleActionTypeCqCollection) {
    this.healthEvaluationRuleActionTypeCqCollection = healthEvaluationRuleActionTypeCqCollection;
  }
  public HealthGroupConfigurationQueryResult addAmountFrameTypeCqCollectionItem(String amountFrameTypeCqCollectionItem) {
    this.amountFrameTypeCqCollection.add(amountFrameTypeCqCollectionItem);
    return this;
  }

  public List<String> getAmountFrameTypeCqCollection() {
    return amountFrameTypeCqCollection;
  }

  public void setAmountFrameTypeCqCollection(List<String> amountFrameTypeCqCollection) {
    this.amountFrameTypeCqCollection = amountFrameTypeCqCollection;
  }
  public HealthGroupConfigurationQueryResult addBenefitTriggerEventCqCollectionItem(String benefitTriggerEventCqCollectionItem) {
    this.benefitTriggerEventCqCollection.add(benefitTriggerEventCqCollectionItem);
    return this;
  }

  public List<String> getBenefitTriggerEventCqCollection() {
    return benefitTriggerEventCqCollection;
  }

  public void setBenefitTriggerEventCqCollection(List<String> benefitTriggerEventCqCollection) {
    this.benefitTriggerEventCqCollection = benefitTriggerEventCqCollection;
  }
  public HealthGroupConfigurationQueryResult addHealthGroupRuleConditionFilterTypeCqCollectionItem(String healthGroupRuleConditionFilterTypeCqCollectionItem) {
    this.healthGroupRuleConditionFilterTypeCqCollection.add(healthGroupRuleConditionFilterTypeCqCollectionItem);
    return this;
  }

  public List<String> getHealthGroupRuleConditionFilterTypeCqCollection() {
    return healthGroupRuleConditionFilterTypeCqCollection;
  }

  public void setHealthGroupRuleConditionFilterTypeCqCollection(List<String> healthGroupRuleConditionFilterTypeCqCollection) {
    this.healthGroupRuleConditionFilterTypeCqCollection = healthGroupRuleConditionFilterTypeCqCollection;
  }
  public HealthGroupConfigurationQueryResult addPeriodLengthCqCollectionItem(String periodLengthCqCollectionItem) {
    this.periodLengthCqCollection.add(periodLengthCqCollectionItem);
    return this;
  }

  public List<String> getPeriodLengthCqCollection() {
    return periodLengthCqCollection;
  }

  public void setPeriodLengthCqCollection(List<String> periodLengthCqCollection) {
    this.periodLengthCqCollection = periodLengthCqCollection;
  }
  public HealthGroupConfigurationQueryResult addHealthEvaluationRuleCheckCqCollectionItem(String healthEvaluationRuleCheckCqCollectionItem) {
    this.healthEvaluationRuleCheckCqCollection.add(healthEvaluationRuleCheckCqCollectionItem);
    return this;
  }

  public List<String> getHealthEvaluationRuleCheckCqCollection() {
    return healthEvaluationRuleCheckCqCollection;
  }

  public void setHealthEvaluationRuleCheckCqCollection(List<String> healthEvaluationRuleCheckCqCollection) {
    this.healthEvaluationRuleCheckCqCollection = healthEvaluationRuleCheckCqCollection;
  }
  public HealthGroupConfigurationQueryResult addHealthEvaluationRuleAmountTypeCqCollectionItem(String healthEvaluationRuleAmountTypeCqCollectionItem) {
    this.healthEvaluationRuleAmountTypeCqCollection.add(healthEvaluationRuleAmountTypeCqCollectionItem);
    return this;
  }

  public List<String> getHealthEvaluationRuleAmountTypeCqCollection() {
    return healthEvaluationRuleAmountTypeCqCollection;
  }

  public void setHealthEvaluationRuleAmountTypeCqCollection(List<String> healthEvaluationRuleAmountTypeCqCollection) {
    this.healthEvaluationRuleAmountTypeCqCollection = healthEvaluationRuleAmountTypeCqCollection;
  }
  public HealthGroupConfigurationQueryResult addHealthGroupRuleConsequenceTypeEnumCqCollectionItem(String healthGroupRuleConsequenceTypeEnumCqCollectionItem) {
    this.healthGroupRuleConsequenceTypeEnumCqCollection.add(healthGroupRuleConsequenceTypeEnumCqCollectionItem);
    return this;
  }

  public List<String> getHealthGroupRuleConsequenceTypeEnumCqCollection() {
    return healthGroupRuleConsequenceTypeEnumCqCollection;
  }

  public void setHealthGroupRuleConsequenceTypeEnumCqCollection(List<String> healthGroupRuleConsequenceTypeEnumCqCollection) {
    this.healthGroupRuleConsequenceTypeEnumCqCollection = healthGroupRuleConsequenceTypeEnumCqCollection;
  }
  public HealthGroupConfigurationQueryResult addHealthFormCqCollectionItem(HealthFormCq healthFormCqCollectionItem) {
    this.healthFormCqCollection.add(healthFormCqCollectionItem);
    return this;
  }

  public List<HealthFormCq> getHealthFormCqCollection() {
    return healthFormCqCollection;
  }

  public void setHealthFormCqCollection(List<HealthFormCq> healthFormCqCollection) {
    this.healthFormCqCollection = healthFormCqCollection;
  }
}

