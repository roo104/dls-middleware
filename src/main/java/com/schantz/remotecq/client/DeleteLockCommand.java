package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteLockCommand implements Serializable {
	@JsonProperty("lockIdCq")
	private LockIdCq lockIdCq = null;
	
	
	public LockIdCq getLockIdCq() {
		return lockIdCq;
	}
	
	public void setLockIdCq(LockIdCq lockIdCq) {
		this.lockIdCq = lockIdCq;
	}
}

