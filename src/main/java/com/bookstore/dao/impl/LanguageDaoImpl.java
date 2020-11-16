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
import com.bookstore.dao.LanguageDao;
import com.bookstore.entity.LanguageEntity;

@Repository("languageDao")
@Transactional
public class LanguageDaoImpl extends AbstractDao<LanguageEntity> implements LanguageDao {

	static final Logger logger = LoggerFactory.getLogger(LanguageDaoImpl.class);

	@PostConstruct
	public void init() {
		super.setClazz(LanguageEntity.class);
	}

	@Override
	public List<LanguageEntity> getLanguages() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<LanguageEntity> cq = cb.createQuery(LanguageEntity.class);
		Root<LanguageEntity> language = cq.from(LanguageEntity.class);
		cq.select(language);
		TypedQuery<LanguageEntity> query = em.createQuery(cq);
		List<LanguageEntity> categories = query.getResultList();
		return categories;
	}
}
