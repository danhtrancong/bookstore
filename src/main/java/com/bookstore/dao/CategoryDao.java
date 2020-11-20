package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.CategoryEntity;

public interface CategoryDao {

	List<CategoryEntity> getCategories();

	CategoryEntity getCategoryById(long categoryId);
}
