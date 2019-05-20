package com.cg.demomvcjavaconfig.service;

import java.util.List;

import com.cg.demomvcjavaconfig.dto.Product;



public interface ProductService {
	public Product addProduct(Product product);
	public List<Product> showProduct();
}
