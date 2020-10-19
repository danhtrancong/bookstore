package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.bookstore.entity.enumtype.UserType;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity{

	private UserType name;

	public UserType getName() {
		return name;
	}

	public void setName(UserType name) {
		this.name = name;
	}
}
