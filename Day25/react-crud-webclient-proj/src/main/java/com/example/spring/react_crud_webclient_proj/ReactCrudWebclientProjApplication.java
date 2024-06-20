package com.example.spring.react_crud_webclient_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReactCrudWebclientProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactCrudWebclientProjApplication.class, args);
	}
	
	@Bean
	public WebClient webClient() {
		return WebClient.create("http://localhost:8082");
	}
}
