package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.LangBookEntity;
import com.bookstore.entity.ProductEntity;

public interface ProductDao {
	List<ProductEntity> getProducts();
	ProductEntity getProductById(long id);
}
