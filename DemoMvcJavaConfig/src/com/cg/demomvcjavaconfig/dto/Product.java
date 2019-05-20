package com.cg.demomvcjavaconfig.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_mvc")
public class Product 
{
	@Id
	@Column(name="prod_id")
	private Integer id;
	@Column(name="prod_name")
	private String name;
	@Column(name="prod_description")
	private String description;
	@Column(name="prod_category")
	private String category;
	@Column(name="prod_price")
	private Double price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	
	
	public Product(Integer id, String name, String description, String category, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", price=" + price + "]";
	}




}
