package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.bookstore.entity.enumtype.UserType;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "phone_number")
	private int phonNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(name = "user_type")
	private UserType userType;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(int phonNumber) {
		this.phonNumber = phonNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
