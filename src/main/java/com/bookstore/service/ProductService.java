package com.bookstore.service;

import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.ProductEntity;
import com.bookstore.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getBestSellings();

    List<ProductEntity> getAll();

    ProductEntity getProductById(long id);

    ProductEntity saveProduct(ProductEntity product, long category, long language) throws NotFoundException;
}
