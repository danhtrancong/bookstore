package com.bookstore.service;

import com.bookstore.dto.ProductDTO;
import com.bookstore.dto.ProductListDTO;

public interface ProductService {

	ProductListDTO getProduct();
    ProductDTO getProductById(long id);

}
