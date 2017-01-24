package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ContributionOrBenefitFrameCq implements Serializable {
	@JsonProperty("amountFrameCq")
	private AmountFrameCqObject amountFrameCq = null;
	
	@JsonProperty("relativeTo")
	private AgreementCoverIdCq relativeTo = null;
	
	@JsonProperty("notFromCollection")
	private List<String> notFromCollection = new ArrayList<String>();
	
	@JsonProperty("contributionOrBenefitTypeCq")
	private String contributionOrBenefitTypeCq = null;
	
	@JsonProperty("onlyFromCollection")
	private List<String> onlyFromCollection = new ArrayList<String>();
	
	@JsonProperty("contributionOrBenefitRuleCq")
	private String contributionOrBenefitRuleCq = null;
	
	
	public AmountFrameCqObject getAmountFrameCq() {
		return amountFrameCq;
	}
	
	public void setAmountFrameCq(AmountFrameCqObject amountFrameCq) {
		this.amountFrameCq = amountFrameCq;
	}
	
	public AgreementCoverIdCq getRelativeTo() {
		return relativeTo;
	}
	
	public void setRelativeTo(AgreementCoverIdCq relativeTo) {
		this.relativeTo = relativeTo;
	}
	
	public ContributionOrBenefitFrameCq addNotFromCollectionItem(String notFromCollectionItem) {
		this.notFromCollection.add(notFromCollectionItem);
		return this;
	}
	
	public List<String> getNotFromCollection() {
		return notFromCollection;
	}
	
	public void setNotFromCollection(List<String> notFromCollection) {
		this.notFromCollection = notFromCollection;
	}
	
	public String getContributionOrBenefitTypeCq() {
		return contributionOrBenefitTypeCq;
	}
	
	public void setContributionOrBenefitTypeCq(String contributionOrBenefitTypeCq) {
		this.contributionOrBenefitTypeCq = contributionOrBenefitTypeCq;
	}
	
	public ContributionOrBenefitFrameCq addOnlyFromCollectionItem(String onlyFromCollectionItem) {
		this.onlyFromCollection.add(onlyFromCollectionItem);
		return this;
	}
	
	public List<String> getOnlyFromCollection() {
		return onlyFromCollection;
	}
	
	public void setOnlyFromCollection(List<String> onlyFromCollection) {
		this.onlyFromCollection = onlyFromCollection;
	}
	
	public String getContributionOrBenefitRuleCq() {
		return contributionOrBenefitRuleCq;
	}
	
	public void setContributionOrBenefitRuleCq(String contributionOrBenefitRuleCq) {
		this.contributionOrBenefitRuleCq = contributionOrBenefitRuleCq;
	}
}

