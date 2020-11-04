package com.bookstore.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dao.AbstractDao;
import com.bookstore.dao.CategoryDao;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.ProductEntity;
import com.bookstore.entity.UserEntity;

@Repository("userDao")
@Transactional
public class CategoryDaoImpl extends AbstractDao<CategoryEntity> implements CategoryDao {

	@Override
	public List<CategoryEntity> getCategories() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserEntity> cq = cb.createQuery(UserEntity.class);
		return null;
	}

    

}
