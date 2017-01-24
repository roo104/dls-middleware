package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MoveFormFieldCommand implements Serializable {
	@JsonProperty("formFieldIdCq")
	private FormFieldIdCq formFieldIdCq = null;
	
	@JsonProperty("isMoveUp")
	private Boolean isMoveUp = false;
	
	
	public FormFieldIdCq getFormFieldIdCq() {
		return formFieldIdCq;
	}
	
	public void setFormFieldIdCq(FormFieldIdCq formFieldIdCq) {
		this.formFieldIdCq = formFieldIdCq;
	}
	
	public Boolean getIsMoveUp() {
		return isMoveUp;
	}
	
	public void setIsMoveUp(Boolean isMoveUp) {
		this.isMoveUp = isMoveUp;
	}
}

