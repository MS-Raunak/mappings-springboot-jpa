package com.ms.mapping.one2many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private int id;
	private String brand;
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "categ_id")
	private Category category;
	

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	

}
