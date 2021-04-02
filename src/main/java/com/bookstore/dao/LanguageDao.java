package com.bookstore.dao;

import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;

import java.util.List;

public interface LanguageDao {

    List<LanguageEntity> getAll();

    LanguageEntity getLanguageByName(String language);

    LanguageEntity getLanguageById(long categoryId);
}
