package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class LockSearchEntry implements Serializable {
	@JsonProperty("acquiredAt")
	private OffsetDateTime acquiredAt = null;
	
	@JsonProperty("lastChangedAt")
	private OffsetDateTime lastChangedAt = null;
	
	@JsonProperty("lastChangedUserId")
	private String lastChangedUserId = null;
	
	@JsonProperty("sequenceNo")
	private Long sequenceNo = null;
	
	@JsonProperty("lockIdCq")
	private LockIdCq lockIdCq = null;
	
	@JsonProperty("lockTypeCq")
	private String lockTypeCq = null;
	
	
	public OffsetDateTime getAcquiredAt() {
		return acquiredAt;
	}
	
	public void setAcquiredAt(OffsetDateTime acquiredAt) {
		this.acquiredAt = acquiredAt;
	}
	
	public OffsetDateTime getLastChangedAt() {
		return lastChangedAt;
	}
	
	public void setLastChangedAt(OffsetDateTime lastChangedAt) {
		this.lastChangedAt = lastChangedAt;
	}
	
	public String getLastChangedUserId() {
		return lastChangedUserId;
	}
	
	public void setLastChangedUserId(String lastChangedUserId) {
		this.lastChangedUserId = lastChangedUserId;
	}
	
	public Long getSequenceNo() {
		return sequenceNo;
	}
	
	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	
	public LockIdCq getLockIdCq() {
		return lockIdCq;
	}
	
	public void setLockIdCq(LockIdCq lockIdCq) {
		this.lockIdCq = lockIdCq;
	}
	
	public String getLockTypeCq() {
		return lockTypeCq;
	}
	
	public void setLockTypeCq(String lockTypeCq) {
		this.lockTypeCq = lockTypeCq;
	}
}

