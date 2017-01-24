/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import lombok.*;

@Getter
@Setter
public class Contribution {
	
	private double totalAmount;
	private double totalPct;
	private double salary;
	private EmployeeBillingType employeeBillingType;
	private double employerContributionAbs;
	private double employerContributionPct;
	private boolean employerContributionIsPct;
	private double employeeContributionAbs;
	private double employeeContributionPct;
	private boolean employeeContributionIsPct;
}
