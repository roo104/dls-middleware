package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeactivateBatchScheduleCommand implements Serializable {
	@JsonProperty("editUserId")
	private String editUserId = null;
	
	@JsonProperty("batchScheduleUidCq")
	private String batchScheduleUidCq = null;
	
	
	public String getEditUserId() {
		return editUserId;
	}
	
	public void setEditUserId(String editUserId) {
		this.editUserId = editUserId;
	}
	
	public String getBatchScheduleUidCq() {
		return batchScheduleUidCq;
	}
	
	public void setBatchScheduleUidCq(String batchScheduleUidCq) {
		this.batchScheduleUidCq = batchScheduleUidCq;
	}
}

