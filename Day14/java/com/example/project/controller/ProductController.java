package com.example.project.controller;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.example.project.model.Product;
import com.example.project.service.*;

public class ProductController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Productservice service=new ProductserviceImpl();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Product ID : ");
		int proid=in.nextInt();
		System.out.println("Enter the Product Name : ");
		String proname=in.next();
		System.out.println("Enter the Product Price : ");
		double proprice=in.nextDouble();
		
		Product products=new Product(proid,proname,proprice);
        service.insertProduct(products);
		
		List<Product> posts = service.displayProduct();
		
		posts.forEach(System.out::println);

	}

}
