package com.ms.mapping.one2one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "adhars")
public class Adhar {
	@Id
	private int id;
	private long adharNum;
	private String city;
	private String state;
	private String country;
	private long pincode;
	
	/**
	 * @JoinColumn( name = "person_id"): changing default foreign key name
	 */
	@OneToOne
	@JoinColumn( name = "person_id")
	private Person person;
	
	public int getId() {
		return id;
	}
	public long getAdharNum() {
		return adharNum;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
