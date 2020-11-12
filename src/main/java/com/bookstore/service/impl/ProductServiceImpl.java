package com.bookstore.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dao.LangBookDao;
import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LangBookDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private LangBookDao langbookDao;

	@Override
	public ProductDTO getProduct() {
		ProductDTO product = new ProductDTO();

		List<CategoryEntity> categories = categoryDao.getCategories();
		List<CategoryDTO> categoryDTOs = categories.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());
		product.getCategories().addAll(categoryDTOs);

		List<LangBookEntity> langbooks = langbookDao.getLangBooks();
		List<LangBookDTO> langbookDTOs = langbooks.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());
		product.getLangbooks().addAll(langbookDTOs);

		return product;
	}
}