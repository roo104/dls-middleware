package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class FormattedTableRowCq implements Serializable {
  @JsonProperty("formattedTableRowValueCqCollection")
  private List<FormattedTableRowValueCq> formattedTableRowValueCqCollection = new ArrayList<FormattedTableRowValueCq>();

  @JsonProperty("isHeaderRow")
  private Boolean isHeaderRow = false;

  public FormattedTableRowCq addFormattedTableRowValueCqCollectionItem(FormattedTableRowValueCq formattedTableRowValueCqCollectionItem) {
    this.formattedTableRowValueCqCollection.add(formattedTableRowValueCqCollectionItem);
    return this;
  }

  public List<FormattedTableRowValueCq> getFormattedTableRowValueCqCollection() {
    return formattedTableRowValueCqCollection;
  }

  public void setFormattedTableRowValueCqCollection(List<FormattedTableRowValueCq> formattedTableRowValueCqCollection) {
    this.formattedTableRowValueCqCollection = formattedTableRowValueCqCollection;
  }

  public Boolean getIsHeaderRow() {
    return isHeaderRow;
  }

  public void setIsHeaderRow(Boolean isHeaderRow) {
    this.isHeaderRow = isHeaderRow;
  }
}

