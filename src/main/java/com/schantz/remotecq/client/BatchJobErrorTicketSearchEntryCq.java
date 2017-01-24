package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorTicketSearchEntryCq implements Serializable {
	@JsonProperty("data")
	private BatchJobErrorTicketDataCq data = null;
	
	
	public BatchJobErrorTicketDataCq getData() {
		return data;
	}
	
	public void setData(BatchJobErrorTicketDataCq data) {
		this.data = data;
	}
}

