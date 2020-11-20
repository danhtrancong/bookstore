package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.ProductEntity;

public interface ProductDao {

	ProductEntity getProductById(long id);

	List<ProductEntity> getProducts();

}
