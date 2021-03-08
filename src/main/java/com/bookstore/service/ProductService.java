package com.bookstore.service;

import com.bookstore.dto.ProductDTO;
import com.bookstore.dto.ProductsInfoDTO;
import com.bookstore.entity.ProductEntity;

import java.util.List;

public interface ProductService {
	List <ProductDTO> getAll();
	List <ProductEntity> getBestSellers();
	ProductDTO getProductById(long id);

	ProductsInfoDTO getProduct(Long categoryId);

}
