package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Value("${limits-service.minimum}")
	private Integer minimumLimit;

	@Value("${limits-service.maximum}")
	private Integer maximumLimit;
	
	@GetMapping(path = "/limits")
	public LimitConfiguration retornaLimitsDasConfiguracoes() {
		return new LimitConfiguration(this.minimumLimit, this.maximumLimit);
	}
}