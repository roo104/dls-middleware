package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class UserCq implements Serializable {
	@JsonProperty("email")
	private String email = null;
	
	@JsonProperty("firstName")
	private String firstName = null;
	
	@JsonProperty("lastName")
	private String lastName = null;
	
	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("userIdCq")
	private UserIdCq userIdCq = null;
	
	@JsonProperty("roleCqCollection")
	private List<RoleCq> roleCqCollection = new ArrayList<RoleCq>();
	
	@JsonProperty("isDeleted")
	private Boolean isDeleted = false;
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public UserIdCq getUserIdCq() {
		return userIdCq;
	}
	
	public void setUserIdCq(UserIdCq userIdCq) {
		this.userIdCq = userIdCq;
	}
	
	public UserCq addRoleCqCollectionItem(RoleCq roleCqCollectionItem) {
		this.roleCqCollection.add(roleCqCollectionItem);
		return this;
	}
	
	public List<RoleCq> getRoleCqCollection() {
		return roleCqCollection;
	}
	
	public void setRoleCqCollection(List<RoleCq> roleCqCollection) {
		this.roleCqCollection = roleCqCollection;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}

