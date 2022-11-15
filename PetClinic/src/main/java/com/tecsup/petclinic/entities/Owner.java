package com.tecsup.petclinic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "owners")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_Name")
	private String firstName;
	@Column(name = "last_Name")
	private String lastName;
	private String address;
	private String city;
	private String telephone;
	
	public Owner() {
	}
	
	public Owner(long id, String first_Name, String last_Name, String address, String city, String telephone) {
		super();
		this.id = id;
		this.firstName = first_Name;
		this.lastName = last_Name;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}

	public Owner(String first_Name, String last_Name, String address, String city, String telephone) {
		super();
		this.firstName = first_Name;
		this.lastName = last_Name;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_Name) {
		this.firstName = first_Name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_Name) {
		this.lastName = last_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", telephone=" + telephone + "]";
	}

	
}
