package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterValueTypeCq implements Serializable {
  @JsonProperty("valueFieldTypeCollection")
  private List<ParameterFieldTypeCqObject> valueFieldTypeCollection = new ArrayList<ParameterFieldTypeCqObject>();

  @JsonProperty("id")
  private ParameterTypeIdCq id = null;

  public ParameterValueTypeCq addValueFieldTypeCollectionItem(ParameterFieldTypeCqObject valueFieldTypeCollectionItem) {
    this.valueFieldTypeCollection.add(valueFieldTypeCollectionItem);
    return this;
  }

  public List<ParameterFieldTypeCqObject> getValueFieldTypeCollection() {
    return valueFieldTypeCollection;
  }

  public void setValueFieldTypeCollection(List<ParameterFieldTypeCqObject> valueFieldTypeCollection) {
    this.valueFieldTypeCollection = valueFieldTypeCollection;
  }

  public ParameterTypeIdCq getId() {
    return id;
  }

  public void setId(ParameterTypeIdCq id) {
    this.id = id;
  }
}

