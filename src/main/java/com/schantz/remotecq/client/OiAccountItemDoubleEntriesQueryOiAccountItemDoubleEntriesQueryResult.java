package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountItemDoubleEntriesQueryOiAccountItemDoubleEntriesQueryResult implements Serializable {
	@JsonProperty("doubleEntryId")
	private Long doubleEntryId = null;
	
	
	public Long getDoubleEntryId() {
		return doubleEntryId;
	}
	
	public void setDoubleEntryId(Long doubleEntryId) {
		this.doubleEntryId = doubleEntryId;
	}
}

