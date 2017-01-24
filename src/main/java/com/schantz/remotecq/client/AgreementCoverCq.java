package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCoverCq implements Serializable {
	@JsonProperty("coverId")
	private AgreementCoverIdCq coverId = null;
	
	@JsonProperty("complexId")
	private String complexId = null;
	
	@JsonProperty("agreementVariantCqCollection")
	private List<AgreementVariantCq> agreementVariantCqCollection = new ArrayList<AgreementVariantCq>();
	
	@JsonProperty("visibilityRuleCollection")
	private List<VisibilitySelectionFrameTripletCq> visibilityRuleCollection = new ArrayList<VisibilitySelectionFrameTripletCq>();
	
	@JsonProperty("ghost")
	private BooleanTripletCq ghost = null;
	
	@JsonProperty("shadow")
	private BooleanTripletCq shadow = null;
	
	@JsonProperty("systemControlled")
	private BooleanTripletCq systemControlled = null;
	
	@JsonProperty("advanceCoverTriggersTripletCq")
	private AdvanceCoverTriggersTripletCq advanceCoverTriggersTripletCq = null;
	
	
	public AgreementCoverIdCq getCoverId() {
		return coverId;
	}
	
	public void setCoverId(AgreementCoverIdCq coverId) {
		this.coverId = coverId;
	}
	
	public String getComplexId() {
		return complexId;
	}
	
	public void setComplexId(String complexId) {
		this.complexId = complexId;
	}
	
	public AgreementCoverCq addAgreementVariantCqCollectionItem(AgreementVariantCq agreementVariantCqCollectionItem) {
		this.agreementVariantCqCollection.add(agreementVariantCqCollectionItem);
		return this;
	}
	
	public List<AgreementVariantCq> getAgreementVariantCqCollection() {
		return agreementVariantCqCollection;
	}
	
	public void setAgreementVariantCqCollection(List<AgreementVariantCq> agreementVariantCqCollection) {
		this.agreementVariantCqCollection = agreementVariantCqCollection;
	}
	
	public AgreementCoverCq addVisibilityRuleCollectionItem(VisibilitySelectionFrameTripletCq visibilityRuleCollectionItem) {
		this.visibilityRuleCollection.add(visibilityRuleCollectionItem);
		return this;
	}
	
	public List<VisibilitySelectionFrameTripletCq> getVisibilityRuleCollection() {
		return visibilityRuleCollection;
	}
	
	public void setVisibilityRuleCollection(List<VisibilitySelectionFrameTripletCq> visibilityRuleCollection) {
		this.visibilityRuleCollection = visibilityRuleCollection;
	}
	
	public BooleanTripletCq getGhost() {
		return ghost;
	}
	
	public void setGhost(BooleanTripletCq ghost) {
		this.ghost = ghost;
	}
	
	public BooleanTripletCq getShadow() {
		return shadow;
	}
	
	public void setShadow(BooleanTripletCq shadow) {
		this.shadow = shadow;
	}
	
	public BooleanTripletCq getSystemControlled() {
		return systemControlled;
	}
	
	public void setSystemControlled(BooleanTripletCq systemControlled) {
		this.systemControlled = systemControlled;
	}
	
	public AdvanceCoverTriggersTripletCq getAdvanceCoverTriggersTripletCq() {
		return advanceCoverTriggersTripletCq;
	}
	
	public void setAdvanceCoverTriggersTripletCq(AdvanceCoverTriggersTripletCq advanceCoverTriggersTripletCq) {
		this.advanceCoverTriggersTripletCq = advanceCoverTriggersTripletCq;
	}
}

