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
	public User getUser(String personRegistration) {
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		ClientRequest<Void> request = ClientRequest.GET(UrlParams.PERSON_SEARCH_URL, personRegistration)
				.build();
		
		PersonSearchQueryResult person = client.exchange(request)
				.then(response -> response.bodyToMono(PersonSearchQueryResult.class))
				.block();
		
		PersonSearchEntry personSearchEntry = person.getEntryCollection().get(0);
		PersonNameCq name = personSearchEntry.getName();
		
		return new User(personSearchEntry.getPersonId().getUniqueId(), name.getFirstName(), name.getMiddleName(), name.getLastName());
	}
}
