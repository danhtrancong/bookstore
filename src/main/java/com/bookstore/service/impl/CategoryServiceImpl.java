package com.bookstore.service.impl;


import com.bookstore.dao.CategoryDao;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<CategoryEntity> getAll() {

        return categoryDao.getAll();
    }
}
