package project.curd.service;

import java.util.List;

import project.curd.model.Products;

public interface ProductService {
	public Products searchProduct(int pid);
	public List<Products> displayProducts();
	public boolean addProduct(Products product);

}
