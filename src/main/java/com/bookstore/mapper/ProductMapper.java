package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LangBookDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;
import com.bookstore.entity.ProductEntity;

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

	public static ProductDTO mapFromEntity(ProductEntity c) {

		ProductDTO product = new ProductDTO();
		product.setId(c.getId());
		product.setName(c.getName());
		product.setCategory(c.getCategory());
		product.setLangbook(c.getLangbook());
		product.setImageUrl(c.getImageUrl());
		product.setOriginalPrice(c.getOriginalPrice());
		product.setSallingPrice(c.getSallingPrice());
        product.setDescription(c.getDescription());
		return product;
	}
}
