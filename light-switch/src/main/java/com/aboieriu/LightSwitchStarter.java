package com.aboieriu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aboieriu
 */

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(value = "com.aboieriu")
public class LightSwitchStarter {


	public static void main(String[] args) {
		SpringApplication.run(LightSwitchStarter.class, args);
	}



}
