package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.entity.CategoryEntity;

public class ProductMapper {

	public static CategoryDTO mapFromEntity(CategoryEntity c) {

		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(c.getId());
		categoryDTO.setName(c.getName());

		return categoryDTO;
	}

}
