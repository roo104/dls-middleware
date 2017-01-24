package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class StatusRecordingQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("startTime")
	private OffsetDateTime startTime = null;
	
	@JsonProperty("recordBundleId")
	private RecordBundleIdCq recordBundleId = null;
	
	@JsonProperty("isAvailable")
	private Boolean isAvailable = false;
	
	@JsonProperty("isRecording")
	private Boolean isRecording = false;
	
	public StatusRecordingQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OffsetDateTime getStartTime() {
		return startTime;
	}
	
	public void setStartTime(OffsetDateTime startTime) {
		this.startTime = startTime;
	}
	
	public RecordBundleIdCq getRecordBundleId() {
		return recordBundleId;
	}
	
	public void setRecordBundleId(RecordBundleIdCq recordBundleId) {
		this.recordBundleId = recordBundleId;
	}
	
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public Boolean getIsRecording() {
		return isRecording;
	}
	
	public void setIsRecording(Boolean isRecording) {
		this.isRecording = isRecording;
	}
}

