package com.bookstore.service;

import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;

import java.util.List;

public interface LanguageService {
    List<LanguageEntity> getAll();
    LanguageEntity getLanguageByName(String name);
}
