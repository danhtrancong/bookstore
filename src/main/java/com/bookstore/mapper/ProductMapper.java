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
        product.setCategoryId(c.getCategory().getId());
        product.setLanguageId(c.getLanguage().getId());
        product.setImageUrl(c.getImageUrl());
        product.setOriginalPrice(c.getOriginalPrice());
        product.setSallingPrice(c.getSallingPrice());
        product.setSummary(c.getSummary());
        product.setBestSeller(c.getBestSeller());
        return product;
    }

    public static List<ProductDTO> mapFromEntities(List<ProductEntity> productEntities) {
        List<ProductDTO> productDTOs = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            ProductDTO productDTO = mapFromEntity(productEntity);
            productDTOs.add(productDTO);
        }
        return productDTOs;
    }

    public static ProductEntity mapFromDTO(ProductDTO c) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(c.getName());
        productEntity.setImageUrl(c.getImageUrl());
        productEntity.setOriginalPrice(c.getOriginalPrice());
        productEntity.setSallingPrice(c.getSallingPrice());
        productEntity.setSummary(c.getSummary());
        return productEntity;
    }
}
