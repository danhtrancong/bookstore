package com.bookstore.mapper;

import com.bookstore.dto.UserDTO;
import com.bookstore.entity.UserEntity;

public class UserMapper {

	public static UserDTO mapFromEntity(UserEntity c) {

		UserDTO userDTO = new UserDTO();
		userDTO.setEmail(c.getEmail());
		userDTO.setFullName(c.getFullName());
		userDTO.setPhoneNumber(c.getPhonNumber());
		return userDTO;
	}

	public static UserEntity mapFromUserDTO(UserDTO c) {

		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(c.getEmail());
		userEntity.setFullName(c.getFullName());
		userEntity.setPhonNumber(c.getPhoneNumber());
		userEntity.setPassword(c.getPassword());
		return userEntity;
	}

}
