package com.bankapi.microservices.gateway.eurekazuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy  // act as zuul proxy.
@EnableEurekaServer //for making this application as eureka server.
@SpringBootApplication
public class EurekaZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulServiceApplication.class, args);
	}

}
