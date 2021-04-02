package com.bookstore.mapper;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.entity.CategoryEntity;

public class CategoryMapper {

	public static CategoryDTO mapFromEntity(CategoryEntity c) {

		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(c.getId());
		categoryDTO.setName(c.getName());
		return categoryDTO;
	}

	public static List<CategoryDTO> mapFromEntities(List<CategoryEntity> categoryEntities) {
		List<CategoryDTO> categoryDTOs = new ArrayList<>();
		for (CategoryEntity category: categoryEntities) {
			categoryDTOs.add(mapFromEntity(category));
		}

		return categoryDTOs;
	}

}
