package com.bookstore.dao.impl;

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
import com.bookstore.dao.RoleDao;
import com.bookstore.entity.RoleEntity;
import com.bookstore.entity.enumtype.UserType;

@Repository("roleDao")
@Transactional
public class RoleDaoImpl extends AbstractDao<RoleEntity> implements RoleDao {

	static final Logger logger = LoggerFactory.getLogger(RoleDaoImpl.class);

	@PostConstruct
	public void init() {
		super.setClazz(RoleEntity.class);
	}

	@Override
	public RoleEntity getRoleByName(String roleName) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<RoleEntity> cq = cb.createQuery(RoleEntity.class);
		Root<RoleEntity> root = cq.from(RoleEntity.class);
		cq.select(root);
		cq.where(cb.equal(root.get("name"), UserType.valueOf(roleName)));
		TypedQuery<RoleEntity> query = em.createQuery(cq);
		RoleEntity role = query.getSingleResult();
		return role;
	}

}
