package com.example.spring.reactive_curd_project.dao;



import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.spring.reactive_curd_project.model.Item;

import reactor.core.publisher.Flux;

public interface ItemDao extends ReactiveMongoRepository<Item, String>{
	
	public Flux<Item> findByName(String name);

}
