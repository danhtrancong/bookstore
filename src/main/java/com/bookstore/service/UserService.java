package com.bookstore.service;

import com.bookstore.dto.UserDTO;
import com.bookstore.entity.UserEntity;

public interface UserService {

	UserEntity findByEmail(String username);
	
	String createUser(UserDTO userDTO);
}
