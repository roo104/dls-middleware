package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class AgeDateCq implements Serializable {
	@JsonProperty("age")
	private AgeCq age = null;
	
	@JsonProperty("date_")
	private LocalDate date_ = null;
	
	
	public AgeCq getAge() {
		return age;
	}
	
	public void setAge(AgeCq age) {
		this.age = age;
	}
	
	public LocalDate getDate_() {
		return date_;
	}
	
	public void setDate_(LocalDate date_) {
		this.date_ = date_;
	}
}

