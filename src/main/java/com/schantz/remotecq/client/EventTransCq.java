package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class EventTransCq implements Serializable {
	@JsonProperty("commitDate")
	private OffsetDateTime commitDate = null;
	
	@JsonProperty("rollbackDate")
	private OffsetDateTime rollbackDate = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("eventTransRefCq")
	private EventTransRefCq eventTransRefCq = null;
	
	
	public OffsetDateTime getCommitDate() {
		return commitDate;
	}
	
	public void setCommitDate(OffsetDateTime commitDate) {
		this.commitDate = commitDate;
	}
	
	public OffsetDateTime getRollbackDate() {
		return rollbackDate;
	}
	
	public void setRollbackDate(OffsetDateTime rollbackDate) {
		this.rollbackDate = rollbackDate;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public EventTransRefCq getEventTransRefCq() {
		return eventTransRefCq;
	}
	
	public void setEventTransRefCq(EventTransRefCq eventTransRefCq) {
		this.eventTransRefCq = eventTransRefCq;
	}
}

