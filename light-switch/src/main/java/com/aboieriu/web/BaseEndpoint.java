package com.aboieriu.web;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author aboieriu
 */
@RestController
public class BaseEndpoint {

	private static final String LIGHT_EMITTER_SERVICE = "LightEmitter";

	@Resource
	private DiscoveryClient discoveryClient;

	@Resource
	private RestTemplateBuilder restTemplateBuilder;

	@RequestMapping("/switch/on")
	public String on(){
		RestTemplate restTemplate = restTemplateBuilder.build();

		ResponseEntity<String> response = restTemplate.exchange(discoveryClient.getInstances(LIGHT_EMITTER_SERVICE).get(0).getUri(), HttpMethod.GET, null, String.class);
		
		return "Got response from : " + response.getBody();
	}
}
