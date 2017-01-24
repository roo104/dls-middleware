package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EventManipulateRightsCq implements Serializable {
	@JsonProperty("canFlipLock")
	private Boolean canFlipLock = false;
	
	@JsonProperty("canEdit")
	private Boolean canEdit = false;
	
	@JsonProperty("canCancel")
	private Boolean canCancel = false;
	
	
	public Boolean getCanFlipLock() {
		return canFlipLock;
	}
	
	public void setCanFlipLock(Boolean canFlipLock) {
		this.canFlipLock = canFlipLock;
	}
	
	public Boolean getCanEdit() {
		return canEdit;
	}
	
	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}
	
	public Boolean getCanCancel() {
		return canCancel;
	}
	
	public void setCanCancel(Boolean canCancel) {
		this.canCancel = canCancel;
	}
}

