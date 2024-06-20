package project.curd.dao;

import java.util.List;

import project.curd.model.Products;

public interface ProductDao {
	public Products searchProduct(int pid);
	public List<Products> displayProducts();
	public boolean addProduct(Products product);
}
