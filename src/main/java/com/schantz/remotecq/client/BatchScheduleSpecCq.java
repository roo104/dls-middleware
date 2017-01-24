package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleSpecCq implements Serializable {
	@JsonProperty("year")
	private Long year = null;
	
	@JsonProperty("month")
	private Long month = null;
	
	@JsonProperty("weekDay")
	private Long weekDay = null;
	
	@JsonProperty("day")
	private Long day = null;
	
	@JsonProperty("hour")
	private Long hour = null;
	
	@JsonProperty("minute")
	private Long minute = null;
	
	@JsonProperty("repeat")
	private Long repeat = null;
	
	
	public Long getYear() {
		return year;
	}
	
	public void setYear(Long year) {
		this.year = year;
	}
	
	public Long getMonth() {
		return month;
	}
	
	public void setMonth(Long month) {
		this.month = month;
	}
	
	public Long getWeekDay() {
		return weekDay;
	}
	
	public void setWeekDay(Long weekDay) {
		this.weekDay = weekDay;
	}
	
	public Long getDay() {
		return day;
	}
	
	public void setDay(Long day) {
		this.day = day;
	}
	
	public Long getHour() {
		return hour;
	}
	
	public void setHour(Long hour) {
		this.hour = hour;
	}
	
	public Long getMinute() {
		return minute;
	}
	
	public void setMinute(Long minute) {
		this.minute = minute;
	}
	
	public Long getRepeat() {
		return repeat;
	}
	
	public void setRepeat(Long repeat) {
		this.repeat = repeat;
	}
}

