package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

public class CommonDataDTO {

    List<CategoryDTO> categories = new ArrayList<>();

    List<ProductDTO> productBestSeller = new ArrayList<>();

    public List<CategoryDTO> getCategories(List<CategoryDTO> categoryDTO) {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public List<ProductDTO> getProductBestSeller() {
        return productBestSeller;
    }

    public void setProductBestSeller(List<ProductDTO> productBestSeller) {
        this.productBestSeller = productBestSeller;
    }
}
