package com.exapmle.practice.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exapmle.practice.springmvc.model.Product;
@Controller
@RequestMapping("/ctrl2")
public class DemoController {
	/*@RequestMapping(value="/test")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("test1");
	}*/
	@RequestMapping(value="/test")
	public String test1(HttpServletResponse response,
			HttpServletRequest request) throws IOException{
		request.setAttribute("name", "Aravinthan");
		request.setAttribute("city", "Theni");
		return "test2";
	}
	
	
	@RequestMapping(value="/test3")
	public ModelAndView test3(HttpServletResponse response) throws IOException{
		List<Product> products = new ArrayList<>();
		products.add(new Product(1001,"Laptop",20,4500));
		products.add(new Product(1002,"mobiles",40,9500));
		products.add(new Product(1003,"chargers",50,450));
		products.add(new Product(1004,"earpods",10,200));
		
		return new ModelAndView("test3","products",products);
	}
}
