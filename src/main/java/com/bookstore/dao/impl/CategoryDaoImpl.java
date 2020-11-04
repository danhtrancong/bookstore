package com.bookstore.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import com.bookstore.dao.AbstractDao;
import com.bookstore.dao.CategoryDao;
import com.bookstore.entity.CategoryEntity;

public class CategoryDaoImpl extends AbstractDao<CategoryEntity> implements CategoryDao{

	@Override
	public List<CategoryEntity> getCategories() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		return null;
	}
	

}
