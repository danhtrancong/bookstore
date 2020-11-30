package com.bookstore.dao;

import com.bookstore.entity.RoleEntity;

public interface RoleDao {

	RoleEntity getRoleByName(String role);
}
