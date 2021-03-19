package com.bookstore.dao;

import com.bookstore.entity.ProductEntity;

import java.util.List;

public interface ProductDao {

    ProductEntity getProductById(long id);

    List<ProductEntity> getAll();

    List<ProductEntity> getBestSellings();
}
