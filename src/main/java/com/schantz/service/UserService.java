/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import javax.cache.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class UserService {
	
	@Value("${base-url}")
	private String baseUrl;
	
	@CacheResult(cacheName = "user")
	public User getUserBySocialSecurityNumber(String socialSecurityNumber) {
		WebClient client = WebClient.create(baseUrl + UrlParams.PERSON_URL);
		
		PersonSearchQueryResult person = client.get()
				.uri(factory -> factory.uriString("").queryParam("registration", socialSecurityNumber).build())
				.exchange()
				.then(response -> response.bodyToMono(PersonSearchQueryResult.class))
				.block();
		
		PersonSearchEntry personSearchEntry = person.getEntryCollection().get(0);
		PersonNameCq name = personSearchEntry.getName();
		
		User user = new User(personSearchEntry.getPersonId().getUniqueId(), name.getFirstName(), name.getMiddleName(), name.getLastName());
		user.setSocialSecurityNumber(personSearchEntry.getPersonId().getRegistration());
		return user;
	}
	
	@CacheResult(cacheName = "user")
	public User getUser(String id) {
		WebClient client = WebClient.create(baseUrl + UrlParams.PERSON_URL);
		
		PersonSearchQueryResult personResponse = client.get()
				.uri(factory -> factory.uriString("").queryParam("personUid", id).build())
				.exchange()
				.then(response -> response.bodyToMono(PersonSearchQueryResult.class))
				.block();
		
		PersonSearchEntry personSearchEntry = personResponse.getEntryCollection().get(0);
		PersonNameCq name = personSearchEntry.getName();
		
		User user = new User(personSearchEntry.getPersonId().getUniqueId(), name.getFirstName(), name.getMiddleName(), name.getLastName());
		user.setSocialSecurityNumber(personSearchEntry.getPersonId().getRegistration());
		return user;
	}
}

