package com.bookstore.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.UserEntity;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dao.AbstractDao;
import com.bookstore.dao.ProductDao;
import com.bookstore.entity.ProductEntity;

@Repository("productDao")
@Transactional
public class ProductDaoImpl extends AbstractDao<ProductEntity> implements ProductDao {

	static final Logger logger = LoggerFactory.getLogger(ProductDaoImpl.class);

	@PostConstruct
	public void init() {
		super.setClazz(ProductEntity.class);
	}

	@Override
	public List<ProductEntity> getProducts() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ProductEntity> cq = cb.createQuery(ProductEntity.class);
		Root<ProductEntity> product = cq.from(ProductEntity.class);
		cq.select(product);
		TypedQuery<ProductEntity> query = em.createQuery(cq);
		List<ProductEntity> products = query.getResultList();
		return products;
	}

	@Override
	public List<ProductEntity> getBestSellers() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ProductEntity> cq = cb.createQuery(ProductEntity.class);
		Root<ProductEntity> productBestSeller = cq.from(ProductEntity.class);
		cq.select(productBestSeller);
		cq.where(cb.equal(productBestSeller.get("isBestSeller"), 1));
		TypedQuery<ProductEntity> query = em.createQuery(cq);
		List<ProductEntity> productsBestSellers = query.getResultList();
		return productsBestSellers;
	}

	@Override
	public ProductEntity save(ProductEntity productEntity) {
		return persist(productEntity);
	}

	@Override
	public ProductEntity getProductById(long id) {
		return findOne(id);
	}
	
}


