package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LangBookDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;

public class ProductMapper {

	public static CategoryDTO mapFromEntity(CategoryEntity categoryEntity) {

		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(categoryEntity.getId());
		categoryDTO.setName(categoryEntity.getName());

		return categoryDTO;
	}

	public static LangBookDTO mapFromEntity(LangBookEntity langbookEntity) {

		LangBookDTO langbookDTO = new LangBookDTO();
		langbookDTO.setId(langbookEntity.getId());
		langbookDTO.setName(langbookEntity.getName());

		return langbookDTO;
	}
}
