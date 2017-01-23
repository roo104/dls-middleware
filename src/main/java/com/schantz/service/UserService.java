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

@Service
public class UserService {
	
	@CacheResult(cacheName = "user")
	public User getUserBySocialSecurityNumber(String socialSecurityNumber) {
		ClientRequest<Void> request = ClientRequest.GET(UrlParams.PERSON_SEARCH_URL, socialSecurityNumber)
				.build();
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		PersonSearchQueryResult person = client.exchange(request)
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
		ClientRequest<Void> request = ClientRequest.GET(UrlParams.PERSON_URL, id)
				.build();
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		PersonSearchQueryResult personResponse = client.exchange(request)
				.then(response -> response.bodyToMono(PersonSearchQueryResult.class))
				.block();
		
		PersonSearchEntry personSearchEntry = personResponse.getEntryCollection().get(0);
		PersonNameCq name = personSearchEntry.getName();
		
		User user = new User(personSearchEntry.getPersonId().getUniqueId(), name.getFirstName(), name.getMiddleName(), name.getLastName());
		user.setSocialSecurityNumber(personSearchEntry.getPersonId().getRegistration());
		return user;
	}
}

