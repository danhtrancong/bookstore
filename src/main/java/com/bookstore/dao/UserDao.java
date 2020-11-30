package com.bookstore.dao;

import com.bookstore.entity.UserEntity;

public interface UserDao {

	UserEntity findByEmail(String email);
	
	UserEntity save(UserEntity user);
}
