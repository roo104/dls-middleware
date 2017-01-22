package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateSelectionEditCq implements Serializable {
  @JsonProperty("editedDocument")
  private byte[] editedDocument = null;

  @JsonProperty("originalDocument")
  private byte[] originalDocument = null;


  public byte[] getEditedDocument() {
    return editedDocument;
  }

  public void setEditedDocument(byte[] editedDocument) {
    this.editedDocument = editedDocument;
  }

  public byte[] getOriginalDocument() {
    return originalDocument;
  }

  public void setOriginalDocument(byte[] originalDocument) {
    this.originalDocument = originalDocument;
  }
}

