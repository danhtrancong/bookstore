package com.bookstore.service.impl;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dao.LanguageDao;
import com.bookstore.dao.ProductDao;
import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;
import com.bookstore.entity.ProductEntity;
import com.bookstore.exceptions.NotFoundException;
import com.bookstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private LanguageDao languageDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductEntity getProductById(long id) {
        ProductEntity productEntity = productDao.getProductById(id);
        return productEntity;
    }

    @Override
    public List<ProductEntity> getBestSellings() {
        return productDao.getBestSellings();
    }

    @Override
    public List<ProductEntity> getAll() {
        return productDao.getAll();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product, long category, long language) throws NotFoundException {

        CategoryEntity categoryEntity = categoryDao.getCategoryById(category);

        LanguageEntity languageEntity = languageDao.getLanguageById(language);

        if (categoryEntity == null) {
            throw new NotFoundException(String.format("The category with name [%s] not found", category));
        }

        if (languageEntity == null) {
            throw new NotFoundException(String.format("The language with name [%s] not found", language));
        }

        product.setCategory(categoryEntity);
        product.setLanguage(languageEntity);

        return productDao.saveProduct(product);
    }

}
