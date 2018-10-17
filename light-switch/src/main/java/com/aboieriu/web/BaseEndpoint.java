package com.aboieriu.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aboieriu
 */
@RestController
public class BaseEndpoint {

	@Value("spring.application.name")
	private String instanceName;

	@RequestMapping("/")
	public String hello(){
		return "Hello from " + instanceName;
	}

}
