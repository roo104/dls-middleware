package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RemoveFormFieldCommand implements Serializable {
	@JsonProperty("formFieldIdCq")
	private FormFieldIdCq formFieldIdCq = null;
	
	
	public FormFieldIdCq getFormFieldIdCq() {
		return formFieldIdCq;
	}
	
	public void setFormFieldIdCq(FormFieldIdCq formFieldIdCq) {
		this.formFieldIdCq = formFieldIdCq;
	}
}

