package com.ms.mapping.many2one;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class College {
	@Id
	private int id;
	private String name;
	private String clgType;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getClgType() {
		return clgType;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClgType(String clgType) {
		this.clgType = clgType;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	
	
	
}
