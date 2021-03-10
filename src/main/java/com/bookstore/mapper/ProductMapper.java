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
		for (ProductEntity productEntity: productEntities) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(productEntity.getId());
			productDTO.setImageUrl(productEntity.getImageUrl());
			productDTO.setName(productEntity.getName());
			productsDTO.add(productDTO);
		}

		return productsDTO;
	}

}
