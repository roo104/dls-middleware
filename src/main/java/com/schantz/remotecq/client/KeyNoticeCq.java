package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class KeyNoticeCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("valeurDate")
  private LocalDate valeurDate = null;

  @JsonProperty("noticeId")
  private NoticeIdCq noticeId = null;

  @JsonProperty("documentInfoCq")
  private DocumentInfoCq documentInfoCq = null;

  @JsonProperty("noticeTypeCq")
  private String noticeTypeCq = null;

  @JsonProperty("noticeSubTypeCq")
  private String noticeSubTypeCq = null;

  @JsonProperty("noticeOriginTypeCq")
  private String noticeOriginTypeCq = null;

  @JsonProperty("systemKey")
  private CqMessageKey systemKey = null;


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

  public LocalDate getValeurDate() {
    return valeurDate;
  }

  public void setValeurDate(LocalDate valeurDate) {
    this.valeurDate = valeurDate;
  }

  public NoticeIdCq getNoticeId() {
    return noticeId;
  }

  public void setNoticeId(NoticeIdCq noticeId) {
    this.noticeId = noticeId;
  }

  public DocumentInfoCq getDocumentInfoCq() {
    return documentInfoCq;
  }

  public void setDocumentInfoCq(DocumentInfoCq documentInfoCq) {
    this.documentInfoCq = documentInfoCq;
  }

  public String getNoticeTypeCq() {
    return noticeTypeCq;
  }

  public void setNoticeTypeCq(String noticeTypeCq) {
    this.noticeTypeCq = noticeTypeCq;
  }

  public String getNoticeSubTypeCq() {
    return noticeSubTypeCq;
  }

  public void setNoticeSubTypeCq(String noticeSubTypeCq) {
    this.noticeSubTypeCq = noticeSubTypeCq;
  }

  public String getNoticeOriginTypeCq() {
    return noticeOriginTypeCq;
  }

  public void setNoticeOriginTypeCq(String noticeOriginTypeCq) {
    this.noticeOriginTypeCq = noticeOriginTypeCq;
  }

  public CqMessageKey getSystemKey() {
    return systemKey;
  }

  public void setSystemKey(CqMessageKey systemKey) {
    this.systemKey = systemKey;
  }
}

