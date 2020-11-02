package com.bookstore.service;

import com.bookstore.entity.UserEntity;

public interface UserService {

	UserEntity findByEmail(String username);

}
