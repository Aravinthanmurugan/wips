package com.example.spring.react_crud_webclient_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ProductService {
	

	@Autowired
	WebClient webClient;

	
	public Flux<Products> getAllItems() {
		// TODO Auto-generated method stub
		return webClient.get()
						.uri("/items")
						.retrieve()
						.bodyToFlux(Products.class);
	}

	
	public Mono<Products> getItemById(String id) {
		// TODO Auto-generated method stub
		return webClient.get()
				.uri("/items/search/{id}", id)
				.retrieve()
				.bodyToMono(Products.class);
	}


	public Mono<Products> createItem(Products item) {
		// TODO Auto-generated method stub
		return webClient.post()
						.uri("/items")
						.bodyValue(item)
						.retrieve()
						.bodyToMono(Products.class);
	}

	
	public Mono<Void> deleteItem(String id) {
		// TODO Auto-generated method stub
		return webClient.delete()
						.uri("/items/{id}", id)
						.retrieve()
						.bodyToMono(Void.class);
	}


	public Flux<Products> getItemsByName(String name) {
		// TODO Auto-generated method stub
		return webClient.get()
						.uri("/items/{name}", name)
						.retrieve()
						.bodyToFlux(Products.class);
	}

	
	public void consumeNumberStream() {
		webClient.get()
				.uri("/items/stream/numbers")
				.retrieve()
				.bodyToFlux(Integer.class)
				.delayElements(java.time.Duration.ofMillis(100))
				.subscribe(
						number->System.out.println("Number is: "+number),
						error -> System.out.println("Error is: " + error),
						() -> System.out.println("Stream is completed")
						
						);
	}
}
