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

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public ProductDTO getProduct() {
		List<CategoryEntity> categories = categoryDao.getCategories();
		ProductDTO product = new ProductDTO();

//		List<CategoryDTO> categoryDTOs = new ArrayList<>();
//		for (CategoryEntity categoryEntity : categories) {
//			// CategoryDTO categoryDTO = ProductMapper.mapFromEntity(categoryEntity) ;
//			categoryDTOs.add(ProductMapper.mapFromEntity(categoryEntity));
//		}

		List<CategoryDTO> categoryDTOs = categories.stream().map(ProductMapper::mapFromEntity).collect(Collectors.toList());
		product.getCategories().addAll(categoryDTOs);
		return product;
	}
}