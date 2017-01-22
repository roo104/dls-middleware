package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class XmlDocumentDetailsQueryXmlDocumentDetailsQueryResult implements Serializable {
  @JsonProperty("xmlRaw")
  private String xmlRaw = null;

  @JsonProperty("xmlFormatted")
  private String xmlFormatted = null;

  @JsonProperty("documentIdCq")
  private DocumentIdCq documentIdCq = null;


  public String getXmlRaw() {
    return xmlRaw;
  }

  public void setXmlRaw(String xmlRaw) {
    this.xmlRaw = xmlRaw;
  }

  public String getXmlFormatted() {
    return xmlFormatted;
  }

  public void setXmlFormatted(String xmlFormatted) {
    this.xmlFormatted = xmlFormatted;
  }

  public DocumentIdCq getDocumentIdCq() {
    return documentIdCq;
  }

  public void setDocumentIdCq(DocumentIdCq documentIdCq) {
    this.documentIdCq = documentIdCq;
  }
}

