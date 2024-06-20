package com.example.producermicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.example.producermicroservices")
//@EnableEurekaClient
@EnableDiscoveryClient
public class HelloProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloProducerApplication.class, args);
	}

}
