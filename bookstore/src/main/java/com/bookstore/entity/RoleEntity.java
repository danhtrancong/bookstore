package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.bookstore.entity.enumtype.UserType;

@Entity
@Table(name = "role")
public class RoleEntity {

	private Long id;

	private UserType name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserType getName() {
		return name;
	}

	public void setName(UserType name) {
		this.name = name;
	}
}
