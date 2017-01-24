package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class FundOverviewCq implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("fondOfFond")
	private Boolean fondOfFond = false;
	
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	@JsonProperty("fundStateCq")
	private String fundStateCq = null;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getFondOfFond() {
		return fondOfFond;
	}
	
	public void setFondOfFond(Boolean fondOfFond) {
		this.fondOfFond = fondOfFond;
	}
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
	
	public String getFundStateCq() {
		return fundStateCq;
	}
	
	public void setFundStateCq(String fundStateCq) {
		this.fundStateCq = fundStateCq;
	}
}

