package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

public class CommonDataDTO {
    List<CategoryDTO> categories = new ArrayList<>();
    List<ProductDTO> bestSellingProducts = new ArrayList<>();

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public List<ProductDTO> getBestSellingProducts() {
        return bestSellingProducts;
    }

    public void setBestSellingProducts(List<ProductDTO> bestSellingProducts) {
        this.bestSellingProducts = bestSellingProducts;
    }
}
