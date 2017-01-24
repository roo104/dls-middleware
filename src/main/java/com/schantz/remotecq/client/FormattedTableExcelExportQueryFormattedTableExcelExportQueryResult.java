package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FormattedTableExcelExportQueryFormattedTableExcelExportQueryResult implements Serializable {
	@JsonProperty("sheetName")
	private String sheetName = null;
	
	@JsonProperty("formattedTableRowCqCollection")
	private List<FormattedTableRowCq> formattedTableRowCqCollection = new ArrayList<FormattedTableRowCq>();
	
	
	public String getSheetName() {
		return sheetName;
	}
	
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	
	public FormattedTableExcelExportQueryFormattedTableExcelExportQueryResult addFormattedTableRowCqCollectionItem(FormattedTableRowCq formattedTableRowCqCollectionItem) {
		this.formattedTableRowCqCollection.add(formattedTableRowCqCollectionItem);
		return this;
	}
	
	public List<FormattedTableRowCq> getFormattedTableRowCqCollection() {
		return formattedTableRowCqCollection;
	}
	
	public void setFormattedTableRowCqCollection(List<FormattedTableRowCq> formattedTableRowCqCollection) {
		this.formattedTableRowCqCollection = formattedTableRowCqCollection;
	}
}

