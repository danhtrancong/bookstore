package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.entity.CategoryEntity;

public class ProductMapper {
	
	public static CategoryDTO mapFromEntity(CategoryEntity categoryEntity) {
		
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(categoryEntity.getId());
		categoryDTO.setName(categoryEntity.getName());
				
		return categoryDTO;
	}
}
