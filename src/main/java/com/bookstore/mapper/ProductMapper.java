package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LanguageDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;
import com.bookstore.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

	public static CategoryDTO mapFromEntity(CategoryEntity c) {

		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(c.getId());
		categoryDTO.setName(c.getName());
		return categoryDTO;
	}

	public static LanguageDTO mapFromEntity(LanguageEntity c) {

		LanguageDTO languageDTO = new LanguageDTO();
		languageDTO.setId(c.getId());
		languageDTO.setName(c.getName());
		return languageDTO;
	}

	public static ProductDTO mapFromEntity(ProductEntity c) {

		ProductDTO product = new ProductDTO();
		product.setId(c.getId());
		product.setName(c.getName());
		product.setCategory(c.getCategory().getName());
		product.setLanguage(c.getLanguage().getName());
		product.setImageUrl(c.getImageUrl());
		product.setOriginalPrice(c.getOriginalPrice());
		product.setSallingPrice(c.getSallingPrice());
		product.setSummary(c.getSummary());
		return product;
	}

	public static List<ProductDTO> mapFromEntities(List<ProductEntity> productEntities) {
		List<ProductDTO> productsDTO = new ArrayList<>();
		for (ProductEntity category: productEntities) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(category.getId());
			productDTO.setName(category.getName());
			productsDTO.add(productDTO);
		}

		return productsDTO;
	}

}
