/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import lombok.*;

@Getter
@RequiredArgsConstructor
public class Login {
	
	private final String sessionToken;
	private final String userId;
	
}
