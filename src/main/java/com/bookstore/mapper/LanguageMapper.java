package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LanguageDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;

import java.util.ArrayList;
import java.util.List;

public class LanguageMapper {

	public static LanguageDTO mapFromEntity(LanguageEntity l) {

		LanguageDTO languageDTO = new LanguageDTO();
		languageDTO.setId(l.getId());
		languageDTO.setName(l.getName());
		return languageDTO;
	}

	public static List<LanguageDTO> mapFromEntities(List<LanguageEntity> languageEntities) {
		List<LanguageDTO> languageDTOs = new ArrayList<>();
		for (LanguageEntity language: languageEntities) {
			languageDTOs.add(mapFromEntity(language));
		}

		return languageDTOs;
	}

}
