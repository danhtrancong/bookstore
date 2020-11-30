package com.bookstore.service.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bookstore.dao.RoleDao;
import com.bookstore.dao.UserDao;
import com.bookstore.dto.UserDTO;
import com.bookstore.entity.UserEntity;
import com.bookstore.mapper.UserMapper;
import com.bookstore.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@Override
	public UserEntity findByEmail(String username) {
		return userDao.findByEmail(username);
	}

	@Override
	public String createUser(UserDTO userDTO) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodingPW = encoder.encode(userDTO.getPassword());
		userDTO.setPassword(encodingPW);

		UserEntity user = UserMapper.mapFromUserDTO(userDTO);
		user.getRoles().add(roleDao.getRoleByName("CUSTOMER"));
		user.setCreatedDate(Calendar.getInstance());
		user.setUpdatedDate(Calendar.getInstance());
		userDao.save(user);
		return user.getEmail();

	}

}
