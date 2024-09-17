package com.ms.mapping.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	private int id;
	private String brand;
	private double price;
	
	@ManyToMany
	@JoinTable(
	        name = "prod_categ",
	        joinColumns = @JoinColumn(name = "p_id"),  // The column in the join table referencing the `Products` entity
	        inverseJoinColumns = @JoinColumn(name = "c_id")  // The column in the join table referencing the `Categories` entity
	    )
	List<Categories> categories = new ArrayList<Categories>();
	
	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public List<Categories> getCategories() {
		return categories;
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

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}
	
	
}
