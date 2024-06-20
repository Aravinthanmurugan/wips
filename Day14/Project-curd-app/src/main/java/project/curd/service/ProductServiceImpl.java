package project.curd.service;

import java.util.List;

import project.curd.dao.ProductDao;
import project.curd.dao.ProductDaoImpl;
import project.curd.model.Products;

public class ProductServiceImpl implements ProductService {
	ProductDao dao;
	public ProductServiceImpl() {
		dao=new ProductDaoImpl();
	}
	@Override
	public Products searchProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> displayProducts() {
		// TODO Auto-generated method stub
		return dao.displayProducts();
	}

	@Override
	public boolean addProduct(Products product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

}
