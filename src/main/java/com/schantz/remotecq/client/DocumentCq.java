package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DocumentCq implements Serializable {
  @JsonProperty("documentInfoCq")
  private DocumentInfoCq documentInfoCq = null;

  @JsonProperty("documentDataCq")
  private DocumentDataCq documentDataCq = null;


  public DocumentInfoCq getDocumentInfoCq() {
    return documentInfoCq;
  }

  public void setDocumentInfoCq(DocumentInfoCq documentInfoCq) {
    this.documentInfoCq = documentInfoCq;
  }

  public DocumentDataCq getDocumentDataCq() {
    return documentDataCq;
  }

  public void setDocumentDataCq(DocumentDataCq documentDataCq) {
    this.documentDataCq = documentDataCq;
  }
}

