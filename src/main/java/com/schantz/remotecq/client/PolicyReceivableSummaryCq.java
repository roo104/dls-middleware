package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyReceivableSummaryCq implements Serializable {
	@JsonProperty("totalAmountUnknown")
	private Double totalAmountUnknown = null;
	
	@JsonProperty("totalAmountDeposit")
	private Double totalAmountDeposit = null;
	
	@JsonProperty("totalAmountContribution")
	private Double totalAmountContribution = null;
	
	@JsonProperty("totalAmountRegulation")
	private Double totalAmountRegulation = null;
	
	
	public Double getTotalAmountUnknown() {
		return totalAmountUnknown;
	}
	
	public void setTotalAmountUnknown(Double totalAmountUnknown) {
		this.totalAmountUnknown = totalAmountUnknown;
	}
	
	public Double getTotalAmountDeposit() {
		return totalAmountDeposit;
	}
	
	public void setTotalAmountDeposit(Double totalAmountDeposit) {
		this.totalAmountDeposit = totalAmountDeposit;
	}
	
	public Double getTotalAmountContribution() {
		return totalAmountContribution;
	}
	
	public void setTotalAmountContribution(Double totalAmountContribution) {
		this.totalAmountContribution = totalAmountContribution;
	}
	
	public Double getTotalAmountRegulation() {
		return totalAmountRegulation;
	}
	
	public void setTotalAmountRegulation(Double totalAmountRegulation) {
		this.totalAmountRegulation = totalAmountRegulation;
	}
}

