package com.bookstore.dao.impl;

import com.bookstore.dao.AbstractDao;
import com.bookstore.dao.LanguageDao;
import com.bookstore.entity.LanguageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository("languageDao")
@Transactional
public class LanguageDaoImpl extends AbstractDao<LanguageEntity> implements LanguageDao {

    static final Logger logger = LoggerFactory.getLogger(LanguageDaoImpl.class);

    @PostConstruct
    public void init() {
        super.setClazz(LanguageEntity.class);
    }

    @Override
    public List<LanguageEntity> getAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<LanguageEntity> cq = cb.createQuery(LanguageEntity.class);
        Root<LanguageEntity> language = cq.from(LanguageEntity.class);
        cq.select(language);
        TypedQuery<LanguageEntity> query = em.createQuery(cq);
        List<LanguageEntity> languageEntityList = query.getResultList();
        return languageEntityList;
    }

    @Override
    public LanguageEntity getLanguageByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<LanguageEntity> cq = cb.createQuery(LanguageEntity.class);
        Root<LanguageEntity> language = cq.from(LanguageEntity.class);
        Predicate predicateId = cb.equal(language.get("name"), name);
        cq.select(language).where(predicateId);
        return em.createQuery(cq).getSingleResult();
    }


    @Override
    public LanguageEntity getLanguageById(long id) {
        return findOne(id);
    }

}
