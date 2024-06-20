package com.example.project.service;

import java.sql.SQLException;
import java.util.List;

import com.example.project.model.Product;

public interface Productservice {
	public Product insertProduct(Product product) throws ClassNotFoundException, SQLException;
	public List<Product> displayProduct() throws ClassNotFoundException, SQLException;
	public boolean deleteProduct(int proid) throws ClassNotFoundException, SQLException;
}
