package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CalcFoundationIdCq implements Serializable {
	@JsonProperty("calcFoundationName")
	private EntityNameCq calcFoundationName = null;
	
	
	public EntityNameCq getCalcFoundationName() {
		return calcFoundationName;
	}
	
	public void setCalcFoundationName(EntityNameCq calcFoundationName) {
		this.calcFoundationName = calcFoundationName;
	}
}

