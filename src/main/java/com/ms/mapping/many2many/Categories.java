package com.ms.mapping.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "categories")
	List<Products> products = new ArrayList<Products>();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	

}
