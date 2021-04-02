package com.bookstore.dao;

import com.bookstore.entity.CategoryEntity;

import java.util.List;

public interface CategoryDao {

    List<CategoryEntity> getAll();

    CategoryEntity getCategoryById(long categoryId);

    CategoryEntity getCategoryByName(String name);
}
