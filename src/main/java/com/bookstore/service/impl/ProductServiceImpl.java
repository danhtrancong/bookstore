package com.bookstore.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.ProductService;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public ProductDTO getProduct() {
		List<CategoryEntity> categories = categoryDao.getCategories();
		ProductDTO product = new ProductDTO();

//		List<CategoryDTO> categoriesDTO = categories.stream()
//				.map(categoryEntity -> ProductMapper.mapFromEntity(categoryEntity)).collect(Collectors.toList());

		List<CategoryDTO> categoriesDTO = categories.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());

		product.getCategories().addAll(categoriesDTO);
		return product;
	}

}
