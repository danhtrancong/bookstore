package com.bookstore.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dao.LanguageDao;
import com.bookstore.dao.ProductDao;
import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.LanguageDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.dto.ProductListDTO;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;
import com.bookstore.entity.ProductEntity;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.ProductService;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private LanguageDao languageDao;

	@Autowired
	private ProductDao productDao;

	@Override
	public ProductListDTO getProduct() {
		List<CategoryEntity> categories = categoryDao.getCategories();
		List<LanguageEntity> languages = languageDao.getLanguages();
		List<ProductEntity> productsEntity = productDao.getProducts();
		ProductListDTO productDTO = new ProductListDTO();

//		List<CategoryDTO> categoriesDTO = categories.stream()
//				.map(categoryEntity -> ProductMapper.mapFromEntity(categoryEntity)).collect(Collectors.toList());

		List<CategoryDTO> categoriesDTO = categories.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());

		List<LanguageDTO> languagesDTO = languages.stream().map(ProductMapper::mapFromEntity)
				.collect(Collectors.toList());

		List<ProductDTO> products = productsEntity.stream().map(ProductMapper::mapFromEntity).collect(Collectors.toList());

		productDTO.getCategories().addAll(categoriesDTO);
		productDTO.getLanguages().addAll(languagesDTO);
		productDTO.getProducts().addAll(products);
		return productDTO;
	}

	@Override
	public ProductDTO getProductById(long id) {
		ProductEntity productDTO = productDao.getProductById(id);
		return ProductMapper.mapFromEntity(productDTO);
	}

}
