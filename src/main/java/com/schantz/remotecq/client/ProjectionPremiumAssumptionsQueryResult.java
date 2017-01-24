package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ProjectionPremiumAssumptionsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("projectionPremiumAssumptionsEntryCollection")
	private List<ProjectionPremiumAssumptionsEntry> projectionPremiumAssumptionsEntryCollection = new ArrayList<ProjectionPremiumAssumptionsEntry>();
	
	public ProjectionPremiumAssumptionsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ProjectionPremiumAssumptionsQueryResult addProjectionPremiumAssumptionsEntryCollectionItem(ProjectionPremiumAssumptionsEntry projectionPremiumAssumptionsEntryCollectionItem) {
		this.projectionPremiumAssumptionsEntryCollection.add(projectionPremiumAssumptionsEntryCollectionItem);
		return this;
	}
	
	public List<ProjectionPremiumAssumptionsEntry> getProjectionPremiumAssumptionsEntryCollection() {
		return projectionPremiumAssumptionsEntryCollection;
	}
	
	public void setProjectionPremiumAssumptionsEntryCollection(List<ProjectionPremiumAssumptionsEntry> projectionPremiumAssumptionsEntryCollection) {
		this.projectionPremiumAssumptionsEntryCollection = projectionPremiumAssumptionsEntryCollection;
	}
}

