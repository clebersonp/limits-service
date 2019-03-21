package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.MyConfiguration;

@RestController
public class LimitsConfigurationController {
	
//	@Value("${limits-service.minimum}")
//	private Integer minimumLimit;
//
//	@Value("${limits-service.maximum}")
//	private Integer maximumLimit;
	
	@Autowired
	private MyConfiguration configuration;
	
	@GetMapping(path = "/limits")
	public LimitConfiguration retornaLimitsDasConfiguracoes() {
		return new LimitConfiguration(this.configuration.getMinimum(), this.configuration.getMaximum());
	}
}