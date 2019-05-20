package com.cg.demomvcjavaconfig.dao;

import java.util.List;

import com.cg.demomvcjavaconfig.dto.Product;


public interface ProductDao {

	public Product saveProduct(Product product);
	public List<Product> showProduct();
	
}
