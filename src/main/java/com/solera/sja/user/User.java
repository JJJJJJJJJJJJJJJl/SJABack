package com.solera.sja.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "JoaoDanyTable")
public class User {
	@Id
	@Column(nullable = true)
	private int id;
	@Column(nullable = true, length = 25)
	private String firstName;
	@Column(nullable = true, length = 25)
	private String lastName;
	@Column(nullable = true, length = 20)
	private String phoneNumber;
	@Column(nullable = true, length = 25)
	private String email;
	
	protected User() {

	}
	
	public User(int id, String firstName, String lastName, String phoneNumber, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
