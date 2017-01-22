package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateClaimGrantHealthCareCommand implements Serializable {
  @JsonProperty("periodStart")
  private LocalDate periodStart = null;

  @JsonProperty("periodEnd")
  private LocalDate periodEnd = null;

  @JsonProperty("maximumAmount")
  private Double maximumAmount = null;

  @JsonProperty("treatmentsAllowed")
  private Long treatmentsAllowed = null;

  @JsonProperty("occurrenceDate")
  private LocalDate occurrenceDate = null;

  @JsonProperty("reportedDate")
  private LocalDate reportedDate = null;

  @JsonProperty("partnerCollection")
  private List<CompanyIdCq> partnerCollection = new ArrayList<CompanyIdCq>();

  @JsonProperty("claimGrantCauseIdCq")
  private ClaimGrantCauseIdCq claimGrantCauseIdCq = null;

  @JsonProperty("claimProductTypeCauseIdCq")
  private ClaimProductTypeCauseIdCq claimProductTypeCauseIdCq = null;

  @JsonProperty("claimTreatmentTypeIdCq")
  private ClaimTreatmentTypeIdCq claimTreatmentTypeIdCq = null;

  @JsonProperty("claimVersionIdCq")
  private ClaimVersionIdCq claimVersionIdCq = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("notice")
  private String notice = null;

  @JsonProperty("sksCodesCollection")
  private List<TopClaimSKSCodeIdCq> sksCodesCollection = new ArrayList<TopClaimSKSCodeIdCq>();

  @JsonProperty("treatmentSubTypeCollection")
  private List<TopClaimTreatmentSubTypeIdCq> treatmentSubTypeCollection = new ArrayList<TopClaimTreatmentSubTypeIdCq>();

  @JsonProperty("isFreeChoiceOfPartner")
  private Boolean isFreeChoiceOfPartner = false;


  public LocalDate getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(LocalDate periodStart) {
    this.periodStart = periodStart;
  }

  public LocalDate getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(LocalDate periodEnd) {
    this.periodEnd = periodEnd;
  }

  public Double getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(Double maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public Long getTreatmentsAllowed() {
    return treatmentsAllowed;
  }

  public void setTreatmentsAllowed(Long treatmentsAllowed) {
    this.treatmentsAllowed = treatmentsAllowed;
  }

  public LocalDate getOccurrenceDate() {
    return occurrenceDate;
  }

  public void setOccurrenceDate(LocalDate occurrenceDate) {
    this.occurrenceDate = occurrenceDate;
  }

  public LocalDate getReportedDate() {
    return reportedDate;
  }

  public void setReportedDate(LocalDate reportedDate) {
    this.reportedDate = reportedDate;
  }
  public TopCreateClaimGrantHealthCareCommand addPartnerCollectionItem(CompanyIdCq partnerCollectionItem) {
    this.partnerCollection.add(partnerCollectionItem);
    return this;
  }

  public List<CompanyIdCq> getPartnerCollection() {
    return partnerCollection;
  }

  public void setPartnerCollection(List<CompanyIdCq> partnerCollection) {
    this.partnerCollection = partnerCollection;
  }

  public ClaimGrantCauseIdCq getClaimGrantCauseIdCq() {
    return claimGrantCauseIdCq;
  }

  public void setClaimGrantCauseIdCq(ClaimGrantCauseIdCq claimGrantCauseIdCq) {
    this.claimGrantCauseIdCq = claimGrantCauseIdCq;
  }

  public ClaimProductTypeCauseIdCq getClaimProductTypeCauseIdCq() {
    return claimProductTypeCauseIdCq;
  }

  public void setClaimProductTypeCauseIdCq(ClaimProductTypeCauseIdCq claimProductTypeCauseIdCq) {
    this.claimProductTypeCauseIdCq = claimProductTypeCauseIdCq;
  }

  public ClaimTreatmentTypeIdCq getClaimTreatmentTypeIdCq() {
    return claimTreatmentTypeIdCq;
  }

  public void setClaimTreatmentTypeIdCq(ClaimTreatmentTypeIdCq claimTreatmentTypeIdCq) {
    this.claimTreatmentTypeIdCq = claimTreatmentTypeIdCq;
  }

  public ClaimVersionIdCq getClaimVersionIdCq() {
    return claimVersionIdCq;
  }

  public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
    this.claimVersionIdCq = claimVersionIdCq;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }
  public TopCreateClaimGrantHealthCareCommand addSksCodesCollectionItem(TopClaimSKSCodeIdCq sksCodesCollectionItem) {
    this.sksCodesCollection.add(sksCodesCollectionItem);
    return this;
  }

  public List<TopClaimSKSCodeIdCq> getSksCodesCollection() {
    return sksCodesCollection;
  }

  public void setSksCodesCollection(List<TopClaimSKSCodeIdCq> sksCodesCollection) {
    this.sksCodesCollection = sksCodesCollection;
  }
  public TopCreateClaimGrantHealthCareCommand addTreatmentSubTypeCollectionItem(TopClaimTreatmentSubTypeIdCq treatmentSubTypeCollectionItem) {
    this.treatmentSubTypeCollection.add(treatmentSubTypeCollectionItem);
    return this;
  }

  public List<TopClaimTreatmentSubTypeIdCq> getTreatmentSubTypeCollection() {
    return treatmentSubTypeCollection;
  }

  public void setTreatmentSubTypeCollection(List<TopClaimTreatmentSubTypeIdCq> treatmentSubTypeCollection) {
    this.treatmentSubTypeCollection = treatmentSubTypeCollection;
  }

  public Boolean getIsFreeChoiceOfPartner() {
    return isFreeChoiceOfPartner;
  }

  public void setIsFreeChoiceOfPartner(Boolean isFreeChoiceOfPartner) {
    this.isFreeChoiceOfPartner = isFreeChoiceOfPartner;
  }
}

