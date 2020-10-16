package com.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.UserEntity;
import com.bookstore.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserEntity findByEmail(String username) {
		return userDao.findByEmail(username);
	}

}
