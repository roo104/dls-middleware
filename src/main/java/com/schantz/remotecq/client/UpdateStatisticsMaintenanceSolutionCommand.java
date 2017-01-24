package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UpdateStatisticsMaintenanceSolutionCommand implements Serializable {
	@JsonProperty("fragmentationLevel1")
	private Long fragmentationLevel1 = null;
	
	@JsonProperty("fragmentationLevel2")
	private Long fragmentationLevel2 = null;
	
	
	public Long getFragmentationLevel1() {
		return fragmentationLevel1;
	}
	
	public void setFragmentationLevel1(Long fragmentationLevel1) {
		this.fragmentationLevel1 = fragmentationLevel1;
	}
	
	public Long getFragmentationLevel2() {
		return fragmentationLevel2;
	}
	
	public void setFragmentationLevel2(Long fragmentationLevel2) {
		this.fragmentationLevel2 = fragmentationLevel2;
	}
}

