package com.ms.mapping.one2one;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
	@Id
	private int id;
	private String name;
	private String mobile;
	
	/**
	 * mappedBy: used to avoid to creating foregin key from both side
	 * cascade = CascadeType.ALL: whenever operation performed on parent entity, child entity will get affected
	 * EX: whenever save operation performed on PERSON entity, ADHAR will be saved as well.
	 */
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Adhar adhar;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	
	
	
	
}
