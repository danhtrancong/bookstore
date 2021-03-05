package com.bookstore.service;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> getAll();
}
