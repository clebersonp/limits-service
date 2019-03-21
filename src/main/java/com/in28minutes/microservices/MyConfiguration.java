package com.in28minutes.microservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * My class of configuration
 * @author cleberson
 *
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "limits-service")
public class MyConfiguration {
	
	/**
	 * The minimum value
	 */
	private Integer minimum;
	
	/**
	 * The maximum value
	 */
	private Integer maximum;
}