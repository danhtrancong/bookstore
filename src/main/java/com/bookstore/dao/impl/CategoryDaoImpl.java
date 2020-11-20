package com.bookstore.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dao.AbstractDao;
import com.bookstore.dao.CategoryDao;
import com.bookstore.entity.CategoryEntity;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl extends AbstractDao<CategoryEntity> implements CategoryDao {

	static final Logger logger = LoggerFactory.getLogger(CategoryDaoImpl.class);

	@PostConstruct
	public void init() {
		super.setClazz(CategoryEntity.class);
	}

	@Override
	public List<CategoryEntity> getCategories() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<CategoryEntity> cq = cb.createQuery(CategoryEntity.class);
		Root<CategoryEntity> category = cq.from(CategoryEntity.class);
		cq.select(category);
		TypedQuery<CategoryEntity> query = em.createQuery(cq);
		List<CategoryEntity> categories = query.getResultList();
		return categories;
	}
	
	@Override
	public CategoryEntity getCategoryById(long id) {
		return findOne(id);
	}
}
