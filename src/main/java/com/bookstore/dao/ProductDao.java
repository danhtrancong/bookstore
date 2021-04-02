package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.ProductEntity;
import com.bookstore.entity.UserEntity;

public interface ProductDao {

	ProductEntity getProductById(long id);

	List<ProductEntity> getProducts();

	List<ProductEntity> getBestSellers();

	ProductEntity save(ProductEntity productEntity);

}
