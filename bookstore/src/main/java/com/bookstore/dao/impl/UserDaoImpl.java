package com.bookstore.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.bookstore.dao.AbstractDao;
import com.bookstore.dao.UserDao;
import com.bookstore.entity.UserEntity;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, UserEntity> implements UserDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	@Override
	public UserEntity findByEmail(String email) {
		logger.info("Email : {}", email);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("email", email));
		UserEntity user = (UserEntity) crit.uniqueResult();
		if (user != null) {
			Hibernate.initialize(user.getEmail());
		}
		return user;
	}

}
