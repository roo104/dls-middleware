package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreateShowcaseWorkflowInstancesCommand implements Serializable {
	@JsonProperty("advanceUntil")
	private LocalDate advanceUntil = null;
	
	
	public LocalDate getAdvanceUntil() {
		return advanceUntil;
	}
	
	public void setAdvanceUntil(LocalDate advanceUntil) {
		this.advanceUntil = advanceUntil;
	}
}

