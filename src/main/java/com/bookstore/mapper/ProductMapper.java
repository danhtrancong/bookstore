package com.bookstore.mapper;

import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public static ProductDTO mapFromEntity(ProductEntity c) {

        ProductDTO product = new ProductDTO();
        product.setId(c.getId());
        product.setName(c.getName());
        product.setCategory(c.getCategory().getName());
        product.setLanguage(c.getLanguage().getName());
        product.setImageUrl(c.getImageUrl());
        product.setOriginalPrice(c.getOriginalPrice());
        product.setSallingPrice(c.getSallingPrice());
        product.setSummary(c.getSummary());
        return product;
    }

    public static List<ProductDTO> mapFromEntities(List<ProductEntity> productEntities) {
        List<ProductDTO> productDTOs = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            productDTOs.add(mapFromEntity(productEntity));
        }

        return productDTOs;
    }

}
