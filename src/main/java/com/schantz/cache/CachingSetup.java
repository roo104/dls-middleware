/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.cache;

import javax.cache.*;
import javax.cache.configuration.*;
import javax.cache.expiry.*;
import org.springframework.boot.autoconfigure.cache.*;
import org.springframework.stereotype.*;

import static java.util.concurrent.TimeUnit.*;

@Component
public class CachingSetup implements JCacheManagerCustomizer {
	
	@Override
	public void customize(CacheManager cacheManager) {
		cacheManager.createCache("policy", new MutableConfiguration<>()
				.setExpiryPolicyFactory(TouchedExpiryPolicy.factoryOf(new Duration(SECONDS, 60)))
				.setStoreByValue(false)
				.setStatisticsEnabled(true));
		
		cacheManager.createCache("user", new MutableConfiguration<>()
				.setExpiryPolicyFactory(TouchedExpiryPolicy.factoryOf(new Duration(SECONDS, 60)))
				.setStoreByValue(false)
				.setStatisticsEnabled(true));
	}
}