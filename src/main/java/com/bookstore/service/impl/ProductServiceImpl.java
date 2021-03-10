package com.bookstore.service.impl;

import com.bookstore.dao.CategoryDao;
import com.bookstore.dao.LanguageDao;
import com.bookstore.dao.ProductDao;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.ProductEntity;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ProductDTO getProductById(long id) {
        ProductEntity productDTO = productDao.getProductById(id);
        return ProductMapper.mapFromEntity(productDTO);
    }

    @Override
    public List<ProductEntity> getBestSellings() {
        return productDao.getBestSellings();
    }

}
