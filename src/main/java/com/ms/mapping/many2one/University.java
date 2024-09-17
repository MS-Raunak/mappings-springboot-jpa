package com.ms.mapping.many2one;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class University {
	@Id
	private int id;
	private String name;
	private String regNo;
	
	@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
	List<College> colleges = new ArrayList<College>();
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public List<College> getColleges() {
		return colleges;
	}
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	
	
	
}
