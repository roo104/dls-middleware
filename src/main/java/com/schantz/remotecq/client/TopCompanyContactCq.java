package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopCompanyContactCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("responsibility")
  private String responsibility = null;

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("cancelTime")
  private OffsetDateTime cancelTime = null;

  @JsonProperty("cancelUser")
  private String cancelUser = null;

  @JsonProperty("contactType")
  private String contactType = null;

  @JsonProperty("companyContactId")
  private TopCompanyContactIdCq companyContactId = null;


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getResponsibility() {
    return responsibility;
  }

  public void setResponsibility(String responsibility) {
    this.responsibility = responsibility;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OffsetDateTime getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(OffsetDateTime cancelTime) {
    this.cancelTime = cancelTime;
  }

  public String getCancelUser() {
    return cancelUser;
  }

  public void setCancelUser(String cancelUser) {
    this.cancelUser = cancelUser;
  }

  public String getContactType() {
    return contactType;
  }

  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  public TopCompanyContactIdCq getCompanyContactId() {
    return companyContactId;
  }

  public void setCompanyContactId(TopCompanyContactIdCq companyContactId) {
    this.companyContactId = companyContactId;
  }
}

