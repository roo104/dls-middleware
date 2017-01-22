package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NoticeQueryNoticeQueryResult implements Serializable {
  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("noticeIdCqCollection")
  private List<NoticeIdCq> noticeIdCqCollection = new ArrayList<NoticeIdCq>();

  @JsonProperty("priceGroupId")
  private PriceGroupIdCq priceGroupId = null;


  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }
  public NoticeQueryNoticeQueryResult addNoticeIdCqCollectionItem(NoticeIdCq noticeIdCqCollectionItem) {
    this.noticeIdCqCollection.add(noticeIdCqCollectionItem);
    return this;
  }

  public List<NoticeIdCq> getNoticeIdCqCollection() {
    return noticeIdCqCollection;
  }

  public void setNoticeIdCqCollection(List<NoticeIdCq> noticeIdCqCollection) {
    this.noticeIdCqCollection = noticeIdCqCollection;
  }

  public PriceGroupIdCq getPriceGroupId() {
    return priceGroupId;
  }

  public void setPriceGroupId(PriceGroupIdCq priceGroupId) {
    this.priceGroupId = priceGroupId;
  }
}

