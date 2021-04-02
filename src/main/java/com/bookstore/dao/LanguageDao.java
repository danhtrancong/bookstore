package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.LanguageEntity;

public interface LanguageDao {

	List<LanguageEntity> getLanguages();

	LanguageEntity getLanguagesByName(String nameLanguage);
	LanguageEntity getLanguagesById(Long languageId);
}
