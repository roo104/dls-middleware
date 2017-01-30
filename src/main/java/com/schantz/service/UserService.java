/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import javax.cache.annotation.*;
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;
import org.springframework.web.util.*;

@Service
public class UserService {
	
	@CacheResult(cacheName = "user")
	public User getUserBySocialSecurityNumber(String socialSecurityNumber) {
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		UriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(UrlParams.PERSON_SEARCH_URL);
		WebClientOperations operations = WebClientOperations.builder(client).uriBuilderFactory(uriBuilderFactory).build();
		
		PersonSearchQueryResult person = operations.get()
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
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		UriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(UrlParams.PERSON_URL);
		WebClientOperations operations = WebClientOperations.builder(client).uriBuilderFactory(uriBuilderFactory).build();
		
		PersonSearchQueryResult personResponse = operations.get()
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

