/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import java.time.*;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@RequiredArgsConstructor
public class Policy {
	
	private final String id;
	private final LocalDate startDate;
	@Setter
	private String ownerId;
	@Setter
	private String insuredPersonId;
	@Setter
	@JsonIgnore
	private String eventTransId;
	@Setter
	private String agreementId;
	
}
