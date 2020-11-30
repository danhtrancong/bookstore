package com.bookstore.dao;

import java.util.List;

public interface GenericDao<T>
{
	T findOne(long id);

	List<T> findAll();

	T persist(T entity);

	T update(T entity);

	void delete(T entity);

	void deleteById(long entityId);
}
