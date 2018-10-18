package com.aboieriu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aboieriu
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@ComponentScan(value = "com.aboieriu")
public class LightEmitterStarter
{

}
