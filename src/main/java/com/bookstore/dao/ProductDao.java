package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.ProductEntity;

public interface ProductDao {

	List<ProductEntity> getProducts();
}
