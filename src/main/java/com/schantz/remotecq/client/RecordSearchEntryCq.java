package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class RecordSearchEntryCq implements Serializable {
	@JsonProperty("actionType")
	private String actionType = null;
	
	@JsonProperty("bigObjectType")
	private String bigObjectType = null;
	
	@JsonProperty("bigObjectRef")
	private String bigObjectRef = null;
	
	@JsonProperty("recordTime")
	private OffsetDateTime recordTime = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("recordTypeCq")
	private String recordTypeCq = null;
	
	@JsonProperty("recordEntryId")
	private RecordEntryIdCq recordEntryId = null;
	
	@JsonProperty("user")
	private UserIdCq user = null;
	
	
	public String getActionType() {
		return actionType;
	}
	
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	public String getBigObjectType() {
		return bigObjectType;
	}
	
	public void setBigObjectType(String bigObjectType) {
		this.bigObjectType = bigObjectType;
	}
	
	public String getBigObjectRef() {
		return bigObjectRef;
	}
	
	public void setBigObjectRef(String bigObjectRef) {
		this.bigObjectRef = bigObjectRef;
	}
	
	public OffsetDateTime getRecordTime() {
		return recordTime;
	}
	
	public void setRecordTime(OffsetDateTime recordTime) {
		this.recordTime = recordTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getRecordTypeCq() {
		return recordTypeCq;
	}
	
	public void setRecordTypeCq(String recordTypeCq) {
		this.recordTypeCq = recordTypeCq;
	}
	
	public RecordEntryIdCq getRecordEntryId() {
		return recordEntryId;
	}
	
	public void setRecordEntryId(RecordEntryIdCq recordEntryId) {
		this.recordEntryId = recordEntryId;
	}
	
	public UserIdCq getUser() {
		return user;
	}
	
	public void setUser(UserIdCq user) {
		this.user = user;
	}
}

