package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class FundVersionDetailsCq implements Serializable {
	@JsonProperty("versionNumber")
	private Long versionNumber = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("projectionParameterSetId")
	private String projectionParameterSetId = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("fundVersionIdCq")
	private FundVersionIdCq fundVersionIdCq = null;
	
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	@JsonProperty("investmentRiskCq")
	private String investmentRiskCq = null;
	
	@JsonProperty("kickbackOptionCq")
	private String kickbackOptionCq = null;
	
	@JsonProperty("investmentRuleCq")
	private String investmentRuleCq = null;
	
	@JsonProperty("investmentAssetCq")
	private String investmentAssetCq = null;
	
	@JsonProperty("morningStarCq")
	private String morningStarCq = null;
	
	@JsonProperty("regionCq")
	private String regionCq = null;
	
	@JsonProperty("sectorCq")
	private String sectorCq = null;
	
	@JsonProperty("currencyCodeCq")
	private String currencyCodeCq = null;
	
	@JsonProperty("mergeCq")
	private MergeCq mergeCq = null;
	
	@JsonProperty("fundProjectionGroupCq")
	private String fundProjectionGroupCq = null;
	
	@JsonProperty("fundInternalChargeGroupCq")
	private String fundInternalChargeGroupCq = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("isActive")
	private Boolean isActive = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public Long getVersionNumber() {
		return versionNumber;
	}
	
	public void setVersionNumber(Long versionNumber) {
		this.versionNumber = versionNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProjectionParameterSetId() {
		return projectionParameterSetId;
	}
	
	public void setProjectionParameterSetId(String projectionParameterSetId) {
		this.projectionParameterSetId = projectionParameterSetId;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
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
	
	public FundVersionIdCq getFundVersionIdCq() {
		return fundVersionIdCq;
	}
	
	public void setFundVersionIdCq(FundVersionIdCq fundVersionIdCq) {
		this.fundVersionIdCq = fundVersionIdCq;
	}
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
	
	public String getInvestmentRiskCq() {
		return investmentRiskCq;
	}
	
	public void setInvestmentRiskCq(String investmentRiskCq) {
		this.investmentRiskCq = investmentRiskCq;
	}
	
	public String getKickbackOptionCq() {
		return kickbackOptionCq;
	}
	
	public void setKickbackOptionCq(String kickbackOptionCq) {
		this.kickbackOptionCq = kickbackOptionCq;
	}
	
	public String getInvestmentRuleCq() {
		return investmentRuleCq;
	}
	
	public void setInvestmentRuleCq(String investmentRuleCq) {
		this.investmentRuleCq = investmentRuleCq;
	}
	
	public String getInvestmentAssetCq() {
		return investmentAssetCq;
	}
	
	public void setInvestmentAssetCq(String investmentAssetCq) {
		this.investmentAssetCq = investmentAssetCq;
	}
	
	public String getMorningStarCq() {
		return morningStarCq;
	}
	
	public void setMorningStarCq(String morningStarCq) {
		this.morningStarCq = morningStarCq;
	}
	
	public String getRegionCq() {
		return regionCq;
	}
	
	public void setRegionCq(String regionCq) {
		this.regionCq = regionCq;
	}
	
	public String getSectorCq() {
		return sectorCq;
	}
	
	public void setSectorCq(String sectorCq) {
		this.sectorCq = sectorCq;
	}
	
	public String getCurrencyCodeCq() {
		return currencyCodeCq;
	}
	
	public void setCurrencyCodeCq(String currencyCodeCq) {
		this.currencyCodeCq = currencyCodeCq;
	}
	
	public MergeCq getMergeCq() {
		return mergeCq;
	}
	
	public void setMergeCq(MergeCq mergeCq) {
		this.mergeCq = mergeCq;
	}
	
	public String getFundProjectionGroupCq() {
		return fundProjectionGroupCq;
	}
	
	public void setFundProjectionGroupCq(String fundProjectionGroupCq) {
		this.fundProjectionGroupCq = fundProjectionGroupCq;
	}
	
	public String getFundInternalChargeGroupCq() {
		return fundInternalChargeGroupCq;
	}
	
	public void setFundInternalChargeGroupCq(String fundInternalChargeGroupCq) {
		this.fundInternalChargeGroupCq = fundInternalChargeGroupCq;
	}
	
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

