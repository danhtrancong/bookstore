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
import com.bookstore.dao.LangBookDao;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;

@Repository("langBookDao")
@Transactional
public class LangBookDaoImpl extends AbstractDao<LangBookEntity> implements LangBookDao {

	static final Logger logger = LoggerFactory.getLogger(LangBookDaoImpl.class);

	@PostConstruct
	public void init() {
		super.setClazz(LangBookEntity.class);
	}

	@Override
	public List<LangBookEntity> getLangBooks() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<LangBookEntity> cq = cb.createQuery(LangBookEntity.class);
		Root<LangBookEntity> langbook = cq.from(LangBookEntity.class);
		cq.select(langbook);
		TypedQuery<LangBookEntity> query = em.createQuery(cq);
		List<LangBookEntity> langbooks = query.getResultList();
		return langbooks;
	}
}
