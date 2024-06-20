package com.example.springpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springpage.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
