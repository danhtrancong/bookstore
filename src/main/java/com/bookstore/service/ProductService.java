package com.bookstore.service;

import com.bookstore.dto.ProductDTO;
import com.bookstore.dto.ProductsInfoDTO;

public interface ProductService {

	ProductDTO getProductById(long id);

	ProductsInfoDTO getProduct(Long categoryId);

	ProductDTO getProductsBestSeller (boolean isBestSeller);

}
