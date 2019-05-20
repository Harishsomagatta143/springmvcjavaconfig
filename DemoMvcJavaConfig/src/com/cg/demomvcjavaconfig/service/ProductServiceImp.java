package com.cg.demomvcjavaconfig.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demomvcjavaconfig.dao.ProductDao;
import com.cg.demomvcjavaconfig.dto.Product;
@Service
@Transactional
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductDao productDao;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.saveProduct(product);
	}

	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productDao.showProduct();
	}

}
