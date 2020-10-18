package com.bookstore.dao.impl;

import com.bookstore.dao.AbstractDao;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends AbstractDao<UserEntity> implements UserDao {

    static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @PostConstruct
    public void init() {
        super.setClazz(UserEntity.class);
    }

    @Override
    public UserEntity findByEmail(String email) {
        logger.info("Email : {}", email);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserEntity> cq = cb.createQuery(UserEntity.class);
        Root<UserEntity> user = cq.from(UserEntity.class);
        cq.select(user);
        cq.where(cb.equal(user.get("email"), email));
        TypedQuery<UserEntity> query = em.createQuery(cq);

        List<UserEntity> users = query.getResultList();
        if (users == null || users.isEmpty()) {
            return new UserEntity();
        }

        return users.get(0);
    }

}
