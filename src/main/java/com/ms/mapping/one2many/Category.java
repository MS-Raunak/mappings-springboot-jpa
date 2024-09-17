package com.ms.mapping.one2many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private int id;
	private String categoryName;
	/**
	 * mappedBy = "category": avoid to create extra table and create a foreign key in other side(children entity)
	 * cascade = CascadeType.ALL: whenever operation performed on Category, Product also get affected
	 * Operation like- save,delete,update etc..
	 */
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();
	
	public int getId() {
		return id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
