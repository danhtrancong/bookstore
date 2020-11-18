package com.bookstore.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dao.LangBookDao;
import com.bookstore.dao.ProductDao;
import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LangBookDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.dto.ProductListDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;
import com.bookstore.entity.ProductEntity;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private LangBookDao langbookDao;
	@Autowired
	private ProductDao productDao;

	@Override
	public ProductListDTO getProduct() {

		ProductListDTO productDTO = new ProductListDTO();

		List<CategoryEntity> categories = categoryDao.getCategories();
		List<LangBookEntity> langbooks = langbookDao.getLangBooks();
		List<ProductEntity> productsEntity = productDao.getProducts();

		List<CategoryDTO> categoryDTOs = categories.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());
		List<LangBookDTO> langbookDTOs = langbooks.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());
		List<ProductDTO> products = productsEntity.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());

		productDTO.getCategories().addAll(categoryDTOs);
		productDTO.getLangbooks().addAll(langbookDTOs);
		productDTO.getProducts().addAll(products);

		return productDTO;
	}

	@Override
	public ProductDTO getProductById(long id) {
		ProductEntity productDTO = productDao.getProductById(id);
		return ProductMapper.mapFromEntity(productDTO);

	}
}
