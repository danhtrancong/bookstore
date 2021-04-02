package com.bookstore.service.impl;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dao.LanguageDao;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;
import com.bookstore.service.CategoryService;
import com.bookstore.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("languageService")
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageDao languageDao;

    @Override
    public List<LanguageEntity> getAll() {
        return languageDao.getAll();
    }

    @Override
    public LanguageEntity getLanguageByName(String name) {
        return languageDao.getLanguageByName(name);
    }

}
