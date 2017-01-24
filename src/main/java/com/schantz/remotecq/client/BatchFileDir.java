package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class BatchFileDir implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("size")
	private Long size = null;
	
	@JsonProperty("eiOperationCq")
	private EiOperationCq eiOperationCq = null;
	
	@JsonProperty("batchFileDirIdCq")
	private BatchFileDirIdCq batchFileDirIdCq = null;
	
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public Long getSize() {
		return size;
	}
	
	public void setSize(Long size) {
		this.size = size;
	}
	
	public EiOperationCq getEiOperationCq() {
		return eiOperationCq;
	}
	
	public void setEiOperationCq(EiOperationCq eiOperationCq) {
		this.eiOperationCq = eiOperationCq;
	}
	
	public BatchFileDirIdCq getBatchFileDirIdCq() {
		return batchFileDirIdCq;
	}
	
	public void setBatchFileDirIdCq(BatchFileDirIdCq batchFileDirIdCq) {
		this.batchFileDirIdCq = batchFileDirIdCq;
	}
}

