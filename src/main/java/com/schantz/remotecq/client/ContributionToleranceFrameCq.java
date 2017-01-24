package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ContributionToleranceFrameCq implements Serializable {
	@JsonProperty("negativeInnerTolerancePct")
	private Double negativeInnerTolerancePct = null;
	
	@JsonProperty("positiveInnerTolerancePct")
	private Double positiveInnerTolerancePct = null;
	
	@JsonProperty("negativeInnerToleranceAbs")
	private Double negativeInnerToleranceAbs = null;
	
	@JsonProperty("positiveInnerToleranceAbs")
	private Double positiveInnerToleranceAbs = null;
	
	@JsonProperty("negativeOuterTolerancePct")
	private Double negativeOuterTolerancePct = null;
	
	@JsonProperty("positiveOuterTolerancePct")
	private Double positiveOuterTolerancePct = null;
	
	@JsonProperty("negativeOuterToleranceAbs")
	private Double negativeOuterToleranceAbs = null;
	
	@JsonProperty("positiveOuterToleranceAbs")
	private Double positiveOuterToleranceAbs = null;
	
	@JsonProperty("skipMonths")
	private Long skipMonths = null;
	
	@JsonProperty("contributionTolerenceActionCq")
	private String contributionTolerenceActionCq = null;
	
	@JsonProperty("isAdjustOnlyIfSameDiff")
	private Boolean isAdjustOnlyIfSameDiff = false;
	
	
	public Double getNegativeInnerTolerancePct() {
		return negativeInnerTolerancePct;
	}
	
	public void setNegativeInnerTolerancePct(Double negativeInnerTolerancePct) {
		this.negativeInnerTolerancePct = negativeInnerTolerancePct;
	}
	
	public Double getPositiveInnerTolerancePct() {
		return positiveInnerTolerancePct;
	}
	
	public void setPositiveInnerTolerancePct(Double positiveInnerTolerancePct) {
		this.positiveInnerTolerancePct = positiveInnerTolerancePct;
	}
	
	public Double getNegativeInnerToleranceAbs() {
		return negativeInnerToleranceAbs;
	}
	
	public void setNegativeInnerToleranceAbs(Double negativeInnerToleranceAbs) {
		this.negativeInnerToleranceAbs = negativeInnerToleranceAbs;
	}
	
	public Double getPositiveInnerToleranceAbs() {
		return positiveInnerToleranceAbs;
	}
	
	public void setPositiveInnerToleranceAbs(Double positiveInnerToleranceAbs) {
		this.positiveInnerToleranceAbs = positiveInnerToleranceAbs;
	}
	
	public Double getNegativeOuterTolerancePct() {
		return negativeOuterTolerancePct;
	}
	
	public void setNegativeOuterTolerancePct(Double negativeOuterTolerancePct) {
		this.negativeOuterTolerancePct = negativeOuterTolerancePct;
	}
	
	public Double getPositiveOuterTolerancePct() {
		return positiveOuterTolerancePct;
	}
	
	public void setPositiveOuterTolerancePct(Double positiveOuterTolerancePct) {
		this.positiveOuterTolerancePct = positiveOuterTolerancePct;
	}
	
	public Double getNegativeOuterToleranceAbs() {
		return negativeOuterToleranceAbs;
	}
	
	public void setNegativeOuterToleranceAbs(Double negativeOuterToleranceAbs) {
		this.negativeOuterToleranceAbs = negativeOuterToleranceAbs;
	}
	
	public Double getPositiveOuterToleranceAbs() {
		return positiveOuterToleranceAbs;
	}
	
	public void setPositiveOuterToleranceAbs(Double positiveOuterToleranceAbs) {
		this.positiveOuterToleranceAbs = positiveOuterToleranceAbs;
	}
	
	public Long getSkipMonths() {
		return skipMonths;
	}
	
	public void setSkipMonths(Long skipMonths) {
		this.skipMonths = skipMonths;
	}
	
	public String getContributionTolerenceActionCq() {
		return contributionTolerenceActionCq;
	}
	
	public void setContributionTolerenceActionCq(String contributionTolerenceActionCq) {
		this.contributionTolerenceActionCq = contributionTolerenceActionCq;
	}
	
	public Boolean getIsAdjustOnlyIfSameDiff() {
		return isAdjustOnlyIfSameDiff;
	}
	
	public void setIsAdjustOnlyIfSameDiff(Boolean isAdjustOnlyIfSameDiff) {
		this.isAdjustOnlyIfSameDiff = isAdjustOnlyIfSameDiff;
	}
}

