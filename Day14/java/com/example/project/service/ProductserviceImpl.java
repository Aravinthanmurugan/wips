package com.example.project.service;

import java.sql.SQLException;
import java.util.List;

import com.example.project.dao.ProductDao;
import com.example.project.dao.ProductImpl;
import com.example.project.model.Product;

public class ProductserviceImpl implements Productservice {
      ProductDao dao;
	
	      public ProductserviceImpl() {
		      dao = new ProductImpl();
	      }
	    @Override
	  	public Product insertProduct(Product product) throws ClassNotFoundException, SQLException{
	  		// TODO Auto-generated method stub
	  		return dao.insertProduct(product);
	  	}

	  	@Override
	  	public List<Product> displayProduct() throws ClassNotFoundException, SQLException{
	  		// TODO Auto-generated method stub
	  		return dao.displayProduct();
	  	}

	  	@Override
	  	public boolean deleteProduct(int proid) throws ClassNotFoundException, SQLException{
	  		// TODO Auto-generated method stub
	  		return dao.deleteProduct(proid);
	  	}

}
