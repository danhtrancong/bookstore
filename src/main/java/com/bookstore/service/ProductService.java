package com.bookstore.service;

import com.bookstore.dto.ProductDTO;
import com.bookstore.dto.ProductsInfoDTO;
import com.bookstore.entity.ProductEntity;

import java.util.List;

public interface ProductService {
	List <ProductEntity> getBestSellings();
	ProductDTO getProductById(long id);
}
