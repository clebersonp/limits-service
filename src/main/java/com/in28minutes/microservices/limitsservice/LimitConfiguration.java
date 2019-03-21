package com.in28minutes.microservices.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {
	private Integer mininum;
	private Integer maximum;
}