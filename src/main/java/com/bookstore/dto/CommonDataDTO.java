package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

public class CommonDataDTO {
    List<CategoryDTO> categories = new ArrayList<>();
    List<ProductDTO> bestSellerProducts = new ArrayList<>();
    List<ProductDTO> products = new ArrayList<>();

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public List<ProductDTO> getBestSellerProducts() {
        return bestSellerProducts;
    }

    public void setBestSellerProducts(List<ProductDTO> bestSellerProducts) {
        this.bestSellerProducts = bestSellerProducts;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}
