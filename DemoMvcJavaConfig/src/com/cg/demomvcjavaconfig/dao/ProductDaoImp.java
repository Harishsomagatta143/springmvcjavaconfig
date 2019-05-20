package com.cg.demomvcjavaconfig.dao;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.demomvcjavaconfig.dto.Product;
@Repository
public class ProductDaoImp implements ProductDao{
@PersistenceContext
EntityManager entitymanager;
	//List<Product> myList = new ArrayList<>();
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		entitymanager.persist(product);
		entitymanager.flush();
		//myList.add(product);
		return product;
	}

	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		Query query=entitymanager.createQuery("FROM Product");
		List<Product> myList=query.getResultList();
		return myList;
	}

}
