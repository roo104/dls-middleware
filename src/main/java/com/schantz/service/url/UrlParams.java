/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service.url;

public class UrlParams {
	
	public static final String BASE_URL = "http://localhost:9001/services/rest/";
	
	public static final String LOGIN_URL = BASE_URL + "security/users/command/loginCommand";
	public static final String POLICY_SEARCH_URL = BASE_URL + "policy/query/policySearchQuery?pagingInfoCq=0,20&personRegistration={personRegistration}";
	public static final String POLICY_URL = BASE_URL + "policy/query/basicInfoPolicyQuery/{eventTransId}/";
	public static final String PERSON_SEARCH_URL = BASE_URL + "person/query/personSearchQuery?registration={registration}";
	
}
