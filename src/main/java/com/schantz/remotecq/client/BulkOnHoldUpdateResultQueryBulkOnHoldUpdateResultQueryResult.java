package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BulkOnHoldUpdateResultQueryBulkOnHoldUpdateResultQueryResult implements Serializable {
  @JsonProperty("bulkOnHoldUpdateResultIdCq")
  private BulkOnHoldUpdateResultIdCq bulkOnHoldUpdateResultIdCq = null;


  public BulkOnHoldUpdateResultIdCq getBulkOnHoldUpdateResultIdCq() {
    return bulkOnHoldUpdateResultIdCq;
  }

  public void setBulkOnHoldUpdateResultIdCq(BulkOnHoldUpdateResultIdCq bulkOnHoldUpdateResultIdCq) {
    this.bulkOnHoldUpdateResultIdCq = bulkOnHoldUpdateResultIdCq;
  }
}

