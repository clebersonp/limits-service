package com.in28minutes.microservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "limits-service")
public class MyConfiguration {
	
	private Integer minimum;
	private Integer maximum;
}